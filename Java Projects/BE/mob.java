
//2:Database Connection:

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection
{
	static Connection con;

	static
	{
        try
       	{
       	   Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException ex)
		{
            	Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
       	}
	}

	public static Connection getConn()
	{
       	try
       	{
           	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pdfreader", "root", "password");
       	}
       	catch (SQLException ex)
       	{
           	Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
       	}

       	return  con;
	}
}


//3:Pdf To Image Conversion:

public static int convert(String imageHome,String pdf)
{

		File file = new File(pdf);
		int num = 0;
		new File(imageHome).mkdir();
		RandomAccessFile raf;
		try
		{
			raf = new RandomAccessFile(file, "r");

			FileChannel channel = raf.getChannel();
			ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
			PDFFile pdffile = new PDFFile(buf);
			// draw the first page to an image
			num=pdffile.getNumPages();
			for(int i=1;i<=num;i++)
			{
				PDFPage page = pdffile.getPage(i);

				//get the width and height for the doc at the default zoom
				int width=(int)page.getBBox().getWidth();
				int height=(int)page.getBBox().getHeight();

				Rectangle rect = new Rectangle(0,0,width,height);
				int rotation=page.getRotation();
				Rectangle rect1=rect;
				if(rotation==90 || rotation==270)
					rect1=new Rectangle(0,0,rect.height,rect.width);

				//generate the image
				BufferedImage img = (BufferedImage)page.getImage(							rect.width, rect.height, //width & height
							rect1, // clip rect
						null, // null for the ImageObserver
							true, // fill background with white
							true  // block until drawing is done
					);

				ImageIO.write(img, "png", new File(imageHome+"/"+(i-1)+".png"));
				System.out.println(imageHome+(i-1)+".png");
			}
		}
		catch (Exception e1)
		{
			System.out.println(e1);
		}

		return num;
	}
}

//4:Doc to Pdf  and Ppt to Pdf convertion:

	public boolean toPdf(String src)
	{
		 try
		 {
	            File inputFile = new File(src);
	            File outputFile = new File(src.substring(0,src.lastIndexOf("."))+".pdf");
	            // connect to an OpenOffice.org instance running on port 8100
	            OpenOfficeConnection connection = new SocketOpenOfficeConnection(8100);
	            connection.connect();
	            // convert
	            // convert
	            DocumentConverter converter = new OpenOfficeDocumentConverter(connection);
	            converter.convert(inputFile, outputFile);
	            // close the connection
	            connection.disconnect();
	      }
	      catch (Exception ex)
	      {
	          System.out.println(ex);
	      }

		return false;

	}

//5:FileBrowser:

    public void showFileBrowser(int userId)
    {
         boolean isAPIAvailable = false;
         this.userId=userId;
   	    if (System.getProperty("microedition.io.file.FileConnection.version") != null)
        {
            isAPIAvailable = true;
            System.out.println("hi");
            try
            {


                showCurrDir();
                System.out.println("h5");
            }
            catch (SecurityException e)
            {
                System.out.println(e);
            }
            catch (Exception e)
            {
				System.out.println(e);
            }
        }
        else
        {
            StringBuffer splashText = new StringBuffer
            (getAppProperty("MIDlet-Name")).append("\n").append(
            getAppProperty("MIDlet-Vendor")).
            append(isAPIAvailable?"":"\nFileConnection API not available");
            showAlert(splashText.toString()+"ss");
        }

    }

  public void showAlert(String msg)
  {
        Alert alert =new Alert("Info",msg,null,null);
        alert.setTimeout(Alert.FOREVER);

        Display.getDisplay(this).setCurrent(alert);
  }

  void showCurrDir()
  {
        Enumeration e;
        FileConnection currDir = null;
        List browser;
        try
        {
            System.out.println("In showCurrDir");
            System.out.println("mega_root:"+MEGA_ROOT+"cur_dir:"+currDirName);
            if (MEGA_ROOT.equals(currDirName))
            {
                e = FileSystemRegistry.listRoots();
                browser = new List(currDirName, List.IMPLICIT);
                System.out.println("here");
            }
            else
            {
                System.out.println("connector");
                currDir = (FileConnection)Connector.open("file://localhost/" + currDirName);
                System.out.println("curr_dir:"+currDir);
                //currDir = (FileConnection)Connector.open("http://localhost:8080/" + currDirName);
                e = currDir.list();
                browser = new List( currDirName, List.IMPLICIT);
                browser.append(UP_DIRECTORY,null);
            }
            while (e.hasMoreElements())
            {
                System.out.println("h2");
                String fileName = (String)e.nextElement();
                System.out.println("fileName:"+fileName+" char_at:"+fileName.charAt(fileName.length()-1));

                if (fileName.charAt(fileName.length()-1) == SEP)
                {
                    browser.append(fileName,null);

                }
                //if((fileName.charAt(fileName.length()-1))).equals("g"))){}
                else
                {
                    System.out.println("h4");
                    //Image image = Image.createImage(fileName);
                    browser.append(fileName,null);
                    //Form form = new Form("Image here");

                    //form.append(image);
                }
            }
            browser.setSelectCommand(view);
            browser.addCommand(exit);
            browser.setCommandListener(this);
            if (currDir != null)
            {
                currDir.close();
            }
            Display.getDisplay(this).setCurrent(browser);
        }
        catch (IOException ioe)
        {
            System.out.println(ioe);
        }
    }

    void traverseDirectory(String fileName)
    {
        System.out.println("fileName:"+fileName+"cur_dir:"+currDirName+"mega_root:"+MEGA_ROOT);
        if (currDirName.equals(MEGA_ROOT))
        {
            if (fileName.equals(UP_DIRECTORY))
            {
                // can not go up from MEGA_ROOT
                return;
            }
            currDirName = fileName;
        }
        else if (fileName.equals(UP_DIRECTORY))
        {
            System.out.println("up");
            // Go up one directory
            // TODO use setFileConnection when implemented
            int i = currDirName.lastIndexOf(SEP, currDirName.length()-2);
            if (i != -1)
            {
                currDirName = currDirName.substring(0, i+1);
            }
            else
            {
                currDirName = MEGA_ROOT;
            }
        }
        else
        {
            currDirName = currDirName + fileName;
        }
        showCurrDir();
    }

	//1:UploadFiles:
	public static void showFile(String fileName)
	    {
	        String Message="Upload Successful";
	        try
	        {
	            FileConnection fc = (FileConnection)
	            Connector.open("file://localhost/" + currDirName + fileName);

	           if(fileName.endsWith(".doc") || fileName.endsWith(".docx") || fileName.endsWith(".pptx") || fileName.endsWith(".ppt")){
	            if (!fc.exists())
	            {
	                throw new IOException("File does not exists");
	            }
	            InputStream fin = fc.openInputStream();
	            //byte[] b = new byte[1024];
	            //int length = fis.read(b, 0, 1024);

	                HttpConnection c = (HttpConnection) Connector.open("http://"+serverIp+":8080/PDFReaderServer/PDFUploader?userId="+userId+"&fileName="+fileName);
	                c.setRequestProperty("User-Agent", "Profile/MIDP-1.0, Configuration/CLDC-1.0");
	                c.setRequestProperty("Content-Language", "en-US");
	                c.setRequestProperty("Content-Type", "multipart/form-data; boundary=---------------------------4664151417711");
	                //c.setRequestProperty("Content-Length", "355");
	                c.setRequestMethod(HttpConnection.POST);
	                DataOutputStream os = (DataOutputStream) c.openDataOutputStream();


	                int n=0,ci;
	                byte b[]=new byte[1000];
	                while((ci=fin.read(b))!=-1)
	                {
	                	System.out.println(b);
	                	os.write(b,0,ci);
	               		// n++;
	                }

	                os.flush();
	                os.close();
	                fin.close();
	                fc.close();
	            }
	            else
	            {
	                Message="File Format Not Supported";
	            }

	            TextBox tb = new TextBox("Upload File: " + fileName, Message, 1024,
	            TextField.ANY | TextField.UNEDITABLE);

	            tb.addCommand(back);
	            tb.addCommand(exit);
	            tb.setCommandListener(this);

	            Display.getDisplay(this).setCurrent(tb);
	        }
	        catch (Exception e) {}
    }

 class mob
 {
		public static void main(String args[])
		{
			new DBConnection();
		}
}

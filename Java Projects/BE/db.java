

Show Files:
void showFile(String fileName)
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
                while((ci=fin.read(b))!=-1){
                System.out.println(b);
                os.write(b,0,ci);
               // n++;
                }

                os.flush();
                os.close();
                fin.close();
                fc.close();
            }else{
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



Database Connection:

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
static Connection con;

static{
        try {
           Class.forName("com.mysql.jdbc.Driver"); 

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public static Connection getConn(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pdfreader", "root", "password");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return  con;
}
}

File To Image Conversion:

public static int convert(String imageHome,String pdf) {
		
		File file = new File(pdf);
		int num = 0;
		new File(imageHome).mkdir();
		RandomAccessFile raf;
		try {
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
				BufferedImage img = (BufferedImage)page.getImage(
							rect.width, rect.height, //width & height
							rect1, // clip rect
							null, // null for the ImageObserver
							true, // fill background with white
							true  // block until drawing is done
					);

				ImageIO.write(img, "png", new File(imageHome+"/"+(i-1)+".png"));
				System.out.println(imageHome+(i-1)+".png");
			}
		}
		catch (Exception e1) {
			System.out.println(e1);
		}
		
		return num;
	}
}


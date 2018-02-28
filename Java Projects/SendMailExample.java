import java.net.Socket;
import java.net.InetAddress;
import java.net.UnknownHostException;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.reflect.*;
import javax.swing.plaf.*;
import javax.swing.border.*;



public class SendMailExample extends JFrame {
	JLabel jLabel6  = new JLabel();
  	Button btnExit = new Button();

  Icon picture_email = new ImageIcon("foto.jpg");
  JPanel jPanel1 = new JPanel();
  Button btSend = new Button();
  JLabel jLabel1 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JTextField txtFrom = new JTextField();
  JTextField txtTo   = new JTextField();
  JTextField txtSubject = new JTextField();
  JTextField txtServer  = new JTextField();
  JScrollPane jScrollPane1 = new JScrollPane();
  JEditorPane edtMessage   = new JEditorPane();

  JLabel jLabel7 = new JLabel(picture_email);
  Border border7;

  Button clearButton = new Button();

  private void initialize() {
    try {
      border7 = new EtchedBorder(EtchedBorder.RAISED,Color.white,new Color(134, 134, 134));
      this.setSize(new Dimension(601, 426));
    jPanel1.setLayout(null);
    btSend.setBounds(new Rectangle(7, 362, 170, 30));
      btSend.setFont(new java.awt.Font("DialogInput", 1, 15));
    btSend.setLabel("Send Email::.. ");
    btSend.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btSend_actionPerformed(e);
      }
    });
    clearButton.addActionListener(new java.awt.event.ActionListener(){
      public void actionPerformed(ActionEvent e){
          edtMessage.setText("");
        }
    });
    jLabel1.setBackground(Color.white);
      jLabel1.setFont(new java.awt.Font("Dialog", 1, 12));
      jLabel1.setForeground(Color.red);
      jLabel1.setDisplayedMnemonic('0');
      jLabel1.setText("To:");
    jLabel1.setBounds(new Rectangle(10, 14, 44, 19));
    jLabel4.setBounds(new Rectangle(9, 80, 52, 19));
    jLabel4.setBackground(Color.black);
      jLabel4.setFont(new java.awt.Font("Dialog", 1, 12));
      jLabel4.setForeground(Color.red);
      jLabel4.setDisplayedMnemonic('0');
      jLabel4.setText("Subject:");
    jLabel3.setBounds(new Rectangle(9, 57, 47, 19));
    jLabel3.setBackground(Color.black);
      jLabel3.setFont(new java.awt.Font("Dialog", 1, 12));
      jLabel3.setForeground(Color.red);
      jLabel3.setDisplayedMnemonic('0');
      jLabel3.setText("Server:");
    jLabel2.setBackground(Color.black);
      jLabel2.setFont(new java.awt.Font("Dialog", 1, 12));
      jLabel2.setForeground(Color.red);
      jLabel2.setDisplayedMnemonic('0');
      jLabel2.setText("From:");
    jLabel2.setBounds(new Rectangle(10, 36, 41, 17));
    jLabel5.setBackground(Color.black);
      jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14));
      jLabel5.setForeground(Color.orange);
      jLabel5.setDisplayedMnemonic('0');
      jLabel5.setText("Message Box ");
    jLabel5.setBounds(new Rectangle(8, 106, 104, 19));
    txtFrom.setBackground(Color.black);
      txtFrom.setForeground(Color.green);
      txtFrom.setToolTipText("Your name or your address");
      txtFrom.setCaretColor(Color.red);
      txtFrom.setSelectedTextColor(Color.blue);
      txtFrom.setSelectionColor(Color.gray);
    txtFrom.setText("");
    txtFrom.setBounds(new Rectangle(63, 35, 296, 20));
    txtTo.setBackground(Color.black);
      txtTo.setForeground(Color.green);
      txtTo.setToolTipText("Who receive your email");
      txtTo.setCaretColor(Color.red);
      txtTo.setSelectedTextColor(Color.blue);
      txtTo.setSelectionColor(Color.gray);
    txtTo.setText("");
    txtTo.setBounds(new Rectangle(63, 13, 296, 20));
    txtSubject.setBounds(new Rectangle(63, 79, 296, 20));
    txtSubject.setBackground(Color.black);
      txtSubject.setForeground(Color.green);
      txtSubject.setToolTipText("Subiectul email-ului.");
      txtSubject.setCaretColor(Color.red);
      txtSubject.setSelectedTextColor(Color.blue);
      txtSubject.setSelectionColor(Color.gray);
    txtSubject.setText("");
    txtServer.setBounds(new Rectangle(63, 57, 296, 20));
    txtServer.setBackground(Color.black);
      txtServer.setForeground(Color.green);
      txtServer.setToolTipText("Host Address for sending email");
      txtServer.setCaretColor(Color.red);
      txtServer.setSelectedTextColor(Color.blue);
      txtServer.setSelectionColor(Color.gray);
    txtServer.setText("HERCULE.UTCLUJ.RO");
    jScrollPane1.setBorder(border7);
      jScrollPane1.setBounds(new Rectangle(7, 129, 509, 228));
    edtMessage.setBackground(SystemColor.info);
      edtMessage.setNextFocusableComponent(this);
      edtMessage.setToolTipText("Write the body of your email");
      edtMessage.setCaretColor(SystemColor.textHighlight);
      edtMessage.setDisabledTextColor(Color.lightGray);
      edtMessage.setSelectedTextColor(Color.blue);
      edtMessage.setSelectionColor(Color.gray);

    /////////////////////

    btnExit.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(ActionEvent e) {
        btnExit_actionPerformed(e);
      }
    });
    btnExit.setLabel(" ..::Exit");
    btnExit.setBounds(new Rectangle(344, 362, 172, 30));
      btnExit.setFont(new java.awt.Font("DialogInput", 1, 15));

///////////////////////
      jLabel7.setBackground(Color.black);
      jLabel7.setToolTipText("Send email application");
      jLabel7.setText("");
      jLabel7.setBounds(new Rectangle(371, 10, 142, 103));

      jPanel1.setBackground(Color.black);
      jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
      clearButton.setFont(new java.awt.Font("DialogInput", 1, 14));
      clearButton.setLabel("Clear Text");
      clearButton.setBounds(new Rectangle(188, 362, 147, 30));
      this.getContentPane().add(jPanel1, BorderLayout.CENTER);
      jPanel1.add(jScrollPane1, null);

///////////////////////
      jPanel1.add(jLabel6, null);
      jPanel1.add(jLabel5, null);
      jPanel1.add(btSend,  null);
      jPanel1.add(txtTo,   null);
      jPanel1.add(txtFrom, null);
      jPanel1.add(txtServer, null);
      jPanel1.add(txtSubject, null);
      jPanel1.add(btnExit, null);
      jPanel1.add(jLabel7, null);
      jPanel1.add(clearButton, null);
      jPanel1.add(jLabel4, null);
      jPanel1.add(jLabel3, null);
      jPanel1.add(jLabel2, null);
      jPanel1.add(jLabel1, null);
	/////////////
    jScrollPane1.getViewport().add(edtMessage, null);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

void btSend_actionPerformed(ActionEvent e) {
        //   	Container cp1 = getContentPane();
		boolean eroare = false;
		String errMessage = "Ok!";

      	try
      	{
      		SendMail aSendMail = new SendMail(txtServer.getText(),25);
       	/**
		Turn terminal echo on, default is off.
	**/
        	aSendMail.setEcho(true);
	/**
		Set the sender address, i.e your email address.
	**/
		aSendMail.setSender(txtFrom.getText());
	/**
		Set the recipient address.
	**/
		aSendMail.setRecipient(txtTo.getText());
	/**
		Set the subject of email.
	**/
                aSendMail.setSubject(txtSubject.getText());
	/**
		Set the message body.
	**/
		aSendMail.setData(edtMessage.getText());
	/**
		Send the message.
	**/
		aSendMail.sendMessage();
      	}
      	catch (Exception ex)
      	{
		errMessage = ex.getMessage();
		eroare = true;
      	}

        if (eroare == false)
	    edtMessage.setText("Message sent!");
	else
            edtMessage.setText("Was detected an error when this email was sent!\n "+
			  "The message error is : " + errMessage);
    }

  void btnExit_actionPerformed(ActionEvent e) {
	  try
	  {
		  System.exit(0);
	  }
	  catch (Exception err) {
	  	System.out.println(err);
	  	}
  }

  public static void main (String[] args) {

       /**
	The SendMail class throws its own Exceptions
	**/
      try {
	    UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName());
	  }
	catch (Exception e)
        {
	    e.printStackTrace(System.err);
	}

      SendMailExample frame = new SendMailExample();
      frame.setDefaultCloseOperation(3);
      frame.setTitle("Send mail over network ::..");
      frame.initialize();
      frame.setSize(530,430);
      frame.setVisible(true);
      //frame.setResizable(false);
      Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
      frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);

		}
}

class SendMailException extends Exception {

	SendMailException () {
		System.out.println("Unknown SendMail Exception!");
		printStackTrace();
	}

	SendMailException (String aException) {
		super(aException);
	}
}

class SendMail {

	// Socket to use for the connection
	private Socket itsSocket;

	// Name of the localhost
	private InetAddress itsLocalHost;

	// Streams to use for the socket
	private BufferedInputStream itsInput;
	private BufferedOutputStream itsOutput;

	// Message data and addresses
	private String itsSender;
	private String itsRecipient;
        private String itsSubject;
        private String itsData;

	// Flags to determine if we have a properly formatted email.
	// All must be true before we can send the message.
	private boolean haveSender    = false;
	private boolean haveRecipient = false;
        private boolean haveSubject   = false;
	private boolean haveData      = false;

	// Flag for echo of commands and replies to client terminal
	private boolean itsEcho;

/**
	param aServerName A FQ Hostname of a SMTP server
	param aServerPort The port on which the server runs its SMTP service.
**/
	public SendMail (String aServerName, int aServerPort) throws SendMailException{

		try {
			// Set local/remote InetAddress
			InetAddress aRemoteHost = InetAddress.getByName(aServerName);
			itsLocalHost = InetAddress.getLocalHost();

			// Create the socket
			itsSocket = new Socket(aRemoteHost, aServerPort);

			// Create streams
			itsInput = new BufferedInputStream(itsSocket.getInputStream());
			itsOutput = new BufferedOutputStream(itsSocket.getOutputStream());

		}
		catch (UnknownHostException E){
			//System.out.println("Server " + aServerName + " does not exist!");
                        throw new SendMailException("Server " + aServerName + " does not exist!");
		}
		catch (IOException E) {
			//System.out.println("Could not connect to " + aServerName + "!");
                        throw new SendMailException("Could not connect to " + aServerName + "!");
		}
	}

/**
	Set the sender(return-path), ie the users email address.
	param aSender A valid email address.
**/
	public void setSender (String aSender) throws SendMailException{
		haveSender = false;
                if (!aSender.equalsIgnoreCase(""))
                {
                    itsSender = aSender;
                    haveSender = true;
                }
                else
                {
                     throw new SendMailException("Sender not set!");
                }
	}

/**
	Set the recipients email address .
	param aRecipient A valid email address.
**/
	public void setRecipient (String aRecipient) throws SendMailException{
		haveRecipient = false;
                if (!aRecipient.equalsIgnoreCase(""))
                {
                    itsRecipient = aRecipient;
                    haveRecipient = true;
                }
                else
                {
                     throw new SendMailException("Recipient not set!");
                }
	}

/**
	Set the subject of email.
**/
	public void setSubject (String aSubject) throws SendMailException{
		haveSubject = false;
                if (!aSubject.equalsIgnoreCase(""))
                {
                    itsSubject = aSubject;
                    haveSubject = true;
                }
                else
                {
                     throw new SendMailException("Your email doesn't have subject!");
                }
	}


/**
	Set the content of the message(body).
	param aData Message body
**/
	public void setData (String aData) throws SendMailException{
		haveData = false;
                if (!aData.equalsIgnoreCase(""))
                {
                    itsData = aData;
                    haveData = true;
                }
                else
                {
                     throw new SendMailException("The message body is empty!");
                }
	}


/**
	Sends the message if we have a valid sender,recipient and a message body.
	Returns true if delivery was successful.
**/
	public boolean sendMessage () throws SendMailException {

		// Must ha a all data before we attempt to send the message
		if (haveSender && haveRecipient && haveData && haveSubject) {

			// Get welcome message from server
			getServerReply();

			// Send the complete message
			String aCommand;

			// Send HELO
			aCommand = "HELO " + itsLocalHost.getHostName() + "\r\n";
			sendCommand(aCommand);

			// SEND MAIL FROM:
			aCommand = "MAIL FROM:" + itsSender + "\r\n";
			sendCommand(aCommand);

			// Send RCPT TO:
			aCommand = "RCPT TO:" + itsRecipient + "\r\n";
			sendCommand(aCommand);

			// Send DATA command
			aCommand = "DATA\r\n";
			sendCommand(aCommand);

			// Send SUBJECT
			aCommand = "SUBJECT :" + itsSubject + "\r\n";
			sendCommand(aCommand);

			// Send DATA message
			aCommand = "\r\n"+itsData+"\r\n.\r\n";
			sendCommand(aCommand);

			// Send QUIT
			aCommand = "QUIT\r\n";
			sendCommand(aCommand);
		}
		else {

			String aErrorMsg = null;

			if (!haveSender){
                             aErrorMsg = "Sender not set!";
                             }
			if (!haveRecipient){
                             aErrorMsg = "Recipient not set!";
                             }
			if (!haveData){
                             aErrorMsg = "No data!";
                             }
			if (!haveSubject){
                             aErrorMsg = "No subject!";
                             }

			throw new SendMailException(aErrorMsg);
		}
		return true;
	}

/**
	Send a command to the SMTP server
	param aCommand the SMTP command to send
**/
	private void sendCommand (String aCommand) {

		// Echo command back to client terminal
		echo(aCommand);

		try {

			// Send command to server
			itsOutput.write(aCommand.getBytes());
			itsOutput.flush();
		}
		catch (IOException E) {
			System.out.println("Socket Error while sending data!");
		}

                // Get the servers reply before we proceed
                if (!aCommand.startsWith("SUBJECT")){
                        getServerReply();
                }
	}

/**
	Turns terminal output on/off. Used for debugging.
	param aEchoMode Turn terminal output on/off. Default is off.
**/
	public void setEcho(boolean aEchoMode) {
		// Set echo of commands and replies on or off
		itsEcho = aEchoMode;
	}

/**
	Echo a string to the clients terminal.
	param aEcho The string to echo back to client terminal.
**/
	private void echo (String aEcho) {
		// Echo this back to terminal
		if (itsEcho) {
			System.out.println(aEcho);
		}
	}

/**
	Get replies on user commands from the SMTP server.
	If echo is on the replies will be echoed out to the users terminal.
**/
	private String getServerReply () {

		StringBuffer aReply = new StringBuffer();

		try {

			int avail = itsInput.available();

			// Wait for input
			while (avail == 0) {
				Thread.sleep(100);
				avail = itsInput.available();
			}

			// Read input
			while (avail > 0) {

				byte[] buff = new byte[avail];
				itsInput.read(buff);

				for (int i = 0;i < buff.length;i++) {

					aReply.append((char)buff[i]);
				}

				avail = itsInput.available();
			}
		}
		catch (IOException E) {
			System.out.println("Error while reading data from server!");
		}
		catch (InterruptedException E) {
			System.out.println("Interrupted!");
		}

		if (itsEcho) {
			System.out.println(aReply.toString());
		}
		return aReply.toString();
	}
}
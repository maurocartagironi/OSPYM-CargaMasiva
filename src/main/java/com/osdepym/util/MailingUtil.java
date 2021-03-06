package com.osdepym.util;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

public class MailingUtil {
	
	private static final Logger logger = Logger.getLogger(MailingUtil.class);
	private String fileName = "parameter.properties";
	
	public void sendMailTLS(String mailTo, String subject, String text) {
		sendMailTLS(mailTo, subject, text, null);
	}

	public void sendMailTLS(String mailTo, String subject, String text, MultipartFile[] uploadFiles) {
		
		try {
			Properties props = new Properties();
			logger.info("intentando cargar archivo: " + fileName);
			Properties parameters = ReadPropertyFile.readFile(fileName);
			props.setProperty("mail.smtp.auth", parameters.getProperty("mail.smtp.auth"));
			props.setProperty("mail.smtp.starttls.enable", parameters.getProperty("mail.smtp.starttls.enable"));
			props.setProperty("mail.smtp.host", parameters.getProperty("mail.smtp.host"));
			props.setProperty("mail.smtp.port", parameters.getProperty("mail.smtp.port"));
			
			String username = parameters.getProperty("username");
			String password = parameters.getProperty("password");

			logger.info("autenticando sesion");
			Session session = Session.getInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			});
			
			Message message = new MimeMessage(session); 
			message.setFrom(new InternetAddress(mailTo));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailTo));
			message.setSubject(subject);
			
			
			// Create the message part
	         MimeBodyPart messageBodyPart = new MimeBodyPart();

	         // Now set the actual message
	         messageBodyPart.setText(text, "utf-8");
	         messageBodyPart.setDisposition(Part.INLINE);

	         // Create a multipar message
	         Multipart multipart = new MimeMultipart();

	         // Set text message part
	         multipart.addBodyPart(messageBodyPart);
  
	         // Part two is attachment
	         if(uploadFiles != null && uploadFiles.length > 1) {
	        	 for(int i = 1 ; i < uploadFiles.length ; i++) {
	    	         messageBodyPart = new MimeBodyPart();
	    	         DataSource ds = new ByteArrayDataSource(uploadFiles[i].getBytes(), uploadFiles[i].getContentType());
	    	         messageBodyPart.setDataHandler(new DataHandler(ds));
	    	         messageBodyPart.setFileName(uploadFiles[i].getOriginalFilename());
	    	         messageBodyPart.setDisposition(Part.ATTACHMENT);
	    	         multipart.addBodyPart(messageBodyPart);
	        	 }
	         }

	         // Send the complete message parts
	         message.setContent(multipart);
			
			Transport.send(message);
			logger.info("mail enviado con exito");
		} catch (Exception e) {
			logger.error("error en el envio del mail ", e);
			throw new RuntimeException(e);
		}
	}
	
}
package view;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class FTPUploader {
	
	FTPClient ftp = null;
	
	public FTPUploader(String host,int port,String user, String pwd) throws IOException, Exception{
           
                ftp = new FTPClient();
                String a;
                 ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
//        ftp.addProtocolCommandListener(new ProtocolCommandListener() {
//        @Override
//        public void protocolReplyReceived(ProtocolCommandEvent arg0) {
//          }
//
//        @Override
//        public void protocolCommandSent(ProtocolCommandEvent arg0) {
//        }
//    });
                int reply;
                
                ftp.connect(host,port);
        
                
                reply = ftp.getReplyCode();
                if (!FTPReply.isPositiveCompletion(reply)) {
                    ftp.disconnect();
                    throw new Exception("Exception in connecting to FTP Server");
                }
              
            try {
                ftp.login(user, pwd);
            } catch (IOException ex) {
                System.out.println("Deu ruim");
            }
               
                ftp.setFileType(FTP.BINARY_FILE_TYPE);
                ftp.enterLocalPassiveMode();
            
	}
	public void uploadFile(String localFileFullName, String fileName, String hostDir)
			throws Exception {
		try(InputStream input = new FileInputStream(new File(localFileFullName))){
		this.ftp.storeFile(hostDir + fileName, input);
		}
	}

	public void disconnect(){
		if (this.ftp.isConnected()) {
			try {
				this.ftp.logout();
				this.ftp.disconnect();
			} catch (IOException f) {
				// do nothing as file is already saved to server
			}
		}
	}
	public static void main(String[] args) throws Exception {
		System.out.println("Start");
		FTPUploader ftpUploader = new FTPUploader("gedsicoobcredisul.com.br",2021,"juliano", "123");
		//FTP server path is relative. So if FTP account HOME directory is "/home/pankaj/public_html/" and you need to upload 
		// files to "/home/pankaj/public_html/wp-content/uploads/image2/", you should pass directory parameter as "/wp-content/uploads/image2/"
		ftpUploader.uploadFile("C:\\Users\\JULIANO TI\\Documents\\Suporte_e_Manutencao_Sicoob_Credisul-signed.pdf", "doc.pdf", "/Alfresco/Sites/tecnologia-da-informao/documentLibrary/FTP/");
		ftpUploader.disconnect();
		System.out.println("Done");
	}
}
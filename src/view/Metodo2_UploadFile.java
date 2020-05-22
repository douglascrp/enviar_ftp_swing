/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author JULIANO TI
 */

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class Metodo2_UploadFile {
	/**
	 * @param args
	 */
    
        public String enviar_FTP (String user, String pswd, String path, String path_ftp, String nome){
        FTPClient ftp = new FTPClient();
		try {
                    ftp.setAutodetectUTF8( true );
                    ftp.connect("gedsicoobcredisul.com.br",2021);
                           
			if (FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
				ftp.enterLocalPassiveMode();

				if (ftp.login(user, pswd)) {
                                        
                                        ftp.setFileType(FTP.BINARY_FILE_TYPE);
                                        ftp.enterLocalPassiveMode();
                                        
//					String path = "C:\\Users\\JULIANO TI\\Documents\\Suporte_e_Manutencao_Sicoob_Credisul-signed.pdf";
					File file = new File(path);
					InputStream is = new BufferedInputStream(
							new FileInputStream(file));
                                      //  "/Alfresco/Sites/tecnologia-da-informao/documentLibrary/FTP/juliano123.pdf"
					if (!ftp.storeFile(path_ftp+nome, is)) {
//						Logger.getLogger(Metodo2_UploadFile.class.getName()).log(
//								Level.SEVERE, "Falha ao enviar o arquivo");
                                           String retorno = "não foi enviado, erro desconhecido";
                                           return retorno;
					} else {
                                           String retorno = "foi enviado com sucesso.";
                                           return retorno;
					}
				} else {
                                    
                                     String retorno = "não foi enviado, usuário e/ou senha incorretos.";
                                     return retorno;
//                                    Logger.getLogger(Metodo2_UploadFile.class.getName()).log(
//							Level.SEVERE, "Falha de autenticação");
				}
			} else {
				ftp.disconnect();	
                                String retorno = "não foi enviado, erro desconhecido";
                                return retorno;
			}

		
		} catch (IOException e) {
			Logger.getLogger(Metodo2_UploadFile.class.getName()).log(Level.SEVERE, null,
					e);
		}
            return "Não é possível conectar-se ao servidor da UAD, favor verificar sua conexão.";
        }     
    
	public static void main(String[] args) {
	//enviando um arquivo
            String host = "gedsicoobcredisul.com.br";
            int port = 2021;
            String user = "h";
            String pswd = "j";
            String path = "";
            String path_ftp = "";
            String nome_arquivo = "";
            
           Metodo2_UploadFile m = new Metodo2_UploadFile();
           String retorno = m.enviar_FTP(user, pswd, path, path_ftp, nome_arquivo);
            System.out.println(retorno);
	}
}
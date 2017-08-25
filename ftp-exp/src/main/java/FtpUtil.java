import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by BaIcy on 2016/12/1.
 */
public class FtpUtil {

    public void download(String path){
        FTPClient ftpClient = new FTPClient();
        try{
            ftpClient.connect("192.168.10.207");
            ftpClient.login("a","");
            FileOutputStream fos = new FileOutputStream("abc-copy.txt");
            ftpClient.retrieveFile("abc.txt",fos);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void upload(String path){
        FTPClient ftpClient = new FTPClient();
        try{
            FileInputStream fis = new FileInputStream("abc-copy.txt");
            ftpClient.connect("192.168.10.207");

            ftpClient.login("a", "");
            ftpClient.changeWorkingDirectory(path);
            ftpClient.setBufferSize(1024);
            ftpClient.setFileType(FTPClient.ASCII_FILE_TYPE);
            ftpClient.storeFile("abc-copy.txt",fis);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args){
        FtpUtil ftp = new FtpUtil();
        ftp.upload("/test/ftputil");
//        ftp.download("");
    }
}

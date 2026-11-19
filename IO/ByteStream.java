package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

    public void copyFile(String readFile, String writeFile){
        try(FileInputStream fis = new FileInputStream(readFile);
            FileOutputStream fos = new FileOutputStream(writeFile);) {
            byte[] buffer = new byte[8192];
            int len;
            while((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String readFile = "FileRead.txt";
        String writeFile = "FileWrite.txt";

        ByteStream stream = new ByteStream();
        stream.copyFile(readFile, writeFile);
        
    }
    

}

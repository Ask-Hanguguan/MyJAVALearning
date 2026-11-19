package MyJAVALearning.IO;

import java.io.*;

public class BufferByteStream {

    public void copyFile(String readFile, String writeFile) {
        long start = System.currentTimeMillis();
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(readFile));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(writeFile));) {
            byte[] b = new byte[8192];
            int len;
            // read(byte[] b)走的是inputStream的read
            while((len = bis.read(b)) != -1) {
                bos.write(b, 0, len);
            }
            bos.flush();
        } catch(IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("复制时间："+(end-start)+" 毫秒");
    }

    public static void main(String[] args) {
        String readFile = "IO/music_origin.mp3";
        String writeFile = "IO/music_repro.mp3";

        BufferByteStream bbs = new BufferByteStream();
        bbs.copyFile(readFile, writeFile);
    }
}

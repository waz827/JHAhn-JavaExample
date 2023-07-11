package 기말고사;

import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        try (java.io.FileReader fr = new java.io.FileReader("C:\\Windows\\system.ini")) {
            int i;
            while ((i=fr.read())!=-1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

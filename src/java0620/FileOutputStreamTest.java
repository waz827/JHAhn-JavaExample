package java0620;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try(FileOutputStream fos= new FileOutputStream("./data/output.txt")){
            fos.write(65);
            fos.write(65);
            fos.write(65);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("출력이 완료됨");
    }
}

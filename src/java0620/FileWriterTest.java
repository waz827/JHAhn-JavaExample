package java0620;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fw= new FileWriter("./data/writer.txt")){
            fw.write('A');
            char buf[]={'B','C','D','E','F','G'};

            fw.write(buf);
            fw.write("안녕하세요 기말고사 어떻게될지 기대가 참...");
            fw.write("65");

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("출력 완");
    }
}

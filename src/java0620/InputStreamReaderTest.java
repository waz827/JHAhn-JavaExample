package java0620;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        try(InputStreamReader ist = new InputStreamReader(new FileInputStream("./data/reader.txt"))){
            int i;
            while((i= ist.read())!=-1){
                System.out.println((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

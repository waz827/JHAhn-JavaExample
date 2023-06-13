package java0530.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String filename, String className) throws
            FileNotFoundException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(filename);
        Class c = Class.forName(className);
        return c;
    }
    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt","java.lang.String");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

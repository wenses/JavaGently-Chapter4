import javagently.*;
import java.io.*;

class file3{
    public static void main(String[] args) throws IOException{
        PrintWriter fout=Text.create("Testfile");
        fout.println("Hello world");
        fout.close();
    }
}
import java.io.*;
import javagently.*;
public class prog2 {

    public static void main(String[] args) throws IOException{
        BufferedReader in=Text.open(System.in);
        Text.prompt("Enter s number");
        int x=Text.readInt(in);

        System.out.println("The number is  " + x);
    }
    
}

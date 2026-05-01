import javagently.*;
import java.io.*;

class file1{
    public static void main(String[] args) throws IOException{
        BufferedReader in=Text.open(System.in);
        Text.prompt("What is your name?");

        String fname=Text.readString(in);
        String lname=Text.readString(in);
        System.out.println("Konnichiwa "+fname+" "+lname+".");
    }
}
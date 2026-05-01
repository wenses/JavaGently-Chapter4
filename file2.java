import javagently.*;
import java.io.*;

class file2{
    public static void main(String[] args) throws IOException{
        int number;
        BufferedReader in=Text.open(System.in);
        BufferedReader fin=Text.open("numbers.txt");

        for (int i=1;i<=3;i++){
            number=Text.readInt(fin);
            System.out.println(number);
        }
    }
}
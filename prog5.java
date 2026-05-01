import java.io.*;
import javagently.*;
public class prog5 {

    public static void main(String[]  args) throws IOException{

        BufferedReader in = Text.open(System.in);
        int mass;
        int time;
        Text.prompt("Enter mass : ");
        mass=Text.readInt(in);
        Text.prompt("Enter time: ");
        time=Text.readInt(in);

        System.out.println("mass= "+mass+"kg");
        System.out.println("time= "+time+"s");

        System.out.println(mass,time);
    }
    
}

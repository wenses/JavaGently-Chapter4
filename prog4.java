import java.io.*;
import javagently.*;
public class prog4 {

    public static void main(String[] args) throws IOException{
        BufferedReader in=Text.open(System.in);
        char pre;
        Text.prompt("Enter character (Metrics) : ");
        pre=Text.readChar(in);

        switch (pre){
	case 'm':
		System.out.println("milli");
		break;
	case 'c':
		System.out.println("centi");
		break;
	case 'k':
		System.out.println("kilo");
		break;
	default:
		System.out.println("metre");
		break;
}

    }
    
}

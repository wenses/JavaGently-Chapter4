public class prog1 {
    public static void main(String[] args){
        int x=2;
        int y=3;

        if (x<y){
            int temp=x;
            x=y;
            y=temp;
        }
        System.out.println("The value of x now is " + x);
        System.out.println("The vlaue of y now is " + y);
    }
}

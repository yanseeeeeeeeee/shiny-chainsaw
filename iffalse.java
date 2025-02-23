import java.util.Scanner;

public class iffalse {

    public static void main(String [] args) {
    
        Scanner in = new Scanner(System.in);
        System.out.print("a=");
        int a = in.nextInt();
        int b =5;
        if (a%2==0) {
            System.out.print("Число четное");
        }
        else {
            System.out.print("Число нечетное");
        }
        in.close();


    }
}
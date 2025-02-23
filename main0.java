import java.util.Scanner;

public class main0 {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("a=");
     int a = in.nextInt();
     System.out.print("b=");
     int b = in.nextInt();
     int c = a + b;
     System.out.printf("%d + %d = %d",a, b, c);
     in.close();

}
}
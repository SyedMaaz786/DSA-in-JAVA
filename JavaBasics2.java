import java.util.*;
public class JavaBasics2 {
    public static void main(String args[]) {
        // Sum of a and b using user input

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a + b;
        System.out.println(sum);

        //Product of A and B using user input
        Scanner S = new Scanner(System.in);
        int A = S.nextInt();
        int B = S.nextInt();
        int product = A * B;
        System.out.println(product);

        //Type conversion is implicitly(Automatically done by JAVA).

        Scanner Sc = new Scanner(System.in); 
        float number = Sc.nextInt();
        System.out.println(number);

        //Type casting is explicitly(Manually we do this).

        Scanner SC = new Scanner(System.in);
        float Num = 22.22f;
        int Num2 = (int) Num;
        System.out.println(Num2); 

        char Char = 'a';
        System.out.println((int)(Char));



    }
}
import java.util.*;
public class JavaBasics4 {
    public static void main(String args[]) {  //While loop
        // int count = 0;
        // while (count < 2){
        //     System.out.println("Hello World");
        //     count ++;
        // }


        // int number = 1;  //While loope to print numbers from 1-10
        // while(number<11){
        //     System.out.print(number); //println on the different line
        //     number++;                 //print on the same line
        // }




        // int num = 1;
        // Scanner sc = new Scanner(System.in);  //Printing numbers from 1-n using user input.
        // int numb = sc.nextInt();
        // while(num <= numb ){
        //     System.out.println( num );
        //     num ++;
        // }



        // Scanner s = new Scanner(System.in);  //Sum of n numbers
        // int n = s.nextInt();
        // int i = 0;
        // int sum = 0;
        // while (i<=n){
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println(sum);




        // for (int j=1; j<=5; j++){   //for loop
        //     System.out.println("Maaz");
        // }


        // for (int line = 1; line <=4; line++){  //square pattern 
        //     System.out.println("* * * *");
        // }





        // int a = 123456;  //reversing a number
        // while (a > 0){
        //     int reverse = a%10;
        //     System.out.print(reverse);
        //     a = a/10;
        // }
        // System.out.println();


        // int counter = 1;                //do while loop
        // do{                             //In do while same logic first do then condition
        //     System.out.println("Heyy");
        //     counter++;
        // }while (counter <=4 );





        // for (int k=1; k<=5; k++){        //Break - To exit
        //     if (k == 3){
        //         break;
        //     }
        //     System.out.println("Hiii");
        // }
        
        // for (int l=0; l<=5; l++){        //Continue - To skip 
        //     if (l == 3){
        //         continue;
        //     }
        //     System.out.println(l);
        // }




        Scanner sc = new Scanner(System.in);  //Prime number or not
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n<=1){
            isPrime = false;
        }

        for (int i=2; i*i<=n; i++){
            if (n%i==0){
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is NOT a prime number");
        }




    }
           
}

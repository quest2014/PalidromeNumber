import java.util.Scanner;

public class CheckPalindromeNumber {

    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       int actualnumber=number;
       int rev=0;

      while(number!=0) {
          rev = 10*rev + (number%10);
          number = number/10;
      }
        System.out.println("rev number is "+rev);

      if(actualnumber==rev){
          System.out.println("The given number is palidrome number");
      }else {
          System.out.println("The given nymber is not palindrome number");
      }


    }
}

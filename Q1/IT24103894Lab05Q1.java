import java.util.Scanner;

    public class IT24103894Lab05Q1   {
       public static void main(String []args)  {
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter the first integer: ");
       int firstNum = scanner.nextInt();

       System.out.print("Enter the second integer: ");
       int secondNum = scanner.nextInt();

       System.out.print("Enter the third integer: ");
       int thirdNum = scanner.nextInt();

       int smallest = firstNum;
       int largest = firstNum;
       
       if (secondNum < smallest ){
           smallest = secondNum ;
	   }
	   
       if (thirdNum < smallest ){
           smallest = thirdNum;
       }
       if (secondNum > largest) {
           largest = secondNum;
       }
       if (thirdNum > largest) {
           largest = thirdNum;
       }
       System.out.println();
       System.out.println("User entered numbers are : " + firstNum + " " + secondNum +" " +  thirdNum );

       System.out.println("The smallest number: " + smallest );
       System.out.println("The Largest number: " + largest );
 
       scanner.close();
    }
}    
       
import java.util.Scanner;
public class MenuProgram {


   static void checkEvenOdd(int num){
    if(num%2==0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
  }





    static int sumOfDigits(int num){
      int temp = num;
    int sum = 0;
    while(temp!=0){
      sum +=  temp%10;
      temp /= 10;

    }
    return sum;

  }




     static int reverseNumber(int num){
        int temp = num;
        int rev = 0;
        while(temp!=0){

            int rem = temp%10;
            rev = rev * 10 + rem;
            temp /= 10;

        }
        return rev;
    }








  public static void main(String[] args) {
    System.out.println("1 Even/Odd");
    System.out.println("2 Sum of Digits");
    System.out.println("3 Reverse Number");
    System.out.println("4 Exit");

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Choice: ");
    int choice = scan.nextInt();
    
      int count = 0;


    while(true){

      if(count >0){
        break;
      }
      System.out.println("Enter number: ");
   

      switch(choice){
        
        case 1: 
          int num = scan.nextInt();
          checkEvenOdd(num);
          count++;
          break;

        case 2:
          int n = sumOfDigits(scan.nextInt());
          System.out.println(n);
          count++;
          break;

        case 3:
          int k = reverseNumber(scan.nextInt());
          System.out.println(k);
          count++;
          break;
        case 4:
          System.out.println("Exit");
          count++;
          break;
        default:
          System.out.println("Invalid Entry");
          break;
      }
    }


   }















  }
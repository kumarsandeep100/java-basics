import java.util.Scanner;
public class Palindrome {

  // Palindrome logic/method
  boolean isPalindrome(int num){
    if(num<0) return false;
    int num1=num;
    int rev = 0;// reverse number
    while(num1!=0){
      int rem = num1%10;
      rev = rev *10 +rem;
      num1 = num1/10;
    }
    return num==rev;
  }

  //main method
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int num = scan.nextInt();
    Palindrome palindrome = new Palindrome();

    if(palindrome.isPalindrome(num)){
      System.out.println(num+" is a palindrome number.");
    }
    else{
      System.out.println(num+" is not a palindrome number.");
    }
    scan.close();
  }
  

}


  


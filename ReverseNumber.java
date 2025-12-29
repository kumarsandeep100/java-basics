import java.util.Scanner;
public class ReverseNumber {

  
//Reverse logic / method
   int revNumber(int n){
    int rev = 0;
    while(n!=0){
      int rem = n%10;
      rev = rev * 10 +rem;
      n = n/10;

    }
    return rev;
   
  }

  

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int num = scan.nextInt();
    ReverseNumber reverseNumber = new ReverseNumber();
    System.out.print("Reverse Number: "+reverseNumber.revNumber(num));
    
   
    
    
  }
  
}

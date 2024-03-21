import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in); 
         int N = sc.nextInt();
         if( N % 2 ==0 )
         {
        	 System.out.println("짝수입니다.");
         }
         else
         {
        	 System.out.println("0이거나 홀수입니다.");
         }
	}

}

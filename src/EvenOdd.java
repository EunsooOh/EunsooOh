import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in); 
         
         System.out.println("정수를 입력하시오.");
         int N = sc.nextInt();
         if( N % 2 ==0 )
         {
        	 System.out.println("짝수입니다.");
         }
         else
         {
        	 System.out.println("0이거나 홀수입니다.");
         }
         System.out.println("시스템이 종료되었습니다.");
	}

}

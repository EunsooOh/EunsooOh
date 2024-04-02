import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();
        
        if (isMultipleOf3(number)) {
            System.out.println(number + "는 3의 배수입니다.");
        } else {
            System.out.println(number + "는 3의 배수가 아닙니다.");
        }
        
        scanner.close();
    }
    
    public static boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }
}
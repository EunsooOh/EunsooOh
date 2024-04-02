import java.util.Scanner;

public class MedianFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        System.out.println("양수 5개를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            int input;
            do {
                System.out.print((i + 1) + "번째 숫자: ");
                input = scanner.nextInt();
                if (input <= 0) {
                    System.out.println("양수를 입력해주세요.");
                }
            } while (input <= 0);
            
            numbers[i] = input;
        }
        
        java.util.Arrays.sort(numbers);
        
        int middleIndex = numbers.length / 2;
        System.out.println("가운데 값은: " + numbers[middleIndex]);
        
        scanner.close();
    }
}
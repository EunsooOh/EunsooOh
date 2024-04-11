import java.util.Scanner;

public class TextInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("문자열을 입력하세요.");
            String userInput = scanner.nextLine();
            
            if (userInput.equalsIgnoreCase("quit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            if (userInput.startsWith("www")) {
                System.out.println(userInput + "은(는) 'www'로 시작합니다.");
            } else {
                System.out.println(userInput + "은(는) 'www'로 시작하지 않습니다.");
            }
        }
        
        scanner.close();
    }
}
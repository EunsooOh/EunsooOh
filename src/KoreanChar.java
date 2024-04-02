public class KoreanChar {
    public static void main(String[] args) {
        char start = '가';
        char end = '힣';
        char []i = {'나', '다', '라', '마', '바', '사', '아', '자', '차', '카', '타', '파', '하'};
        do {
        	for (int j = 0; j < i.length; j++) {
        		if (start == i[j]) {
                    System.out.println("\n--…--");
                    break;
        		}
        	}
        	 System.out.print(start);
             start++;
        } while  (start <= end);
    }
}
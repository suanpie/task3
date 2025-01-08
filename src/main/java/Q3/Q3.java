package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");

        int score = scanner.nextInt();

        int grade = score / 10;

        String test = switch (grade) {
        case 10, 9 -> "A";
        case 8 -> "B";
        case 7 -> "C";
        case 6 -> "D";
        default -> "F";
      };

      System.out.println("학점 결과: " + test);
    }
}

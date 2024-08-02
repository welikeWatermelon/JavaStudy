package practice;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subject = {"국어","영어","수학"};

        System.out.print("학생수를 입력하시오 : ");
        int count = scanner.nextInt();

        int[][] scores = new int[count][3];

        for (int i = 0; i<count; i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하시오");
            for (int j = 0; j<subject.length; j++){
                System.out.print(subject[j]+" 점수 :");
                int score = scanner.nextInt();
                scores[i][j] = score;
            }
        }
        for (int i = 0; i<count; i++){
            int sum = 0;
            for (int j = 0; j<subject.length;j++){
                sum += scores[i][j];
            }

            System.out.println((i+1)+"번 학생의 총점 : "+sum);
            System.out.println((i+1)+"번 학생의 평균 : "+((double)sum/subject.length));
        }

    }
}

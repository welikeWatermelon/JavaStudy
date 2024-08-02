package practice;

public class Practice1 {
    public static void main(String[] args) {
        int[] student = {90,80,70,60,50};
        int sum = 0;
        for (int score : student ){
            sum += score;
        }

        double average = (double) sum / 5;
        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + average);
    }
}
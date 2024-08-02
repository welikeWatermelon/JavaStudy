package practice;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하시오");
        int num = scanner.nextInt();
        int[] numbers = new int[num];

        System.out.println(num+"개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i=0 ; i<numbers.length; i++){
            sum += numbers[i];
        }
        double ave = sum / num;

        System.out.println("입력한 정수의 합계 : "+sum);
        System.out.println("입력한 정수의 평균 : "+ave);

    }
}

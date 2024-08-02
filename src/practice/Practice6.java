package practice;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하시오");
        int num = scanner.nextInt();
        int[] numbers = new int[num];

        System.out.println(num+"개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int minNumber = 2147483647;
        int maxNumber = -2147483648;

        for (int i : numbers){
            if (i > maxNumber){
                maxNumber = i;
            }
            if (i < minNumber){
                minNumber = i;
            }
        }

        System.out.println("가장 작은 정수: "+ minNumber);
        System.out.println("가장 큰 정수: "+ maxNumber);


    }
}

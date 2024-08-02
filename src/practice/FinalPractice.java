package practice;

import java.util.Scanner;

public class FinalPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] products = new String[10][2];
        int cnt = 0;

        while (true){
            System.out.println("1. 상품등록 | 2. 상품 목록 | 3. 종료");
            System.out.println("메뉴를 선택하세요");
            scanner.nextLine();
            int num = scanner.nextInt();

            if (num==3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if (num==2){
                if (cnt == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    break;
                }
                for (int i = 0; i<products.length; i++) {
                    if (products[i][0] != null) {
                        System.out.println(products[i][0] + ": " + products[i][1] + "원");
                    }
                }
            }
            else{
                cnt+=1;
                if (cnt == 10){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    break;
                }
                System.out.print("상품 이름을 입력하세요");
                scanner.nextLine();
                String productName = scanner.nextLine();
                products[cnt-1][0] = productName;

                System.out.print("상품 가격을 입력하세요");
                String productPrice = scanner.nextLine();
                products[cnt-1][1] = productPrice;

            }


            }
        }
}

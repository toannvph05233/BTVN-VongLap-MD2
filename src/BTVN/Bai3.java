package BTVN;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        //Bài 3: Nhập vào 1 số, kiểm tra số đó có phải SNT hay không.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn kiểm tra ");
        int number = scanner.nextInt();


        if (number < 2) {
            System.out.println("ko phải SNT");
        } else {

            boolean check = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    check = false;
                    System.out.println(" ko phải SNT ");
                    break;
                }
            }
            if (check) {
                System.out.println("Là SNT");
            }
        }
    }
}

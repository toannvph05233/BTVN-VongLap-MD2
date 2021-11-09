package BTVN;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
//        Bài 4: Game đoán số, cho Random 1 số từ 1->10.
//        Cho người dùng nhập vào 1 số để đoán,
//        nếu nhỏ hơn thông báo nhỏ hơn và cho nhập lại,
//        nếu lớn hơn thông báo lớn hơn và cho nhập lại,
//        bằng thì hiển thị chúc mừng và dừng chương trình.

        int random = (int) (Math.random() * 9 + 1);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhập vào dự đoán của bạn 1 -> 10");
            int so = scanner.nextInt();
            if (so == random) {
                System.out.println("win");
                break;
            } else {
                if (so > random) {
                    System.out.println("nhập lớn hơn rồi");
                } else {
                    System.out.println("nhập nhỏ hơn rồi");
                }
            }
        }
    }
}

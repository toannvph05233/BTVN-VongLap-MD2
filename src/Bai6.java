import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.println("Chào bạn đến với GAME AI LÀ TRIỆU PHÚ.\n" +
                "\tLỚP C0921K1 CÓ BAO NHIÊU BẠN NỮ.\n");
        System.out.println("1. 1 BẠN");
        System.out.println("2. 2 BẠN");
        System.out.println("3. 3 BẠN");
        System.out.println("4. 4 BẠN");

        Scanner sc = new Scanner(System.in);
        boolean check = true;

        while (check) {
            System.out.println("nhập đáp án");
            int so = sc.nextInt();

            switch (so) {
                case 3:
                    System.out.println("Đúng");
                    check = false;
                    break;
                default:
                    System.out.println("sai");
            }
        }
    }
}

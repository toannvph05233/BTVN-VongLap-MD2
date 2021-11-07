public class Bai2 {
    public static void main(String[] args) {
//  Bài 2: Tính tổng các SNT từ 10 -> 50.

        int sum = 0;
        for (int i = 10; i <= 50; i++) {
            boolean check = true;

            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                sum += i;
            }

        }

        System.out.println(sum);

    }
}

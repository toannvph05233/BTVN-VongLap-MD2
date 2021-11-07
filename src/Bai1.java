public class Bai1 {
    public static void main(String[] args) {
//  Bài 1: Tìm số chia hết cho 5 tại vị trí thứ 20, bắt đầu từ 11.
        int count = 0;
        int n = 11;
        while (count<20){
            if (n%5 == 0){
                count ++;
            }
            n++;
        }

        System.out.println(n-1);
    }
}

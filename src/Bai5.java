import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        //Bài 5: Giải phương trình bậc 2. nhập a,b,c từ bàn phím và trả về kết quả.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a");
        int a = scanner.nextInt();
        System.out.println("Nhập b");
        int b = scanner.nextInt();
        System.out.println("Nhập c");
        int c = scanner.nextInt();

       double delta= b^2 - 4*a*c;
       if (delta<0){
           System.out.println("vo nghiệm");
       }else {
           System.out.println("x1 = " + (-b+Math.sqrt(delta))/2*a);
           System.out.println("x2 = " + (-b-Math.sqrt(delta))/2*a);
       }
    }
}

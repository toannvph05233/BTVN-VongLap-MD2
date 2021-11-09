package OOP;

public class Main {
    public static void main(String[] args) {
        Pin china = new Pin(4,"china");
        Pin conChuot = new Pin(10,"VN");

        Den denVN = new Den(false,china);

        denVN.turnOn();
        System.out.println(denVN.isStatus());
        System.out.println(denVN.getPin().getPower());
        System.out.println(denVN.getPin().getHang());
        denVN.sac();
        System.out.println(denVN.getPin().getPower());
        denVN.setPin(conChuot);

        System.out.println(denVN.getPin().getPower());
        System.out.println(denVN.getPin().getHang());

    }
}

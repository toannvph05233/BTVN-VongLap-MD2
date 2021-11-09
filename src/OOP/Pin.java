package OOP;

public class Pin {
    private int power;
    private String hang;

    public Pin() {
    }

    public Pin(int power, String hang) {
        this.power = power;
        this.hang = hang;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
}

package OOP;

public class Den {
    private boolean status;
    private Pin pin;

    public void turnOn(){
        status = true;
        pin.setPower(pin.getPower()-1);
    }

    public void turnOff(){
        status = false;
    }

    public void sac(){
        pin.setPower(pin.getPower() + 1);
    }

    public Den(boolean status, Pin pin) {
        this.status = status;
        this.pin = pin;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Pin getPin() {
        return pin;
    }

    public void setPin(Pin pin) {
        this.pin = pin;
    }
}

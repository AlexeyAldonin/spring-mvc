package web.model;

public class Car {

    private String model;

    private int number;

    private boolean isPetrol;

    public Car(String model, int number, boolean isPetrol) {
        this.model = model;
        this.number = number;
        this.isPetrol = isPetrol;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPetrol() {
        return isPetrol;
    }

    public void setPetrol(boolean petrol) {
        isPetrol = petrol;
    }
}

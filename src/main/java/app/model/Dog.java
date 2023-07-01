package app.model;

public class Dog extends Animal{

    private String barking;
    public String getBarking() {
        return barking;
    }

    public void setBarking(String barking) {
        this.barking = barking;
    }

    @Override
    public String toString() {
        return "Dog barking";
    }
}

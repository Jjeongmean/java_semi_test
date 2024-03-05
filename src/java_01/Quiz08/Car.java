package java_01.Quiz08;

public class Car {
    //필드
    String company;
    String model;
    double maxSpeed;
    private tire Tire;

    public Car(String company, String model, double maxSpeed) {
        super();
    }

    public Car() {

    }


    private class tire {
        Car car = new Car("기아자동차", "레이", 20);
    }
}

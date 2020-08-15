package factory.simple;

public class Consumer {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCar("WuLing");
        Car car2 = CarFactory.getCar("Tesla");
    }
}

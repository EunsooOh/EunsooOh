public class CarTest {

    public static void main(String[] args) {
    	
        Car car1 = new Car("Red");
        car1.changeGear(3);
        car1.speedUp();
        car1.speedDown();
        car1.print();

        System.out.println();

        Car car2 = new Car("Blue");
        car2.changeGear(6);
        car2.speedUp();
        car2.speedDown();
        car2.print();
    }
}
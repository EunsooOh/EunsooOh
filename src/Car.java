public class Car {
    String color;
    int speed;
    int gear;

    public Car(String color) {
        this.color = color;
        this.speed = 0;
        this.gear = 1;
    }

    void print() {
        System.out.println("색상은 " + color + "이고, 속도는 " + speed + "이며, 기어는 " + gear + "단입니다.");
    }

    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
    }

    public void changeGear(int newGear) {
        if (newGear >= 1 && newGear <= 5) {
            gear = newGear;
            System.out.println("기어를 " + gear + "단으로 변경하였습니다.");
        } else {
            System.out.println("올바른 기어 범위가 아닙니다.");
        }
    }

    public void speedUp() {
        speed += 10;
        System.out.println("속도를 증가시켰습니다. 현재 속도: " + speed);
    }

    public void speedDown() {
        speed -= 10;
        System.out.println("속도를 감소시켰습니다. 현재 속도: " + speed);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Red");
        myCar.print();

        myCar.changeGear(3);
        myCar.speedUp();
        myCar.speedDown();

        System.out.println(myCar);
    }
}
package abstractdemo;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(10);
        circle.draw();
        System.out.println("Dien tich: "+circle.getArea());
        System.out.println("Chu vi: "+circle.getPerimeter());

        Square square=new Square(20);
        square.draw();
        System.out.println("Dien tich: "+square.getArea());
        System.out.println("Chu vi: "+square.getPerimeter());
    }
}

package abstractdemo;

public class Square extends Shape{
    double side;
    public Square(double side){
        this.side=side;
    }
    @Override
    void draw() {
        System.out.println("Hinh vuong co canh "+this.side);
    }

    @Override
    double getArea() {
        return this.side*this.side;
    }

    @Override
    double getPerimeter() {
        return 4*this.side;
    }
}

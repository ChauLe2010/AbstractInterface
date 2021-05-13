package abstractdemo;

public class Circle extends Shape{
    double radius;
    final double PI=3.14;
    public Circle(){
        this.radius=10;
    }
    public Circle(double radius){
       this.radius=radius;
    }
    @Override
    void draw() {
        System.out.println("Ve hinh tron ban kinh "+this.radius);
    }

    @Override
    double getArea() {
        return this.PI*Math.pow(this.radius,2);
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
}

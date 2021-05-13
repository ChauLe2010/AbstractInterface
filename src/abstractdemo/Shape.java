package abstractdemo;

abstract public class Shape {
    String color;
    String getColor(){
        return this.color;
    }
    abstract void draw();
    abstract double getArea();
    abstract double getPerimeter();
}

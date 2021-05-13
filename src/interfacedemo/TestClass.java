package interfacedemo;

public class TestClass implements CanDraw{
    @Override
    public void draw() {
        System.out.println("Ve mau: "+CanDraw.COLOR);
    }
}

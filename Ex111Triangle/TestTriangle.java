package be.vdab.Ex111Triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle( 1, 1 , 1, "blue", false );
        System.out.println("Area: " + t1.getArea());
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println(t1.toString());
    }
}

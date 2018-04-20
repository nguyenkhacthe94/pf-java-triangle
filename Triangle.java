public class Triangle extends Shape {
    private double side1 = 1, side2 = 1, side3 = 1;

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nside1 = " + getSide1()
                + "\nside2 = " + getSide2()
                + "\nside3 = " + getSide3()
                + "\narea = " + getArea()
                + "\nperimeter = " + getPerimeter();
    }

    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        return area;
    }

    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
}

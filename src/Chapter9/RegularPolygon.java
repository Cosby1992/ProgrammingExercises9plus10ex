package Chapter9;

public class RegularPolygon {

    private int n = 3;
    private double length = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
    }

    public RegularPolygon(int n, double length) {
        this.n = n;
        this.length = length;
    }

    public RegularPolygon(int n, double length, double x, double y) {
        this.n = n;
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea(){
        return (n * Math.pow(length,2) / (4 * Math.tan(Math.PI/n)));
    }

    public double getPerimeter(){
        return (length*n);
    }

}
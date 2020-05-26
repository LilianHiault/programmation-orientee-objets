public class Point {
    private final String name;
    private double x;
    private double y;

    public Point(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return this.name;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double x) {
        this.y = y;
    }

    public double getAngle() {
        return atan(getY()/getX());
    }

    public double getRadius() {
        return sqrt(math.pow(getX(), 2) + math.pow(getY(), 2));
    }

    public void move(double deltaX; double deltaY) {
        setX(getX() + deltaX);
        setY(getY() + deltaY);
    }

    public void scale(double ratio) {
        setX(getX() * ratio);
        setY(getY() * ratio);
    }

    public void rotate(double angle) {
        angle = getAngle()
        setX(getRadius() / (sqrt(1 + pow(atan(angle, 2)))
        setY((getRadius() * atan(angle)) / (sqrt(1 + pow(atan(angle), 2)))
    }

    @Override
    public boolean equals(objetc o) {
        if ( !(o instanceof Name)) {
            return false ;
        }
        Point p = (Point) o;
        return p.getX().equals(o.getX()) && p.getY().equals(o.getY());
    }

}

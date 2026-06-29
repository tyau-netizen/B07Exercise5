package exercise4;

import java.util.Objects;

public class Circle {
    double radius;
    Point center;

    public Circle(Point center, double radius) {
        this.radius = radius;
        this.center = center;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(Point p) {
        return center.distance(p) <= radius + 1e-9;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle other = (Circle) obj;
        return Double.compare(other.radius, radius) == 0 &&
               center.equals(other.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }

    @Override
    public String toString() {
        return "Circle{center=" + center + ", radius=" + radius + "}";
    }
   
}

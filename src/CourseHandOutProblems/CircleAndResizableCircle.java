package CourseHandOutProblems;

import java.lang.Math;

public class CircleAndResizableCircle {

    public static class Circle {
        double radius;

        Circle(double rad) {
            this.radius = rad;
        }

        double getRadius() {
            return radius;
        }

        double getArea() {
            return Math.PI * radius * radius;
        }

        double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return "Circle[radius=" + radius + "]";
        }

    }

    public static class ResizableCircle extends Circle {
        ResizableCircle(double rad) {
            super(rad);
        }

        void resize(double per) {
            boolean pos = true;
            if (per < 0) {
                pos = false;
            }
            per = Math.abs(per);
            double value = radius * (per / 100);
            if (pos) {
                radius += value;
            } else {
                radius -= value;
            }

        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getRadius());
        System.out.println(c1.toString());

        ResizableCircle rc1 = new ResizableCircle(5.0);
        rc1.resize(-50);
        System.out.println(rc1.getArea());
        System.out.println(rc1.getPerimeter());
        System.out.println(rc1.getRadius());
        System.out.println(rc1.toString());
    }
}

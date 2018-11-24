package com.company;

public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public static class Point {
        private int x;
        private int y;

        public Point(int x1, int y1) {
            this.x = x1;
            this.y = y1;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x1=" + x +
                    ", y1=" + y +
                    '}';
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public double getSquareOfTriangle() {
        double s;
        int x1 = this.point1.getX();
        int y1 = this.point1.getY();
        int x2 = this.point2.getX();
        int y2 = this.point2.getY();
        int x3 = this.point3.getX();
        int y3 = this.point3.getY();
        s = 0.5 * ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));
        if (s < 0) {
            s = -1 * s;
        }
        return s;

    }
}

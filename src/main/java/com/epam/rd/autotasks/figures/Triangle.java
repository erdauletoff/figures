package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    private final Point A, B, C;

    public Triangle(Point a, Point b, Point c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    @Override
    public double area() {
        double ab = length(A, B);
        double bc = length(B, C);
        double ca = length(C, A);
        double s = (ab + bc + ca) / 2;
        return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
    }

    private double length(Point start, Point end) {
        double deltaX = start.getX() - end.getX();
        double deltaY = start.getY() - end.getY();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    @Override
    public String pointsToString() {
        return String.format("(%.1f,%.1f)(%.1f,%.1f)(%.1f,%.1f)",
                A.getX(), A.getY(), B.getX(), B.getY(), C.getX(), C.getY());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Point leftmostPoint() {
        if (A.getX() <= B.getX() && A.getX() <= C.getX())
            return A;
        if (B.getX() <= A.getX() && B.getX() <= C.getX())
            return B;
        else
            return C;
    }
}
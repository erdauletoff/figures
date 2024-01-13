package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {

    private final Point A, B, C, D;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
    }

    @Override
    public double area() {
        double ABC = new Triangle(A, B, C).area();
        return new Triangle(A, B, C).area() + new Triangle(A, C, D).area();
    }

    @Override
    public String pointsToString() {
        return String.format("(%.1f,%.1f)(%.1f,%.1f)(%.1f,%.1f)(%.1f,%.1f)",
                A.getX(), A.getY(), B.getX(), B.getY(), C.getX(), C.getY(), D.getX(), D.getY());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Point leftmostPoint() {
        if (A.getX() <= B.getX() && A.getX() <= C.getX() && A.getX() <= D.getX())
            return A;
        if (B.getX() <= A.getX() && B.getX() <= C.getX() && B.getX() <= D.getX())
            return B;
        if (C.getX() <= A.getX() && C.getX() <= B.getX() && C.getX() <= D.getX())
            return C;
        else
            return D;
    }
}
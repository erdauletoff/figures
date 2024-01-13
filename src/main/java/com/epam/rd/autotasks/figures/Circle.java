package com.epam.rd.autotasks.figures;

class Circle extends Figure {
    private final Point CENTER;
    private final double RADIUS;

    public Circle(Point center, double radius) {
        this.CENTER = center;
        this.RADIUS = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(RADIUS, 2);
    }

    @Override
    public String pointsToString() {
        return String.format("(%.1f,%.1f)", CENTER.getX(), CENTER.getY());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + RADIUS + "]";
    }

    @Override
    public Point leftmostPoint() {
        return new Point(CENTER.getX() - RADIUS, CENTER.getY());
    }
}
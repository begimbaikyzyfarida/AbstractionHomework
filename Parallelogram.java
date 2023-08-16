class Parallelogram extends Shape {
    private double base;
    private double side;

    public Parallelogram(double base, double side) {
        this.base = base;
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 2 * (base + side);
    }
}

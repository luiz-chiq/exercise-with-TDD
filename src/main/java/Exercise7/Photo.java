package Exercise7;

public class Photo {

    private double height;
    private double width;

    public Photo(double height, double width) {
        validate(height, width);
        this.height = height;
        this.width = width;
    }

    public void rotate() {
        double aux = height;
        height = width;
        width = aux;
    }

    private void validate(double height, double width) {
        if (height <= 0 || width <= 0) throw new IllegalArgumentException();
        if (height == Double.POSITIVE_INFINITY || width == Double.POSITIVE_INFINITY) throw new IllegalArgumentException();
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }


}

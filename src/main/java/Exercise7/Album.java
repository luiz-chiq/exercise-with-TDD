package Exercise7;

import Exercise7.Photo;

public class Album {

    private double height;
    private double width;
    private Photo photo1;
    private Photo photo2;


    public Album(double height, double width) {
        validate(height, width);
        this.height = height;
        this.width = width;
    }

    private void validate(double height, double width){
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

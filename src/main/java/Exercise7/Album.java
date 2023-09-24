package Exercise7;

import Exercise7.Photo;

public class Album {

    private double height;
    private double width;
    private Photo photo1;
    private Photo photo2;


    public Album(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
            return height;
            }

    public double getWidth() {
            return width;
        }

}
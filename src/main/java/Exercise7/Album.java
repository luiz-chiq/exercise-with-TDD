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

    public boolean fitPhotos(){
        if (!containsPhotos()) return false;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if(fitSideToSide() || fitAboveAndBelow()) return true;
                photo2.rotate();
            }
            photo1.rotate();
        }


        return false;
    }

    public void addPhotos(Photo photo1, Photo photo2){
        if (photo1 == null || photo2 == null) throw new IllegalArgumentException();
        this.photo1 = photo1;
        this.photo2 = photo2;
    }

    public boolean containsPhotos() {
        return photo1 != null && photo2 != null;
    }

    private boolean fitSideToSide() {
        return photo1.getWidth() + photo2.getWidth() <= width && photo1.getHeight() <= height && photo2.getHeight() <= height;
    }

    private boolean fitAboveAndBelow() {
        return photo1.getHeight() + photo2.getHeight() <= height && photo1.getWidth() <= width && photo2.getWidth() <= width;
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

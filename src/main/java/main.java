import Exercise7.Album;
import Exercise7.Photo;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura e largura da página do álbum: ");
        double albumHeight = scanner.nextDouble();
        double albumWidth = scanner.nextDouble();

        System.out.print("Digite a altura e largura da página da primeira foto: ");
        double photo1Height = scanner.nextDouble();
        double photo1Width = scanner.nextDouble();

        System.out.print("Digite a altura e largura da página da primeira foto: ");
        double photo2Height = scanner.nextDouble();
        double photo2Width = scanner.nextDouble();

        Photo photo1 = new Photo(photo1Height, photo1Width);
        Photo photo2 = new Photo(photo2Height, photo2Width);
        Album album = new Album(albumHeight, albumWidth);

        album.addPhotos(photo1, photo2);

        if (album.fitPhotos()){
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }
}

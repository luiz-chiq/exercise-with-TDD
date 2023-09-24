package Exercise7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class AlbumTest {

    @Test
    void shouldCreateValidAlbum() {
        final double height = 6;
        final double width = 9;
        final Album sut = new Album(height, width);

        assertEquals(height, sut.getHeight());
        assertEquals(width, sut.getWidth());
    }

    @Test
    void shouldThrowExceptionForNegativeAlbumSize() {
        final double height = -6;
        final double width = -6;
        assertThrows(IllegalArgumentException.class, () -> {
            final Album sut = new Album(height, width);
        });
    }
    @Test
    void shouldThrowExceptionForInfinityAlbumSize() {
        final double height = Double.POSITIVE_INFINITY;
        final double width = 8;
        assertThrows(IllegalArgumentException.class, () -> {
            final Album sut = new Album(height, width);
        });
    }

    @Test
    void shouldNotContainsPhotos() {
        final double height = 6;
        final double width = 9;
        final Album sut = new Album(height, width);
        assertFalse(sut.containsPhotos());
    }

    @Test
    void shouldAddPhotosToAlbum() {
        final double height = 6;
        final double width = 9;
        final Album sut = new Album(height, width);
        final Photo photo1 = mock();
        final Photo photo2 = mock();

        assertDoesNotThrow(() -> sut.addPhotos(photo1, photo2));
        assertTrue(sut.containsPhotos());
    }

    @Test
    void photosShouldFitOnAlbum() {
        final double height = 6;
        final double width = 9;
        final double photo1Height = 4;
        final double photo1width = 6;
        final double photo2Height = 2;
        final double photo2width = 4;

        final Album sut = new Album(height, width);
        final Photo photo1 = new Photo(photo1Height, photo1width);
        final Photo photo2 = new Photo(photo2Height, photo2width);
        sut.addPhotos(photo1, photo2);

        assertTrue(sut.fitPhotos());
    }

    @Test
    void photosShouldFitSIdeToSideOnAlbum() {
        final double height = 6;
        final double width = 9;
        final double photo1Height = 4;
        final double photo1width = 5;
        final double photo2Height = 4;
        final double photo2width = 4;

        final Album sut = new Album(height, width);
        final Photo photo1 = new Photo(photo1Height, photo1width);
        final Photo photo2 = new Photo(photo2Height, photo2width);
        sut.addPhotos(photo1, photo2);

        assertTrue(sut.fitPhotos());
    }

    @Test
    void photosShouldNotFitOnAlbum() {
        final double height = 6;
        final double width = 9;
        final double photo1Height = 4;
        final double photo1width = 6;
        final double photo2Height = 7;
        final double photo2width = 4;

        final Album sut = new Album(height, width);
        final Photo photo1 = new Photo(photo1Height, photo1width);
        final Photo photo2 = new Photo(photo2Height, photo2width);
        sut.addPhotos(photo1, photo2);

        assertFalse(sut.fitPhotos());
    }



}
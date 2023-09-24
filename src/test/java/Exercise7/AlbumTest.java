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
    void shouldAddPhotosToAlbum() {
        final double height = 6;
        final double width = 9;
        final Album sut = new Album(height, width);
        final Photo photo1 = mock();
        final Photo photo2 = mock();

        assertDoesNotThrow(() -> sut.addPhotos(photo1, photo2));
        assertTrue(sut.containsPhotos(photos));
    }

}
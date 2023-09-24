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

}
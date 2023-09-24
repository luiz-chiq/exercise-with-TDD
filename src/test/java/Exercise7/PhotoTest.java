package Exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhotoTest {

    @Test
    void shouldCreateValidPhotoSize() {
        final double height = 3.5;
        final double width = 5;
        final Photo sut = new Photo(height, width);
        assertEquals(height, sut.getHeight());
        assertEquals(width, sut.getWidth());
    }

    @Test
    void shouldThrowExceptionForInvalidPhotoSize() {
        final double height = 0;
        final double width = 5;
        assertThrows(IllegalArgumentException.class, () -> {
            final Photo sut = new Photo(height, width);
        });
    }

    @Test
    void shouldThrowExceptionForNegativePhotoSize() {
        final double height = -2;
        final double width = -3.6;
        assertThrows(IllegalArgumentException.class, () -> {
            final Photo sut = new Photo(height, width);
        });
    }
    @Test
    void shouldThrowExceptionForInfinityPhotoSize() {
        final double height = Double.POSITIVE_INFINITY;
        final double width = 12;
        assertThrows(IllegalArgumentException.class, () -> {
            final Photo sut = new Photo(height, width);
        });
    }


}
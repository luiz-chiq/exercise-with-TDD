package Exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhotoTest {

    @Test
    void shouldCreateValidPhotoSize() {
        final double heigth = 3.5;
        final double width = 5;
        final Photo sut = new Photo(heigth, width);
        assertEquals(heigth, sut.getHeigth());
        assertEquals(width, sut.getWidth());
    }

    @Test
    void shouldThrowExceptionForInvalidPhotoSize1() {
        final double heigth = 0;
        final double width = 5;
        final Photo sut = new Photo(heigth, width);
        assertThrows(IllegalArgumentException.class, IllegalArgumentException::new);
    }

    @Test
    void shouldThrowExceptionForInvalidPhotoSize2() {
        final double heigth = -2;
        final double width = -3.6;
        final Photo sut = new Photo(heigth, width);
        assertThrows(IllegalArgumentException.class, IllegalArgumentException::new);
    }


}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneralTest {
    @Test
    public void shouldBeNormalCreateBaseNumber(){
        BaseNumber number = new BaseNumber("abcf", 16);
        assertEquals("abcf", number.getData());
    }

    @Test
    public void shouldBeNormalCreateFloatingNumber(){
        FloatingNumber number = new FloatingNumber("abf.aa", 16);
        assertEquals("abf.aa", number.getData());
    }

    @Test
    public void shouldBeHave151WhenConvertBaseNumber(){
        BaseNumber number = new BaseNumber("12121", 3);
        assertEquals("151", number.Convert(10));
    }

    @Test
    public void shouldBeNormalConvertFloatingNumber(){
        FloatingNumber number = new FloatingNumber("a.a", 16);
        assertEquals("10.10", number.Convert(10));
    }

    @Test
    public void shouldBeNormalToDoubleBaseNumber(){
        BaseNumber number = new BaseNumber("aa", 16);
        assertEquals("aa.00", number.toDouble());
    }

    @Test
    public void shouldBeHaveAWhenGetWholePartInFloatingNumber(){
        FloatingNumber number = new FloatingNumber("a.10", 16);
        assertEquals("a", number.getWholePart());
    }

    @Test
    public void shouldBeHaveAAWhenGetFloatingPartInFloatingNumber(){
        FloatingNumber number = new FloatingNumber("f.aa", 16);
        assertEquals("aa", number.getFloatingPart());
    }

}
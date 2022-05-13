import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    private List<BaseNumber> numbers;
    @BeforeEach
    public void CreateArray(){
        numbers = new ArrayList<>();
        numbers.add(new BaseNumber("ABC10", 16));
        numbers.add(new FloatingNumber("1.24F", 16));
        numbers.add(new BaseNumber("ABCF", 16));
        numbers.add(new FloatingNumber("AB.CF", 16));
    }

    @Test
    public void shouldBeNormalConvertFirstValue(){
        assertEquals("703504",numbers.get(0).Convert(10));
    }

    @Test
    public void shouldBeNormalConvertSecondValue(){
        assertEquals("1.591",numbers.get(1).Convert(10));
    }

    @Test
    public void shouldBeNormalConvertThirdValue(){
        assertEquals("43983",numbers.get(2).Convert(10));
    }

    @Test
    public void shouldBeNormalConvertFourthValue(){
        assertEquals("171.207",numbers.get(3).Convert(10));
    }
}
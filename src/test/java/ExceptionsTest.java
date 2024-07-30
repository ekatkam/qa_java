import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;


public class ExceptionsTest {

    private Feline feline;

    @Test
    public void getFoodExceptionTest() {
        Animal animal = new Animal();
        Exception exception = assertThrows(
                Exception.class, () ->
                    animal.getFood("Неизвестно"));
        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }

    @Test public void hasManeExceptionTest() {
        Exception exception = assertThrows(
                Exception.class, () -> {Lion lion = new Lion("Неизвестно", feline);
                });
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
    }
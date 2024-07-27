import com.example.Animal;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

public class ExceptionsTest {

    @Test
    public void getFoodExceptionTest() throws Exception {
        Animal animal = new Animal();
        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        try {
            animal.getFood("Неизвестно");
        }
        catch (Exception exception) {
            Assert.assertEquals(expected, exception.getMessage());
        }
    }

    @Test
    public void hasManeExceptionTest() {
        String expected = "Используйте допустимые значения пола животного - самец или самка";
         try {
            Lion lion = new Lion("Неизвестно");
        }
        catch (Exception exception) {
            Assert.assertEquals(expected, exception.getMessage());
        }
    }


}

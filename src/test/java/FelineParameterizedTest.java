import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int kittensCount;
    private final int expectedKittensCount;

    public FelineParameterizedTest(int kittensCount, int expectedKittensCount) {
        this.kittensCount = kittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][] {
                {1, 1},
                {0, 0},
                {100, 100},
        };
    }

    @Test
    public void getKittensWithParams() {
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens(kittensCount);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}

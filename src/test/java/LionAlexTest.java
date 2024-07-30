import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;


import java.util.List;

public class LionAlexTest {
    private Feline feline;

    LionAlex lionAlex = new LionAlex(feline);

    public LionAlexTest() throws Exception {
    }

    @Test
    public void getFriendsTest() {
        List<String> actual = lionAlex.getFriends();
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingTest() {
       Assert.assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() {
        Assert.assertEquals(0, lionAlex.getKittens());
    }
}

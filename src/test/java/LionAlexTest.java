import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

public class LionAlexTest {
    @Test
    public void getKittensWhithoutParamRezultZero() throws Exception {
        Feline fel = new Feline();
        LionAlex alex = new LionAlex(fel);

        Assert.assertEquals(0, alex.getKittens());
    }

    @Test
    public void getPlaceOfLivingCallMethodmRezultZoo() throws Exception {
        Feline fel = new Feline();
        LionAlex alex = new LionAlex(fel);

        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void doesHaveManeCallMethodmRezultTrue() throws Exception {
        Feline fel = new Feline();
        LionAlex alex = new LionAlex(fel);

        Assert.assertTrue(alex.doesHaveMane());
    }
}

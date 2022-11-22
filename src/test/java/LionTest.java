import com.example.Feline;
import com.example.Lion;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;

public class LionTest {
    @Test
    public void getKittensWhithoutParamRezultOne() throws Exception {
        Feline fel = new Feline();
        Lion lion = new Lion("Самец", fel);

        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodItemInListResultOK() throws Exception {
        Feline fel = new Feline();
        Lion lion = new Lion("Самка", fel);

        MatcherAssert.assertThat(lion.getFood().toString(), containsString("Животные"));
    }

    @Test
    public void doesHaveManeMaleRezultTrue() throws Exception {
        Feline fel = new Feline();
        Lion lion = new Lion("Самец", fel);

        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeFemaleRezultFalse() throws Exception {
        Feline fel = new Feline();
        Lion lion = new Lion("Самка", fel);

        Assert.assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void doesHaveManeOtherRezultException() throws Exception {
        Feline fel = new Feline();
        Lion lion = new Lion("Сам", fel);

        Assert.assertTrue(lion.doesHaveMane());
    }
}

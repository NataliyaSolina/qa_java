import com.example.Feline;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;

public class FelineTest {
    @Test
    public void getFamilyCallMethodRezultFeline() {
        Feline fel = new Feline();

        Assert.assertEquals("Кошачьи", fel.getFamily());
    }

    @Test
    public void eatMeetItemInListResultOK() throws Exception {
        Feline fel = new Feline();

        MatcherAssert.assertThat(fel.eatMeat().toString(), containsString("Рыба"));
    }

    @Test
    public void getKittensWhithoutParamRezultOne() {
        Feline fel = new Feline();

        Assert.assertEquals(1, fel.getKittens());
    }

    @Test
    public void getKittensAnyIntRezulSameInt() {
        Feline fel = new Feline();

        Assert.assertEquals(6, fel.getKittens(6));
    }
}

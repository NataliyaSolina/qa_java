import com.example.Feline;
import com.example.LionAlex;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.containsString;

@RunWith(Parameterized.class)
public class LionAlexParameterizedTest {
    private final String item;

    public LionAlexParameterizedTest(String item) {
        this.item = item;
    }

    @Parameterized.Parameters
    public static Object[] getTextData() {
        return new Object[]{
                "Марти",
                "Глория",
                "Мелман"
        };
    }

    @Test
    public void getFriendsItemInListResultOK() throws Exception {
        Feline fel = new Feline();
        LionAlex alex = new LionAlex(fel);

        MatcherAssert.assertThat(alex.getFriends().toString(), containsString(item));
    }
}

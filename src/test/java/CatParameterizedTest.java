import com.example.Cat;
import com.example.Feline;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.containsString;

@RunWith(Parameterized.class)
public class CatParameterizedTest {
    private final String item;

    public CatParameterizedTest(String item) {
        this.item = item;
    }

    @Parameterized.Parameters
    public static Object[] getTextData() {
        return new Object[]{
                "Рыба",
                "Птицы",
                "Животные"
        };
    }

    @Test
    public void getFoodItemInListResultOK() throws Exception {
        Feline fel = new Feline();
        Cat cat = new Cat(fel);

        MatcherAssert.assertThat(cat.getFood().toString(), containsString(item));
    }
}

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void getSoundCallMethodRezultMeew() {
        Feline fel = new Feline();
        Cat cat = new Cat(fel);

        Assert.assertEquals("Мяу", cat.getSound());
    }


}

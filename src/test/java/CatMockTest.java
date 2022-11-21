import com.example.Cat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {
    @Mock
    Cat cat;

    @Test
    public void getKittensCallMethodRezultOK() {
        cat.getKittens(Mockito.anyInt());
        Mockito.verify(cat, Mockito.times(1)).getKittens(Mockito.anyInt());
    }

    @Test
    public void getKittensAnyIntRezultAsInStub() {
        Mockito.when(cat.getKittens(Mockito.anyInt())).thenReturn(6);
        Assert.assertEquals(6, cat.getKittens(Mockito.anyInt()));
    }
}

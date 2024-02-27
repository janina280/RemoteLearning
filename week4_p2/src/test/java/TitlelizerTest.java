import com.nagarro.remotelearning.model.Titlelizer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TitlelizerTest {

    private final Titlelizer titlelizer = new Titlelizer();

    @Test(expected = IllegalArgumentException.class)
    public void testTitlelizeForNullShouldThrowException(){
        titlelizer.titlelize(null);
    }

    @Test
    public void testTitlelizeForEmptyStringShouldReturnEmptyString() {

        String actualResult = titlelizer.titlelize("");
        assertEquals("", actualResult);
    }
    @Test
    public void testTitlelizeForTitlelizedString(){
        String actualResult = titlelizer.titlelize("Already Titlelized String");
        assertEquals("Already Titlelized String", actualResult);
    }

    @Test
    public void testTitlelizeShouldIgnorePrepositionsString(){
        String actualResult = titlelizer.titlelize("the String Is Titlelized");
        assertEquals("the String Is Titlelized", actualResult);
    }

    @Test
    public void testTitlelizeWhenFirsWordIsPreposition(){
        String actualResult = titlelizer.titlelize("the String is Titlelized");
        assertEquals("the String Is Titlelized", actualResult);
    }

    @Test
    public void testTitlelize() {
        String actualResult = titlelizer.titlelize("please titlelize me");
        assertEquals("Please Titlelize Me", actualResult);
    }

}

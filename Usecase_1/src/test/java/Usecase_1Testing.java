import com.Usecase_1;
import org.junit.Assert;
import org.junit.Test;

public class Usecase_1Testing {
    @Test
    public void givenFirstName_IntialLetterCapital_ReturnsTrue()
    {
        String firstname = "Viswa";
        Usecase_1 usecase = new Usecase_1();
        boolean result = usecase.validatingFirstName(firstname);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_IntialLettersCapital_ReturnsTrue()
    {
        String firstname = "Spy";
        Usecase_1 usecase = new Usecase_1();
        boolean result = usecase.validatingFirstName(firstname);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_IntialLettersCapital_ReturnsFalse()
    {
        String firstname = "viswa";
        Usecase_1 usecase = new Usecase_1();
        boolean result = usecase.validatingFirstName(firstname);
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenFirstName_IntialLetterCapital_ReturnsFalse() {
        String firstname = "1Viswa";
        Usecase_1 usecase = new Usecase_1();
        boolean result = usecase.validatingFirstName(firstname);
        Assert.assertEquals(false,result);
    }
}

import com.Usecase_2;
import org.junit.Assert;
import org.junit.Test;

public class Usecase_2Testing {
    @Test
    public void givenLastName_IntialLetterCapital_ReturnsTrue()
    {
        String lastname = "Chari";
        Usecase_2 usecase = new Usecase_2();
        String result = usecase.validatingLastName(lastname);
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenLastName_IntialLettersCapital_ReturnsTrue()
    {
        String lastname = "Roy";
        Usecase_2 usecase = new Usecase_2();
        String result = usecase.validatingLastName(lastname);
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenLastName_IntialLettersCapital_ReturnsFalse()
    {
        String lastname = "chari";
        Usecase_2 usecase = new Usecase_2();
        String result = usecase.validatingLastName(lastname);
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenLastName_IntialLetterCapital_ReturnsFalse()
    {
        String lastname = "$chari";
        Usecase_2 usecase = new Usecase_2();
        String result = usecase.validatingLastName(lastname);
        Assert.assertEquals("Invalid",result);
    }
}
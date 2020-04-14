import com.Usecase_4;
import org.junit.Assert;
import org.junit.Test;

public class Usecase_4Testing {
    @Test
    public void givenNumber_Valid_ReturnsTrue()
    {
        Usecase_4 usecase = new Usecase_4();
        String number = "91 1234567890";
        Boolean result = usecase.validatingNumber(number);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenNumber_Valid_ReturnTrue()
    {
        Usecase_4 usecase = new Usecase_4();
        String number = "00 1111100000";
        Boolean result = usecase.validatingNumber(number);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenNumber_Valid_ReturnsFalse()
    {
        Usecase_4 usecase = new Usecase_4();
        String number = "911234567890";
        Boolean result = usecase.validatingNumber(number);
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenNumber_Valid_ReturnFalse()
    {
        Usecase_4 usecase = new Usecase_4();
        String number = "91-1234567890";
        Boolean result = usecase.validatingNumber(number);
        Assert.assertEquals(false,result);
    }
}

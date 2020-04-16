import com.Usecase_6;
import org.junit.Assert;
import org.junit.Test;

public class Usecase_6Testing {
    @Test
    public void givenPasswordLength_ReturnsTrue()
    {
        Usecase_6 usecase = new Usecase_6();
        String string = "hellowelCome1";
        boolean result = usecase.validating_LengthOfPassword(string);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPasswordLength_ReturnTrue()
    {
        Usecase_6 usecase = new Usecase_6();
        String string = "Welcometojava2";
        boolean result = usecase.validating_LengthOfPassword(string);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPasswordLength_ReturnFalse()
    {
        Usecase_6 usecase = new Usecase_6();
        String string = "welcome";
        boolean result = usecase.validating_LengthOfPassword(string);
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPasswordLength_ReturnsFalse()
    {
        Usecase_6 usecase = new Usecase_6();
        String string = "Hello";
        boolean result = usecase.validating_LengthOfPassword(string);
        Assert.assertEquals(false,result);
    }
}

import com.Usecase_3;
import org.junit.Assert;
import org.junit.Test;

public class Usecase_3Testing {

    @Test
    public void givenEmail_Validate_ReturnsTrue()
    {
        String email = "abc+100@gmail.com";
        Usecase_3 usecase = new Usecase_3();
        Boolean result = usecase.validatingEmail(email);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_Validates_ReturnsTrue()
    {
        String email = "abc.100@abc.com.au";
        Usecase_3 usecase = new Usecase_3();
        Boolean result = usecase.validatingEmail(email);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_Validates_ReturnsFalse()
    {
        String email = "abc@gmail.com.1a";
        Usecase_3 usecase = new Usecase_3();
        Boolean result = usecase.validatingEmail(email);
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenEmail_Validate_ReturnsFalse()
    {
        String email = "abc()*@gmail.com";
        Usecase_3 usecase = new Usecase_3();
        Boolean result = usecase.validatingEmail(email);
        Assert.assertEquals(false,result);
    }
}

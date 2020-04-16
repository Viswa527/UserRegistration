import com.Usecase_5;
import org.junit.Assert;
import org.junit.Test;

public class Usecase_5Testing {
    @Test
    public void givenPassword_ContainsOneCapital_ReturnTrue()
    {
        Usecase_5 usecase=new Usecase_5();
        String password = "Password";
        Boolean result = usecase.validatePassword_Atleast_OneCapital(password);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_ContainsOneCapital_ReturnsTrue()
    {
        Usecase_5 usecase=new Usecase_5();
        String password = "pasSword";
        Boolean result = usecase.validatePassword_Atleast_OneCapital(password);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_ContainsOneCapital_ReturnsFalse()
    {
        Usecase_5 usecase=new Usecase_5();
        String password = "1233word";
        Boolean result = usecase.validatePassword_Atleast_OneCapital(password);
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPassword_ContainsOneCapital_ReturnFalse()
    {
        Usecase_5 usecase=new Usecase_5();
        String password = "password";
        Boolean result = usecase.validatePassword_Atleast_OneCapital(password);
        Assert.assertEquals(false,result);
    }
}

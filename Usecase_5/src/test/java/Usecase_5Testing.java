import com.Usecase_5;
import org.junit.Assert;
import org.junit.Test;

public class Usecase_5Testing {
    @Test
    public void givenPassword_ContainsOneCapital_ReturnsTrue()
    {
        Usecase_5 usecase=new Usecase_5();
        String password = "Password";
        Boolean result = usecase.Rule1(password);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_ContainsOneCapital_ReturnsTrue()
    {
        Usecase_5 usecase=new Usecase_5();
        String password = "pasSword";
        Boolean result = usecase.(password);
        Assert.assertEquals(true,result);
    }
    @Test
    public void testcase_for_CheckUpperCase_in_String_1()
    {
        Usecase_5 usecase=new Usecase_5();
        String password = "1233word";
        Boolean result = usecase.Rule1(password);
        Assert.assertEquals(false,result);
    }
    @Test
    public void testcase_for_CheckUpperCase_in_String_2()
    {
        Usecase_5 usecase=new Usecase_5();
        String password = "password";
        Boolean result = usecase.Rule1(password);
        Assert.assertEquals(false,result);
    }
    @Test
    public void testcase_for_CheckUpperCase_in_String_3()
    {
        Usecase_5 usecase=new Usecase_5();
        String password = "12pase4#$7";
        Boolean result = usecase.Rule1(password);
        Assert.assertEquals(false,result);
    }
}

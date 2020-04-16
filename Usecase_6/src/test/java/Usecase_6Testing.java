import com.Usecase_6;
import org.junit.Assert;
import org.junit.Test;

public class Usecase_6Testing {
    @Test
    public void testcase_Length_Validation_IsTrue()
    {
        Usecase_6 usecase = new Usecase_6();
        String string = "hello welcome";
        Boolean result = usecase.val(string);
        Assert.assertEquals(true,result);
    }
    @Test
    public void testcase_Length_Validation2_IsTrue()
    {
        Usecase_6 usecase = new Usecase_6();
        String string = "welcometojava  ";
        Boolean result = usecase.rule2(string);
        Assert.assertEquals(true,result);
    }
    @Test
    public void testcase_Length_Validation3_IsTrue()
    {
        Usecase_6 usecase = new Usecase_6();
        String string = "welcome";
        Boolean result = usecase.rule2(string);
        Assert.assertEquals(false,result);
    }
    @Test
    public void testcase_Rule2_Validation4_IsTrue()
    {
        Usecase_6 usecase = new Usecase_6();
        String string = "Hello";
        Boolean result = usecase.rule2(string);
        Assert.assertEquals(false,result);
    }
}

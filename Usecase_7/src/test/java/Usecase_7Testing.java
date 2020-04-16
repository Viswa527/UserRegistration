import com.Usecase_7;
import org.junit.Assert;
import org.junit.Test;

public class Usecase_7Testing {
    @Test
    public void givenPassword_AtleastOneDigit_ReturnsTrue()
    {
        Usecase_7 usecase= new Usecase_7();
        String password= "Viswa2";
        boolean result = usecase.validating_AtleastOneDigit(password);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_AtleastOneDigit_ReturnTrue()
    {
        Usecase_7 usecase= new Usecase_7();
        String password= "12312";
        boolean result = usecase.validating_AtleastOneDigit(password);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_AtleastOneDigit_ReturnsFalse()
    {
        Usecase_7 usecase= new Usecase_7();
        String password= "Viswa";
        boolean result = usecase.validating_AtleastOneDigit(password);
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPassword_AtleastOneDigit_ReturnFalse()
    {
        Usecase_7 usecase= new Usecase_7();
        String password= "Omg";
        boolean result = usecase.validating_AtleastOneDigit(password);
        Assert.assertEquals(false,result);
    }
}

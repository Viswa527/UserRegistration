import com.Usecase_8;
import org.junit.Assert;
import org.junit.Test;

public class Usecase_8Testing {
    @Test
    public void givenPassword_HasAtleastOneSpecialSymbol_ReturnsTrue()
    {
        Usecase_8 usecase = new Usecase_8();
        String password = "Viswa$";
        boolean result = usecase.validating_AtleastOneSpecialSymbol_InPassword(password);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_HasAtleastOneSpecialSymbol_ReturnTrue()
    {
        Usecase_8 usecase = new Usecase_8();
        String password = "Vis@wa";
        boolean result = usecase.validating_AtleastOneSpecialSymbol_InPassword(password);
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_HasAtleastOneSpecialSymbol_ReturnFalse()
    {
        Usecase_8 usecase = new Usecase_8();
        String password = "Viswa";
        boolean result = usecase.validating_AtleastOneSpecialSymbol_InPassword(password);
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPassword_HasAtleastOneSpecialSymbol_ReturnsFalse()
    {
        Usecase_8 usecase = new Usecase_8();
        String password = "Viswa123";
        boolean result = usecase.validating_AtleastOneSpecialSymbol_InPassword(password);
        Assert.assertEquals(false,result);
    }
}

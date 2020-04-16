package com;

import java.util.regex.Pattern;

public class Usecase_8 {
    public boolean validating_AtleastOneSpecialSymbol_InPassword(String password)
    {
        String strings = "^[a-zA-Z0-9]*[@#$%]+[a-zA-Z0-9]*$";
        Pattern pat = Pattern.compile(strings);
        return pat.matcher(password).matches();
    }
}

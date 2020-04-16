package com;

import java.util.regex.Pattern;

public class Usecase_7 {
    public boolean validating_AtleastOneDigit(String string)
    {
        String strings = "^[a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*$";
        Pattern pat = Pattern.compile(strings);
        return pat.matcher(string).matches();
    }
}

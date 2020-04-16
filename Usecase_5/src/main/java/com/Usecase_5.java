package com;

import java.util.regex.Pattern;

public class Usecase_5 {
    public Boolean validatePassword_Atleast_OneCapital(String string)
    {
            String strings = "^[a-zA-Z]*[A-Z]+[a-zA-Z]*$";
            Pattern pat = Pattern.compile(strings);
            return pat.matcher(string).matches();
    }
}

package com;

import java.util.regex.Pattern;

public class Usecase_6 {
    public boolean validating_LengthOfPassword(String string)
    {
        String strings = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}";
        Pattern pat = Pattern.compile(strings);
        return pat.matcher(string).matches();
    }
}

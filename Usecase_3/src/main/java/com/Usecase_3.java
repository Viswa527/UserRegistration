package com;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usecase_3
{
    public boolean validatingEmail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        return pat.matcher(email).matches();
    }

}

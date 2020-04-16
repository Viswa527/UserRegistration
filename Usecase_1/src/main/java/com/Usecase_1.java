package com;

import java.util.regex.Pattern;

public class Usecase_1 {
    public boolean validatingFirstName(String firstName)
    {
        String lastname ="^[A-Z]{1}[a-z]{2,}$";
        Pattern pat = Pattern.compile(lastname);
        return pat.matcher(firstName).matches();
    }
}

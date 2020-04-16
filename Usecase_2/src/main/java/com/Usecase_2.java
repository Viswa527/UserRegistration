package com;

import java.util.regex.Pattern;

public class Usecase_2 {
    public boolean validatingLastName(String lastName)
    {
        String lastname ="^[A-Z]{1}[a-z]{2,}$";
        Pattern pat = Pattern.compile(lastname);
        return pat.matcher(lastName).matches();
    }
}

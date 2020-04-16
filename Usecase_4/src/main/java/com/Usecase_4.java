package com;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Usecase_4 {
    public Boolean validatingNumber(String number)
    {
        String phoneNumber = "^[1-9]{2} [1-9]{1}[\\d]{9}";
        Pattern pat = Pattern.compile(phoneNumber);
        return pat.matcher(number).matches();
    }
}

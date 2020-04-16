package com;

public class Usecase_6 {
    public Boolean validating_LengthOfPassword(String string)
    {
        String strings = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*[@$!%*#?&]).{8,}";
        Pattern pat = Pattern.compile(strings);
        return pat.matcher(string).matches();
    }
}

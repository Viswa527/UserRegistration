package com;

public class Usecase_4 {
    public Boolean validatingNumber(String number)
    {
        String firstTwoDigits= ""+number.charAt(0)+number.charAt(1);
        if(number.substring(3).length()==10 && (""+number.charAt(2)).equals(" ")&& firstTwoDigits.matches("\\d\\d"))
        {
            return  true;
        }
        else
        {
            return false;
        }
    }
}

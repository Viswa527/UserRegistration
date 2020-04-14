package com;

public class Usecase_5 {
    public Boolean validatePassword(String string)
    {
        for(int i=0 ;i<string.length();i++)
        {
            int asciiValue = (int)string.charAt(i);
            if (asciiValue >=65 && asciiValue<=90 )
            {
                return true;
            }
        }
        return false;
    }
}

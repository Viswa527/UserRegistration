package com;

public class Usecase_1 {
    public String validatingFirstName(String firstName)
    {
        int asciiValue = (int)(firstName.charAt(0));
        if(asciiValue>=65 && asciiValue<=90 && firstName.length()>2)
        {
            return "Valid";
        }
        else
        {
            return "Invalid";
        }
    }
}

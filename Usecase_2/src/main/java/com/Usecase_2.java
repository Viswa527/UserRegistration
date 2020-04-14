package com;

public class Usecase_2 {
    public String validatingLastName(String lastName)
    {
        int asciiValue = (int)(lastName.charAt(0));
        if(asciiValue>=65 && asciiValue<=90 && lastName.length()>2)
        {
            return "Valid";
        }
        else
        {
            return "Invalid";
        }
    }
}

package com.company;

import java.util.StringTokenizer;

public class lab9_ass2Runner {
    public static void main(String[] args) {

        StringTokenizer str1 = new StringTokenizer("My name is umair and roll no is 89238 096");
        System.out.println("The token count is: "+str1.countTokens());


        Tokens t = new Tokens("My name is umair and roll no is 89238 096");
        System.out.println("The token is "+t.countTokens());
    }
}

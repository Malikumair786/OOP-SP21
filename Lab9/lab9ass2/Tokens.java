package com.company;

import java.util.StringTokenizer;

public class Tokens extends StringTokenizer{
    public StringTokenizer str;

    public Tokens(String str){

        super(String.valueOf(str));
        this.str = new StringTokenizer(str);

    }
    @Override
    public int countTokens() throws NumberFormatException{
        int countToken =0;
        while(this.hasMoreElements()){
            String str;
            try{
                str= (String) this.nextElement();
                int i =Integer.parseInt(str);
            }
            catch (NumberFormatException e){
                countToken++;
            }
        }
        return countToken;
    }
}

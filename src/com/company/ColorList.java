package com.company;

public class ColorList {
    public String colorName = "";
    public String hexadecimal = "";
    public int identification;
    public static String solution = "";
    public  ColorList(int a, String b, String c){
        identification = a;
        colorName = b;
        hexadecimal = c;
    }
    public String getColorName(){
        return colorName;
    }
    public String getHexadecimal(){
        return hexadecimal;
    }


    }




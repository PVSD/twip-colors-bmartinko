package com.company;

public class conversions {

    public static void rgbToHexa(int r, int g, int b){
        int remain = 0;
        String R = "";
        String G = "";
        String B = "";
        String hexChars[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E","F"};

        while(r != 0){
         remain = r % 16;
         R += hexChars[remain];
         r /= 16;

        }while (g != 0){
         remain = g % 16;
         G += hexChars[remain];
         g /= 16;

        }while (b != 0){
        remain = b % 16;
        B += hexChars[remain];
        b /= 16;
        }
        System.out.println(R + G + B);
    }
}

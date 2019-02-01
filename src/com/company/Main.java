package com.company;
import java.util.*;
public class Main {
    public static String getRGBFromHexa(String w){
        String first = w.substring(0,2);
        String second = w.substring(2,4);
        String last = w.substring(4,6);
        int subZeroFirst = 0;
        int subOneFirst = 0;
        int subZeroSecond = 0;
        int subOneSecond = 0;
        int subZeroLast = 0;
        int subOneLast = 0;

        if(first.substring(0, 1).toUpperCase().equals("A")){
            subZeroFirst = 10;
        }
        else if(first.substring(0, 1).toUpperCase().equals("B")){
            subZeroFirst = 11;
        }
        else if(first.substring(0, 1).toUpperCase().equals("C")){
            subZeroFirst = 12;
        }
        else if(first.substring(0, 1).toUpperCase().equals("D")){
            subZeroFirst = 13;
        }
        else if(first.substring(0, 1).toUpperCase().equals("E")){
            subZeroFirst = 14;
        }
        else if(first.substring(0, 1).toUpperCase().equals("F")){
            subZeroFirst = 15;
        }
        else {
            subZeroFirst = Integer.parseInt(first.substring(0, 1));
        }

        if(first.substring(1, 2).toUpperCase().equals("A")){
            subOneFirst = 10;
        }
        else if(first.substring(1, 2).toUpperCase().equals("B")){
            subOneFirst = 11;
        }
        else if(first.substring(1, 2).toUpperCase().equals("C")){
            subOneFirst = 12;
        }
        else if(first.substring(1, 2).toUpperCase().equals("D")){
            subOneFirst = 13;
        }
        else if(first.substring(1, 2).toUpperCase().equals("E")){
            subOneFirst = 14;
        }
        else if(first.substring(1, 2).toUpperCase().equals("F")){
            subOneFirst = 15;
        }
        else {
            subOneFirst = Integer.parseInt(first.substring(1, 2));
        }

        if(second.substring(0, 1).toUpperCase().equals("A")){
            subZeroSecond = 10;
        }
        else if(second.substring(0, 1).toUpperCase().equals("B")){
            subZeroSecond = 11;
        }
        else if(second.substring(0, 1).toUpperCase().equals("C")){
            subZeroSecond = 12;
        }
        else if(second.substring(0, 1).toUpperCase().equals("D")){
            subZeroSecond = 13;
        }
        else if(second.substring(0, 1).toUpperCase().equals("E")){
            subZeroSecond = 14;
        }
        else if(second.substring(0, 1).toUpperCase().equals("F")){
            subZeroSecond = 15;
        }
        else {
            subZeroSecond = Integer.parseInt(second.substring(0, 1));
        }

        if(second.substring(1, 2).toUpperCase().equals("A")){
            subOneSecond = 10;
        }
        else if(second.substring(1, 2).toUpperCase().equals("B")){
            subOneSecond = 11;
        }
        else if(second.substring(1, 2).toUpperCase().equals("C")){
            subOneSecond = 12;
        }
        else if(second.substring(1, 2).toUpperCase().equals("D")){
            subOneSecond = 13;
        }
        else if(second.substring(1, 2).toUpperCase().equals("E")){
            subOneSecond = 14;
        }
        else if(second.substring(1, 2).toUpperCase().equals("F")){
            subOneSecond = 15;
        }
        else {
            subOneSecond = Integer.parseInt(second.substring(1, 2));
        }

        if(last.substring(0, 1).toUpperCase().equals("A")){
            subZeroLast = 10;
        }
        else if(last.substring(0, 1).toUpperCase().equals("B")){
            subZeroLast = 11;
        }
        else if(last.substring(0, 1).toUpperCase().equals("C")){
            subZeroLast = 12;
        }
        else if(last.substring(0, 1).toUpperCase().equals("D")){
            subZeroLast = 13;
        }
        else if(last.substring(0, 1).toUpperCase().equals("E")){
            subZeroLast = 14;
        }
        else if(last.substring(0, 1).toUpperCase().equals("F")){
            subZeroLast = 15;
        }
        else {
            subZeroLast = Integer.parseInt(last.substring(0, 1));
        }

        if(last.substring(1, 2).toUpperCase().equals("A")){
            subOneLast = 10;
        }
        else if(last.substring(1, 2).toUpperCase().equals("B")){
            subOneLast = 11;
        }
        else if(last.substring(1, 2).toUpperCase().equals("C")){
            subOneLast = 12;
        }
        else if(last.substring(1, 2).toUpperCase().equals("D")){
            subOneLast = 13;
        }
        else if(last.substring(1, 2).toUpperCase().equals("E")){
            subOneLast = 14;
        }
        else if(last.substring(1, 2).toUpperCase().equals("F")){
            subOneLast = 15;
        }
        else {
            subOneLast = Integer.parseInt(last.substring(1, 2));
        }
        int finalFirst = (subZeroFirst * 16) + subOneFirst;
        int finalSecond = (subZeroSecond * 16) + subOneSecond;
        int finalLast = (subZeroLast * 16) + subOneLast;

        return "r: " + finalFirst + " g: " + finalSecond + " b: " + finalLast;

    }
    public static String getHexaFromRGB(int r, int g, int b){

        int remain = 0;
        String R = "";
        String G = "";
        String B = "";
        String hexChars[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E","F"};

        while(r != 0){
            remain = r % 16;
            R = hexChars[remain] + R;
            r /= 16;

        }while (g != 0){
            remain = g % 16;
            G = hexChars[remain] + G;
            g /= 16;

        }while (b != 0){
            remain = b % 16;
            B = hexChars[remain] + B;
            b /= 16;
        }
        return R + G + B;
    }
    public static void main(String[] args) {
        boolean finish = false;

        ColorList AliceBlue = new ColorList(0, "AliceBlue", "F0F8FF");
        ColorList AntiqueWhite = new ColorList(1, "AntiqueWhite", "FAEBD7");
        ColorList Aqua = new ColorList(2, "Aqua", "00FFFF");
        ColorList Aquamarine = new ColorList(3, "Aquamarine", "7FFFD4");
        ColorList Azure = new ColorList(4, "Azure", "F0FFFF");
        ColorList Beige = new ColorList(5, "Beige", "F5F5DC");
        ColorList Bisque = new ColorList(6, "Bisque", "FFE4C4");
        ColorList Black = new ColorList(7, "Black", "000000");
        ColorList BlanchedAlmond = new ColorList(8, "BlanchedAlmond", "FFEBCD");
        ColorList Blue = new ColorList(9, "Blue", "0000FF");
        ColorList BlueViolet = new ColorList(10, "BlueViolet", "8A2BE2");
        ColorList Brown = new ColorList(11, "Brown", "A52A2A");
        ColorList BurlyWood = new ColorList(12, "BurlyWood", "DEB887");
        ColorList CadetBlue = new ColorList(13, "CadetBlue", "5F9EA0");
        ColorList Chartreuse = new ColorList(14, "Chartreuse", "7FFF00");
        ColorList Chocolate = new ColorList(15, "Chocolate", "D2691E");
        ColorList Coral = new ColorList(16, "Coral", "FF7F50");
        ColorList CornflowerBlue = new ColorList(17, "CornflowerBlue", "6495ED");
        ColorList Cornsilk = new ColorList(18, "Cornsilk", "FFF8DC");
        ColorList Crimson = new ColorList(19, "Crimson", "DC143C");
        ColorList Cyan = new ColorList(20, "Cyan", "00FFFF");
        ColorList DarkBlue = new ColorList(21, "DarkBlue", "00008B");
        ColorList DarkCyan = new ColorList(22, "DarkCyan", "008B8B");
        ColorList DarkGoldenRod = new ColorList(23, "DarkGoldenRod", "B8860B");
        ColorList DarkGray = new ColorList(24, "DarkGray", "A9A9A9");
        ColorList DarkGreen = new ColorList(25, "DarkGreen", "006400");
        ColorList DarkKhaki = new ColorList(26, "DarkKhaki", "BDB76B");
        ColorList DarkMagenta = new ColorList(27, "DarkMagenta", "8B008B");
        ColorList DarkOliveGreen = new ColorList(28, "DarkOliveGreen", "556B2F");
        ColorList DarkOrange = new ColorList(29, "DarkOrange", "FF8C00");
        ColorList DarkOrchid = new ColorList(30, "DarkOrchid", "9932CC");
        ColorList DarkRed = new ColorList(31, "DarkRed", "8B0000");
        ColorList DarkSalmon = new ColorList(32, "DarkSalmon", "E9967A");
        ColorList DarkSeaGreen = new ColorList(33, "DarkSeaGreen", "8FBC8F");
        ColorList DarkSlateBlue = new ColorList(34, "DarkSlateBlue", "483D8B");
        ColorList DarkSlateGray = new ColorList(35, "DarkSlateGray", "2F4F4F");
        ColorList DarkTurquoise = new ColorList(36, "DarkTurquoise", "00CED1");
        ColorList DarkViolet = new ColorList(37, "DarkViolet", "9400D3");
        ColorList DeepPink = new ColorList(38, "DeepPink", "FF1493");
        ColorList DeepSkyBlue = new ColorList(39, "DeepSkyBlue", "00BFFF");
        ColorList DimGray = new ColorList(40, "DimGray", "696969");
        ColorList DodgerBlue = new ColorList(41, "DodgerBlue", "1E90FF");
        ColorList FireBrick = new ColorList(42, "FireBrick", "B22222");
        ColorList FloralWhite = new ColorList(43, "FloralWhite", "FFFAF0");
        ColorList ForestGreen = new ColorList(44, "ForestGreen", "228B22");
        ColorList Fuchsia = new ColorList(45, "Fuchsia", "FF00FF");
        ColorList Gainsboro = new ColorList(46, "Gainsboro", "DCDCDC");
        ColorList GhostWhite = new ColorList(47, "GhostWhite", "F8F8FF");
        ColorList Gold = new ColorList(48, "Gold", "FFD700");
        ColorList GoldenRod = new ColorList(49, "GoldenRod", "DAA520");
        ColorList Gray = new ColorList(50, "Gray", "808080");
        ColorList Green = new ColorList(51, "Green", "008000");
        ColorList GreenYellow = new ColorList(52, "GreenYellow", "ADFF2F");
        ColorList HoneyDew = new ColorList(53, "HoneyDew", "F0FFF0");
        ColorList HotPink = new ColorList(54, "HotPink", "FF69B4");
        ColorList IndianRed = new ColorList(55, "IndianRed", "CD5C5C");
        ColorList Indigo = new ColorList(56, "Indigo", "4B0082");
        ColorList Ivory = new ColorList(57, "Ivory", "FFFFF0");
        ColorList Khaki = new ColorList(58, "Khaki", "F0E68C");
        ColorList Lavender = new ColorList(59, "Lavender", "E6E6FA");
        ColorList LavenderBlush = new ColorList(60, "LavenderBlush", "FFF0F5");
        ColorList LawnGreen = new ColorList(61, "LawnGreen", "7CFC00");
        ColorList LemonChiffon = new ColorList(62, "LemonChiffon", "FFFACD");
        ColorList LightBlue = new ColorList(63, "LightBlue", "ADD8E6");
        ColorList LightCoral = new ColorList(64, "LightCoral", "F08080");
        ColorList LightCyan = new ColorList(65, "LightCyan", "E0FFFF");
        ColorList LightGoldenRodYellow = new ColorList(66, "LightGoldenRodYellow", "FAFAD2");
        ColorList LightGray = new ColorList(67, "LightGray", "D3D3D3");
        ColorList LightGreen = new ColorList(68, "LightGreen", "90EE90");
        ColorList LightPink = new ColorList(69, "LightPink", "FFB6C1");
        ColorList LightSalmon = new ColorList(70, "LightSalmon", "FFA07A");
        ColorList LightSeaGreen = new ColorList(71, "LightSeaGreen", "20B2AA");
        ColorList LightSkyBlue = new ColorList(72, "LightSkyBlue", "87CEFA");
        ColorList LightSlateGray = new ColorList(73, "LightSlateGray", "778899");
        ColorList LightSteelBlue = new ColorList(74, "LightSteelBlue", "B0C4DE");
        ColorList LightYellow = new ColorList(75, "LightYellow", "FFFFE0");
        ColorList Lime = new ColorList(76, "Lime", "00FF00");
        ColorList LimeGreen = new ColorList(77, "LimeGreen", "32CD32");
        ColorList Linen = new ColorList(78, "Linen", "FAF0E6");
        ColorList Magenta = new ColorList(79, "Magenta", "FF00FF");
        ColorList Maroon = new ColorList(80, "Maroon", "800000");
        ColorList MediumAquaMarine = new ColorList(81, "MediumAquaMarine", "66CDAA");
        ColorList MediumBlue = new ColorList(82, "MediumBlue", "0000CD");
        ColorList MediumOrchid = new ColorList(83, "MediumOrchid", "BA55D3");
        ColorList MediumPurple = new ColorList(84, "MediumPurple", "9370DB");
        ColorList MediumSeaGreen = new ColorList(85, "MediumSeaGreen", "3CB371");
        ColorList MediumSlateBlue = new ColorList(86, "MediumSlateBlue", "7B68EE");
        ColorList MediumSpringGreen = new ColorList(87, "MediumSpringGreen", "00FA9A");
        ColorList MediumTurquoise = new ColorList(88, "MediumTurquoise", "48D1CC");
        ColorList MediumVioletRed = new ColorList(89, "MediumVioletRed", "C71585");
        ColorList MidnightBlue = new ColorList(90, "MidnightBlue", "191970");
        ColorList MintCream = new ColorList(91, "MintCream", "F5FFFA");
        ColorList MistyRose = new ColorList(92, "MistyRose", "FFE4E1");
        ColorList Moccasin = new ColorList(93, "Moccasin", "FFE4B5");
        ColorList NavajoWhite = new ColorList(94, "NavajoWhite", "FFDEAD");
        ColorList Navy = new ColorList(95, "Navy", "000080");
        ColorList OldLace = new ColorList(96, "OldLace", "FDF5E6");
        ColorList Olive = new ColorList(97, "Olive", "808000");
        ColorList OliveDrab = new ColorList(98, "OliveDrab", "6B8E23");
        ColorList Orange = new ColorList(99, "Orange", "FFA500");
        ColorList OrangeRed = new ColorList(100, "OrangeRed", "FF4500");
        ColorList Orchid = new ColorList(101, "Orchid", "DA70D6");
        ColorList PaleGoldenRod= new ColorList(102, "PaleGoldenRod", "EEE8AA");
        ColorList PaleGreen= new ColorList(103, "PaleGreen", "98FB98");
        ColorList PaleTurquoise = new ColorList(104, "PaleTurquoise", "AFEEEE");
        ColorList PaleVioletRed = new ColorList(105, "PaleVioletRed", "DB7093");
        ColorList PapayaWhip = new ColorList(106, "PapayaWhip", "FFEFD5");
        ColorList PeachPuff = new ColorList(107, "PeachPuff", "FFDAB9");
        ColorList Peru = new ColorList(108, "Peru", "CD853F");
        ColorList Pink = new ColorList(109, "Pink", "FFC0CB");
        ColorList Plum = new ColorList(110, "Plum", "DDA0DD");
        ColorList PowderBlue = new ColorList(111, "PowderBlue", "B0E0E6");
        ColorList Purple = new ColorList(112, "Purple", "800080");
        ColorList RebeccaPurple = new ColorList(113, "RebeccaPurple", "663399");
        ColorList Red = new ColorList(114, "Red", "FF0000");
        ColorList RosyBrown = new ColorList(115, "RosyBrown", "BC8F8F");
        ColorList RoyalBlue = new ColorList(116, "RoyalBlue", "4169E1");
        ColorList SaddleBrown = new ColorList(117, "SaddleBrown", "8B4513");
        ColorList Salmon = new ColorList(118, "Salmon", "FA8072");
        ColorList SandyBrown = new ColorList(119, "SandyBrown", "F4A460");
        ColorList SeaGreen = new ColorList(120, "SeaGreen", "2E8B57");
        ColorList SeaShell = new ColorList(121, "SeaShell", "FFF5EE");
        ColorList Sienna = new ColorList(122, "Sienna", "A0522D");
        ColorList Silver = new ColorList(123, "Silver", "C0C0C0");
        ColorList SkyBlue = new ColorList(124, "SkyBlue", "87CEEB");
        ColorList SlateBlue = new ColorList(125, "SlateBlue", "6A5ACD");
        ColorList SlateGray = new ColorList(126, "SlateGray", "708090");
        ColorList Snow = new ColorList(127, "Snow", "FFFAFA");
        ColorList SpringGreen = new ColorList(128, "SpringGreen", "00FF7F");
        ColorList SteelBlue = new ColorList(129, "SteelBlue", "4682B4");
        ColorList Tan = new ColorList(130, "Tan", "D2B48C");
        ColorList Teal = new ColorList(131, "Teal", "008080");
        ColorList Thistle = new ColorList(132, "Thistle", "D8BFD8");
        ColorList Tomato = new ColorList(133, "Tomato", "FF6347");
        ColorList Turquoise = new ColorList(134, "Turquoise", "40E0D0");
        ColorList Violet = new ColorList(135, "Violet", "EE82EE");
        ColorList Wheat = new ColorList(136, "Wheat", "F5DEB3");
        ColorList White = new ColorList(137, "White", "FFFFFF");
        ColorList WhiteSmoke = new ColorList(138, "WhiteSmoke", "F5F5F5");
        ColorList Yellow = new ColorList(139, "Yellow", "FFFF00");
        ColorList YellowGreen = new ColorList(140, "YellowGreen", "9ACD32");

        ColorList colorBank[] = {AliceBlue, AntiqueWhite, Aqua, Aquamarine, Azure, Beige, Bisque, Black, BlanchedAlmond, Blue, BlueViolet, Brown, BurlyWood, CadetBlue, Chartreuse, Chocolate, Coral, CornflowerBlue, Cornsilk, Crimson, Cyan, DarkBlue, DarkCyan, DarkGoldenRod, DarkGray, DarkGreen, DarkKhaki, DarkMagenta, DarkOliveGreen, DarkOrange, DarkOrchid, DarkRed, DarkSalmon, DarkSeaGreen, DarkSlateBlue, DarkSlateGray, DarkTurquoise, DarkViolet, DeepPink, DeepSkyBlue, DimGray, DodgerBlue, FireBrick, FloralWhite, ForestGreen, Fuchsia, Gainsboro, GhostWhite, Gold, GoldenRod, Gray, Green, GreenYellow, HoneyDew, HotPink, IndianRed, Indigo, Ivory, Khaki, Lavender, LavenderBlush, LawnGreen, LemonChiffon, LightBlue, LightCoral, LightCyan, LightGoldenRodYellow, LightGray, LightGreen, LightPink, LightSalmon, LightSeaGreen, LightSkyBlue, LightSlateGray, LightSteelBlue, LightYellow, Lime, LimeGreen, Linen, Magenta, Maroon, MediumAquaMarine, MediumBlue, MediumOrchid, MediumPurple, MediumSeaGreen, MediumSlateBlue, MediumSpringGreen, MediumTurquoise, MediumVioletRed, MidnightBlue, MintCream, MistyRose, Moccasin, NavajoWhite, Navy, OldLace, Olive, OliveDrab, Orange, OrangeRed, Orchid, PaleGoldenRod, PaleGreen, PaleTurquoise, PaleVioletRed, PapayaWhip, PeachPuff, Peru, Pink, Plum, PowderBlue, Purple, RebeccaPurple, Red, RosyBrown, RoyalBlue, SaddleBrown, Salmon, SandyBrown, SeaGreen, SeaShell, Sienna, Silver, SkyBlue, SlateBlue, SlateGray, Snow, SpringGreen, SteelBlue, Tan, Teal, Thistle, Tomato, Turquoise, Violet, Wheat, White, WhiteSmoke, Yellow, YellowGreen};



        System.out.println("Welcome to color converter! Press 1 to enter a title. Press 2 to enter Hexadecimal. " +
                "Press 3 to enter in an RGB Triplet ");
        Scanner a = new Scanner(System.in);
        int choice = a.nextInt();
        if(choice == 1){
            System.out.println("Please enter the title of the color. Keep it all in one word");
            Scanner b = new Scanner(System.in);
            String choiceA = b.nextLine();
            for(int i = 0; i < colorBank.length; i++){
                if (choiceA.equalsIgnoreCase(colorBank[i].colorName)){
                    System.out.println("Name: " +  colorBank[i].colorName);
                    System.out.println("Hexadecimal: " + colorBank[i].getHexadecimal());
                    System.out.println("RGB Value: " + getRGBFromHexa(colorBank[i].getHexadecimal()) );
                }else if (i < colorBank.length){
                    i++;
                }else{
                    System.out.println("Not a color on the list! Please try again");
                }
            }

        }else if (choice == 2){
            System.out.println("Please enter the hexadecimal exactly as written");
            Scanner c = new Scanner(System.in);
            String choiceB = c.nextLine();
            for (int g = 0; g < colorBank.length; g++){
                if(colorBank[g].getHexadecimal().equals(choiceB)){
                    System.out.println("Name: " + colorBank[g].getColorName());
                    System.out.println("Hexadecimal: " + choiceB);
                    System.out.println("RGB Value: " + getRGBFromHexa(colorBank[g].getHexadecimal()));
                }else if (g < colorBank.length){
                    g++;
                }else{
                    System.out.println("Not a hexadecimal from the Color Bank. Please try again.");
                }
            }
        }else if (choice == 3){
            System.out.println("Please enter the R value");
            Scanner d = new Scanner(System.in);
            int r = d.nextInt();
            System.out.println("Please enter the G value");
            int g = d.nextInt();
            System.out.println("Please enter the B value:");
            int b = d.nextInt();
            String h = getHexaFromRGB(r,g,b);
            System.out.println(h);
            for(int j = 0; j < colorBank.length; j++){
                if(colorBank[j].getHexadecimal().equals(h)){
                    System.out.println("Name: " + colorBank[j].colorName);
                    System.out.println("Hexadecimal: " + colorBank[j].getHexadecimal() );
                    System.out.println("RGB Value: " + "R: " + r + " G: " + g + " B: " + b);
                }else if (j < colorBank.length){
                    j++;
                }else{
                    System.out.println("RGB does not have a corresponding color in bank. Please try again");
                }
            }
        }else{
            System.out.println("Please enter the a number between 1-3");
        }

    }
}


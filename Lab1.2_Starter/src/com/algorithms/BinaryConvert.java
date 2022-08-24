package com.algorithms;

public class BinaryConvert {
    public static void main(String[] args){
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
        number = convertFromOctal("17");
        System.out.println("Number for octal 17: " + number);
    }

    public static int convertFromBinary(String binary){
        return Integer.parseInt(binary,2);
    }

    public static int convertFromOctal(String octal) {
        return Integer.parseInt(octal,8);
    }


}

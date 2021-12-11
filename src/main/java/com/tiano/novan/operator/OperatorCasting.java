package com.tiano.novan.operator;

public class OperatorCasting {
    public static void main(String[] args) {
        byte varByte = 100;
        System.out.println("var byte adalah " + varByte);
        short varShort = varByte;
        System.out.println("var byte ke short " + varShort);
        int varInt = varShort;
        System.out.println("var short ke integer " + varInt);
        long varIntToLong = varInt;
        System.out.println("var integer ke long " + varIntToLong);
        double varIntToDouble = varInt;
        System.out.println("var integer ke double " + varIntToDouble);
        float varIntToFloat = varInt;
        System.out.println("var integer ke float " + varIntToFloat);
        double varLongToDouble = varIntToLong;
        System.out.println("var long ke double " + varLongToDouble);
        double varFloatToDouble = varIntToFloat;
        System.out.println("var float ke double " + varFloatToDouble);
        byte varShortToByte = (byte) varShort;
        System.out.println("var short ke byte " + varShortToByte);

    }
}

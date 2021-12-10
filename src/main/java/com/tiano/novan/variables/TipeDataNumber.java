package com.tiano.novan.variables;

/**
 * TipeDataNumber
 */
public class TipeDataNumber {

    public static void main(String[] args) {
        Byte min = -128;
        Byte max = 127;
        System.out.println("byte nilai minimalnya adalah " + min + " dan maximalnya adalah " + max);

        Short min1 = -32_768;
        Short max1 = 32_767;
        System.out.println("short nilai minimalnya adalah " + min1 + " dan maximalnya adalah " + max1);
    
        Integer min2 = -2_147_483_648;
        Integer max2 = 2_147_483_647;
        System.out.println("integer nilai minimalnya adalah " + min2 + " dan maksimalnya adalah " + max2);
    
        Long min3 = -9_223_372_036_854_775_808L;
        Long max3 = 9_223_372_036_854_775_807L;
        System.out.println("long nilai minimalnya adalah " + min3 + " dan maximalnya adalah " + max3);
    
        Float min4 = -9_223_372_036_854_775_808.555f;
        Float max4 = -9_223_372_036_854_775_808.2323f;
        System.out.println("float nilai minimalnya adalah " + min4 + " dan maximalnya adalah " + max4);

        Double min5 = -9_223_372_036_854_775_808.5555d;
        Double max5 = -9_223_372_036_854_775_808.2323d;
        System.out.println("double nilai minimalnya adalah " + min5 + " dan maximalnya adalah " + max5);

    }
}
package com.tiano.novan.variables;

/**
 * TipeDataString
 */
public class TipeDataString {

    public static void main(String[] args) {
    
        String sebuahString = "Dimas Maryanto";
        System.out.println("ini adalah nilai dari sebuah string " + sebuahString.toUpperCase());
        System.out.println("");
        System.out.println("ini adalah nilai dari sebuah string pada index ke - " + sebuahString.charAt(3));
        System.out.println("");
        System.out.println("apakah nilai " + (sebuahString.equalsIgnoreCase("dimas maryanto") ? "Sama" : "Berbeda"));

    }

}


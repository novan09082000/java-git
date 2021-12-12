package com.tiano.novan.selection;

/**
 * IfElseIf
 */
public class IfElseIf {

    public static void main(String[] args) {
        String namaLengkap = "Novan Tiano";
        if(namaLengkap.equals("Novan Tiano")){
            System.out.println("Data yang dibandingkan sama");
        }else if(namaLengkap.equalsIgnoreCase("novan tiano")){
            System.out.println("Data yang dibandingkan beda tapi sama kalau huruf kecil semua");
        }else {
            System.out.println("Data yang dibandingkan berbeda");
        }
    }
}
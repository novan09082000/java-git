package com.tiano.novan.function;

public class BasicFunction {

    public static Integer getYearsOld() {
        System.out.println("umur saya adalah 21");
        return 25;
    }

    public static void setNamaLengkap() {
        System.out.println("Nama lengkap saya adalah Novan Tiano");
    }

    public static void main(String[] args) {
        System.out.println(String.format("Umur Saya Sekarang adalah", getYearsOld()));
        setNamaLengkap();
    }
    
}

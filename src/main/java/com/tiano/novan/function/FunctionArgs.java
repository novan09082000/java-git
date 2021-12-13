package com.tiano.novan.function;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FunctionArgs {
    
    public static Long getYearsOld(LocalDate date) {
        return ChronoUnit.YEARS.between(date, LocalDate.now());
    }

    public static void setNamaLengkap(String namaLengkap) {
        System.out.println("Nama lengkap saya adalah " + namaLengkap);
    }

    public static void main(String[] args) {
        
        Long umurSaya = getYearsOld(LocalDate.of(2000, 9, 8));
        System.out.println(String.format("Umur Saya Sekarang adalah %d", umurSaya));
        
        umurSaya = getYearsOld(LocalDate.of(1999, 9, 8));        
        System.out.println(String.format("Umur Saya Sekarang adalah %d", umurSaya));

        umurSaya = getYearsOld(LocalDate.of(1998, 9, 8));        
        System.out.println(String.format("Umur Saya Sekarang adalah %d", umurSaya));


        setNamaLengkap("Novan Tiano");
    }

}

package com.tiano.novan.module.nasabah;

import java.math.BigDecimal;

import com.tiano.novan.classes.Tabungan;

public class Nasabah {
    
    public static void main(String[] args) {
        
        Tabungan tabungan = new Tabungan();
        System.out.println(String.format("Saya menabunng sebesar : %2.0f", tabungan.nabung(BigDecimal.ZERO, new BigDecimal(10000))));

    }

}

package com.tiano.novan.classes;

import java.math.BigDecimal;

public class ApplicationTabungan {
    
    public BigDecimal tarikDana(BigDecimal saldo, BigDecimal tarikTunai){

        return saldo.subtract(tarikTunai);
    }

    public static void main(String[] args) {
        
        BigDecimal tabunganPertama = Tabungan.nabung(BigDecimal.ZERO, new BigDecimal(10000));
        System.out.println(String.format("Tabungan pertama saya %2.0f", tabunganPertama));

        Tabungan tabungan = new Tabungan();
        System.out.println(String.format("Penarikan tabungan %2.0f", tabungan.tarikDana(new BigDecimal(10000), new BigDecimal(5000))));

        Deposito deposito = new Deposito();
        System.out.println(String.format("Setoran awal sebesar : %2.0f", deposito.setoranAwal(new BigDecimal(25000))));

        ApplicationTabungan tabungan2 = new ApplicationTabungan();
        System.out.println(String.format("Penarikan tabungan %2.0f ", tabungan2.tarikDana(new BigDecimal(100000),new BigDecimal(99999))));

    }

}

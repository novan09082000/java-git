package com.tiano.novan.inheritance;

public class Mobil extends Sepeda{

    private String mesin = "inline 4";

    public String getMesin() {
        super.roda = 4;
        return String.format("konfigurasi mesin %s jumlah rodanya adalah %s kecepatan maksimum adalah %s", this.mesin , super.roda, this.getKecepatan());
    }

    public Long getKecepatan(Long tambahKecepatan) {
        return this.getKecepatan() + tambahKecepatan;
    }
    
}

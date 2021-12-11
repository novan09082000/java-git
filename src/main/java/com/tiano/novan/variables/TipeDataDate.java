package com.tiano.novan.variables;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// import java.text.SimpleDateFormat;
// import java.util.Date;

public class TipeDataDate {
    public static void main(String[] args) {
        // obsolate Date
        // Date tanggalSekarang = new Date();
        // SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy'T'HH:mm:ss");
        // System.out.println(String.format("tanggal sekarang adalah %s", dateFormat.format(tanggalSekarang)));
    
        LocalDateTime tanggalDanWaktuSekarang = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMM yyyy 'T' HH:mm:ss");
        System.out.println(String.format("Sekarang tanggal dan waktu : %s", dateFormat.format(tanggalDanWaktuSekarang)));
    
        LocalTime waktuSekarang = LocalTime.now();
        System.out.println(String.format("sekarang waktu : %s", waktuSekarang));
    }
}

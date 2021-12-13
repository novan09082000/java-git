package com.tiano.novan.inheritance;

public class InheritanceApplication {
    
    public static void main(String[] args) {
        
        Mobil honda = new Mobil();
        System.out.println(honda.getMesin());

        Sepeda onthel = new Sepeda();
        System.out.println(String.format("sepeda onthel rodanya adalah %s", onthel.roda));
    }


}

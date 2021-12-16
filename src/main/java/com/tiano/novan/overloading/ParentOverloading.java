package com.tiano.novan.overloading;


public class ParentOverloading {
    
    public void hitung() {
        System.out.println("10");
    }

    public void hitung(Integer value1) {
        System.out.println(String.format("args : %d", value1));
    }

    public void hitung(Integer value1, Integer value2) {
        System.out.println(String.format("args : [%d , %d]", value1, value2));
    }

    public void hitung(Integer value1, String value2) {
        System.out.println(String.format("args : [%d , %s]", value1, value2));
    }

    public void hitung(String value1, Integer value2) {
        System.out.println(String.format("args : [%s , %d]", value1, value2));
    }

    public void hitung(String value1, String value2, String value3) {
        System.out.println(String.format("args : [%s , %s, %s]", value1, value2, value3));
    }
}

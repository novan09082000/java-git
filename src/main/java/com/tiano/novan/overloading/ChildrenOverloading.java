package com.tiano.novan.overloading;

public class ChildrenOverloading extends ParentOverloading {
    
    public void hitung() {
        System.out.println(20);
    }

    public void testThisHitung(){
        this.hitung();
    }

    public void testSuperHitung() {
        super.hitung();
    }

    public void testNotSpesifik() {
        hitung();
    }

}

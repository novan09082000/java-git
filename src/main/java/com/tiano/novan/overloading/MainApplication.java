package com.tiano.novan.overloading;

public class MainApplication {
    
    public static void main(String[] args) {
        
        ParentOverloading data = new ParentOverloading();
        data.hitung("Novan","Anak","Sholeh");

        ChildrenOverloading child = new ChildrenOverloading();
        child.hitung();
        child.testThisHitung();
        child.testSuperHitung();
        child.testNotSpesifik();

    }

}

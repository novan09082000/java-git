package com.tiano.novan.overrides;

public class MainApplication {
    
    public static void main(String[] args) {
        
        ParentsOverride data = new ParentsOverride();
        data.hitung();

        data = new ChildsOverride();
        data.hitung();
    }

}

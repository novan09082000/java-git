package com.tiano.novan.loop;

public class NestedForAndIf {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0){
                System.out.println(String.format("bilangan %d adalah bilangan genap", i));
            }
        }

    }

}

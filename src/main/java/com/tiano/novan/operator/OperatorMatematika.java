package com.tiano.novan.operator;

public class OperatorMatematika {
    
    public static void main(String[] args) {
    
        Integer bil1 = 5;
        Integer bil2 = 20;
        Integer bil3 = 15;

        Integer bil4 = bil1 + bil2 + bil3;
        System.out.println(String.format("bil4 = 5 + 20 + 15 => %s ", bil4));

        Integer bil5 = bil2 - bil3;
        System.out.println(String.format("bil5 = 20 - 15 => %s", bil5));

        Integer bil6 = bil3 / bil1;
        System.out.println(String.format("bil6 = 15 / 5 => %s", bil6));

        bil6++;
        System.out.println(String.format("bil6++ => %s ", bil6));

        bil6 = bil6 + 1;
        System.out.println(String.format("bil6 = 4 + 1 => %s", bil6));
    }
}

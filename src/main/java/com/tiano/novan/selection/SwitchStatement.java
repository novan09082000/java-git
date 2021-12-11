package com.tiano.novan.selection;

public class SwitchStatement {
    public static void main(String[] args) {
        Integer bil1 = 10;

        switch (bil1) {
            case 20:
                System.out.println("bilangan 1 adalah 20");
                break;
            case 15:
                System.out.println("bilangan 1 adalah 15");
                break;
            case 10:
                System.out.println("bilangan 1 adalah 10");
                break;
            default:
                System.out.println("tidak ada bilangan yang sama");
                break;
        }

        System.out.println("Execute finish");
    }
}

package com.devix.www;

public class Main {
    private static final String TAG = Main.class.getSimpleName();

    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            System.out.println(TAG + " A ");
        }
        for (int i = Integer.MAX_VALUE - 1; i >= 0; i--) {
//            System.out.println(TAG + " B ");
        }
        System.out.println("DONE");
    }
}

package com.interbank.pe;

public class Main {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.err.println("Ingresar un valor");
        }
        System.out.println(args.length);
    }
}

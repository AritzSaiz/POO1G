package com.company;

import Modelo.Cuenta;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta_1 = new Cuenta("Aritz");
        Cuenta cuenta_2 = cuenta_2 = new Cuenta("Fernando",300);

        //Ingresa dinero en las cuentas


        System.out.println("Antes de ingresar el saldo en la Cuenta_1 es: " + cuenta_1.getCantidad());
        cuenta_1.ingresarDinero(300);
        cuenta_1.ingresarDinero(0.0f);
        System.out.println("Despues de ingresar el dinero:" + cuenta_1.getCantidad());

        cuenta_2.ingresarDinero(300);

    }
}

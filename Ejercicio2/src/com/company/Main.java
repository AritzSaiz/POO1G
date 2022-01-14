package com.company;

import Modelo.Libro;

public class Main {

    public static void main(String[] args) {

        Libro libro_1 = new Libro("1234564321B", "qqqqqq","werewq", 200);
        Libro libro_2 = new Libro("234564321C", "wwww","wgfdsfg",150);


        System.out.println(libro_1);
        System.out.println("El libro "+ libro_1.getTitulo()+ "cuyo autor es "+ libro_1.getAutor() + "tiene " + libro_1.getNumeroPaginas() + "paginas");

        System.out.println(libro_2.toString());

        int paginasMax = 0;

        if (libro_1.getNumeroPaginas()> libro_2.getNumeroPaginas()){
            System.out.println("El libro 1 tiene mas paginas");

        }else{
            System.out.println("El libro 2 tiene mas paginas");
        }

    }

}

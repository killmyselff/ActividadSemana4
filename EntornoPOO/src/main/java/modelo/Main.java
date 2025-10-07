package main.java.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Libro
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Dracula", "Bram Stoker", 417,
                BigDecimal.valueOf(350), LocalDate.of(2015, 5, 20), false);

        // BoletoCine
        BoletoCine boleto1 = new BoletoCine();
        BoletoCine boleto2 = new BoletoCine("3", "Spider-Man", "B15",
                BigDecimal.valueOf(120.5), LocalDate.of(2025, 10, 10), true);

        // PerfilRedSocial
        PerfilRedSocial perfil1 = new PerfilRedSocial();
        PerfilRedSocial perfil2 = new PerfilRedSocial("jdg.011", 1500, 200,
                "juan23.jpg", "Amante de la tecnología.", LocalDate.of(2021, 3, 15));

        // Imprimir objetos
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(boleto1);
        System.out.println(boleto2);
        System.out.println(perfil1);
        System.out.println(perfil2);
    }
}
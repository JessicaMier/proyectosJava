package fiestadelinmigrante;

import java.util.Scanner;

public class FiestaDelInmigrante {

    public static void main(String[] args) {

        System.out.println("Por favor ingrese su edad");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();
        
        System.out.println("Por favor ingrese su dni");
        int dni = teclado.nextInt();

        System.out.println("Por favor ingrese su nombre");
        Scanner teclado2 = new Scanner(System.in);
        String nombre = teclado2.next();

        while (!nombre.equalsIgnoreCase("fin") && dni != 0) {
            if (edad >= 6 && edad <= 10) {
                System.out.println("Tu categoria es Menores A");
            } else {
                if (edad >= 11 && edad <= 17) {
                    System.out.println("Tu categoria es Menores B");

                } else {
                    if (edad >= 18 && edad <= 30) {
                        System.out.println("Tu categoria es juveniles");
                    } else {
                        if (edad >= 31 && edad <= 50) {
                            System.out.println("Tu categoria es Adultos");
                        } else {
                            if (edad > 50) {
                                System.out.println("Tu categoria es Mayores");
                            } else {
                                System.out.println("La persona no cuenta con la edad indicada");
                            }
                        }
                    }
                }
            }
            System.out.println("********************************");
            // volvemos a pedir los datos para no generar bucle infinito
            System.out.println("Por favor ingrese su edad");
            edad = teclado.nextInt();
            System.out.println("Por favor ingrese su dni");
            dni = teclado.nextInt();
            System.out.println("Por favor ingrese su nombre");
            nombre = teclado2.next();

        }

    }

}

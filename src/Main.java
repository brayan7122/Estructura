//Brayan Smith Matabanchoy Zambrano

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numero;
        String nombre;

                Map<String, String> contactos = new HashMap<>();

                contactos.put("Brayan", "3132809559");
                contactos.put("Andres", "3134482420");
                contactos.put("Bandida", "3208360011");

                System.out.print("Introduce el nombre para buscar su número de teléfono: ");
                nombre = scanner.nextLine();

                numero = contactos.get(nombre);

                if (numero != null) {
                    System.out.println("El número de " + nombre + " es: " + numero);
                } else {
                    System.out.println("No se encontró el contacto para: " + nombre);
                }
            }
        }


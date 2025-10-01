package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido, porfavor ingresa una opción");
        System.out.println("1- Cajero automatico");
        System.out.println("2- Calculadora Avanzada");
        System.out.println("3- Números primos");
        System.out.println("4- Serie Fibonacci");
        System.out.println("5- Factorial");
        System.out.println("6- Estadistica de calificaciones");
        System.out.println("7- Juego de Adivinar el Número");
        System.out.println("8- Mini proyecto: Sistema de inventario");
        System.out.println("9- Salir");

        //Ingreso de valor
        int opcion;
        System.out.print("Ingresa una opción: ");
        Scanner input = new Scanner(System.in);
        opcion = input.nextInt();

        switch (opcion){
            case 1 -> cajeroAutomatico();
            case 2 -> calculadoraAvanzaada();
            case 3 -> numerosPrimos();
            case 4 -> serieFibonacci();
            case 5 -> factorial();
            case 6 -> estadisticaCalificaciones();
            case 7 -> juegoAdivinarNumero();
            case 8 -> sistemaInventario();
            case 9 -> System.out.println("Hasta luego");
            default -> System.out.println("Opción no válida.");
        }

    }

    public static void cajeroAutomatico() {
        System.out.println("=================================");
        System.out.println("Ejercicio 1 - Cajero Automatico");
        System.out.println("=================================");

        Scanner entrada = new Scanner(System.in);

        double saldo = 500.00;
        int opcion;
        do {
            System.out.println("==================================");
            System.out.println("        Cajero Automatico         ");
            System.out.println("1. Consultar saldo      ");
            System.out.println("2. Depositar dinero      ");
            System.out.println("3.  Retirar dinero      ");
            System.out.println("4. Salir      ");
            System.out.println("==================================");
            System.out.println("Seleccione una opcion");
            opcion = entrada.nextInt();
            switch(opcion) {
                case 1:
                    System.out.printf("Promedio: %.2f%n", saldo);
                    break;
                case 2:
                    System.out.printf("Ingrese la coantidad a depositar : $ ");
                    double deposito = entrada.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Deposito exitoso. Nuevo saldo actual: %.2f%n", saldo);
                    }else{
                        System.out.println("Cantidad invalida");}
                    break;
                case 3:
                    System.out.printf("Ingrese la coantidad a retirar : $ ");
                    double retiro = entrada.nextDouble();
                    if (saldo > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.printf("\nRetiro exitoso. Nuevo saldo actual: %.2f%n", saldo);
                    }else{
                        System.out.println("Cantidad invalida o fondo insuficiente");}
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
                default:
                    System.out.println("Seleccion invalidad");
            }
            System.out.println(" ");
        } while (opcion != 4);

    }

    public static void calculadoraAvanzaada() {
        System.out.println("=================================");
        System.out.println("Ejercicio 2 - Calculadora Avanzada");
        System.out.println("=================================");

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú
            System.out.println("\n=== Calculadora ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia (x^y)");
            System.out.println("6. Raíz cuadrada");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingresa el primer número: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double b = scanner.nextDouble();
                    System.out.println("Resultado: " + (a + b));
                }
                case 2 -> {
                    System.out.print("Ingresa el primer número: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double b = scanner.nextDouble();
                    System.out.println("Resultado: " + (a - b));
                }
                case 3 -> {
                    System.out.print("Ingresa el primer número: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double b = scanner.nextDouble();
                    System.out.println("Resultado: " + (a * b));
                }
                case 4 -> {
                    System.out.print("Ingresa el dividendo: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingresa el divisor: ");
                    double b = scanner.nextDouble();
                    if (b == 0) {
                        System.out.println("Error: No se puede dividir entre 0.");
                    } else {
                        System.out.println("Resultado: " + (a / b));
                    }
                }
                case 5 -> {
                    System.out.print("Ingresa la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingresa el exponente: ");
                    double exponente = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.pow(base, exponente));
                }
                case 6 -> {
                    System.out.print("Ingresa el número: ");
                    double a = scanner.nextDouble();
                    if (a < 0) {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    } else {
                        System.out.println("Resultado: " + Math.sqrt(a));
                    }
                }
                case 0 -> System.out.println("Saliendo de la calculadora...");
                default -> System.out.println("Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 0);

    }

    public static void numerosPrimos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false; // 0, 1 y negativos no son primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " NO es un número primo.");
        }
    }

    public static void serieFibonacci() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos términos de la serie Fibonacci deseas ver? ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Serie Fibonacci con " + n + " términos:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para calcular su factorial: ");
        int n = scanner.nextInt();

        long factorial = 1;

        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + n + " es: " + factorial);
        }
    }

    public static void estadisticaCalificaciones() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.print("ingrese el nombre del estudiante: ");
        nombre = entrada.nextLine();
        double suma = 0;
        int contadora = 0;
        //buble que pide 3 notas
        for( int i = 1; i<= 3; i++ ){
            System.out.println("ingerese la nota " + i + ":");
            suma += entrada.nextDouble();
            contadora++;
        }
        double promedio = suma / contadora;
        System.out.printf("Promedio: %.2f%n", promedio);
        if (promedio >=7) {
            System.out.println("\n" + nombre + " esta APROBADO");
        }else{
            System.out.println(nombre + " esta REPROBADO");
        }
    }

    public static void juegoAdivinarNumero() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // número entre 1 y 100
        int intentos = 0;
        int numeroUsuario;

        System.out.println("He pensado un número entre 1 y 100. ¡Adivínalo!");

        do {
            System.out.print("Ingresa tu número: ");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario > numeroSecreto) {
                System.out.println("Demasiado alto.");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("Demasiado bajo.");
            } else {
                System.out.println("¡Felicidades! Lo lograste en " + intentos + " intentos.");
            }

        } while (numeroUsuario != numeroSecreto);
    }

    public static void sistemaInventario() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n=== Sistema de Inventario ===");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos registrados");
            System.out.println("3. Calcular valor total del inventario");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad del producto: ");
                    int cantidad = scanner.nextInt();

                    nombres.add(nombre);
                    precios.add(precio);
                    cantidades.add(cantidad);

                    System.out.println("✅ Producto registrado con éxito.");
                }
                case 2 -> {
                    if (nombres.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        System.out.println("\n--- Lista de productos ---");
                        for (int i = 0; i < nombres.size(); i++) {
                            System.out.println((i + 1) + ". " + nombres.get(i) +
                                    " | Precio: $" + precios.get(i) +
                                    " | Cantidad: " + cantidades.get(i));
                        }
                    }
                }
                case 3 -> {
                    double total = 0;
                    for (int i = 0; i < nombres.size(); i++) {
                        total += precios.get(i) * cantidades.get(i);
                    }
                    System.out.println("💰 Valor total del inventario: $" + total);
                }
                case 4 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("⚠️ Opción inválida, intenta de nuevo.");
            }

        } while (opcion != 4);
    }
}
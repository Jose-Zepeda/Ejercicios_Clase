package edu.EjercicioClase;
import java.sql.SQLOutput;
import java.util.Scanner;

public class clsEjercicioClase {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular el área de un círculo");
            System.out.println("2. Calcular la circunferencia de un círculo");
            System.out.println("3. Calcular el volumen de un cubo");
            System.out.println("4. Calcular el área de una pirámide");
            System.out.println("5. Calcular el volumen de una pirámide");
            System.out.println("6. Calcular el área de un triángulo");
            System.out.println("7. Calcular el volumen de un prisma");
            System.out.println("8. Calcular el área de un paralelogramo");
            System.out.println("9. Calcular el volumen de un cilindro");
            System.out.println("10. Calcular el área de una esfera");
            System.out.println("11. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularAreaCirculo();
                    break;

                case 2:
                    calcularCircunferenciaCirculo();
                    break;

                case 3:
                    calcularVolumenCubo();
                    break;

                case 4:
                    calcularAreaPiramide();
                    break;

                case 5:
                    calcularVolumenPiramide();
                    break;

                case 6:
                    calcularAreaTriangulo();
                    break;

                case 7:
                    calcularVolumenPrisma();
                    break;

                case 8:
                    calcularAreaParalelogramo();
                    break;

                case 9:
                    calcularVolumenCilindro();
                    break;

                case 10:
                    calcularAreaEsfera();
                    break;

                case 11:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        }
    }

    static void calcularAreaCirculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }

    static void calcularCircunferenciaCirculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }

    static void calcularVolumenCubo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado del cubo: ");
        double lado = scanner.nextDouble();

        double volumen = lado * lado * lado;
        System.out.println("El volumen del cubo es: " + volumen);
    }

    static void calcularAreaPiramide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el área de la base de la pirámide: ");
        double areaBase = scanner.nextDouble();

        System.out.print("Ingrese el perímetro de la base de la pirámide: ");
        double perimetroBase = scanner.nextDouble();

        double apotema = Math.sqrt((perimetroBase * perimetroBase) / (4 * Math.PI));
        double area = areaBase + (perimetroBase * apotema) / 2;
        System.out.println("El área de la pirámide es: " + area);
    }

    static void calcularVolumenPiramide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el área de la base de la pirámide: ");
        double areaBase = scanner.nextDouble();

        System.out.print("Ingrese la altura de la pirámide: ");
        double altura = scanner.nextDouble();

        double volumen = (areaBase * altura) / 3;
        System.out.println("El volumen de la pirámide es: " + volumen);
    }

    static void calcularAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        double baseTriangulo = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (baseTriangulo * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    static void calcularVolumenPrisma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el área de la base del prisma: ");
        double areaBase = scanner.nextDouble();

        System.out.print("Ingrese la altura del prisma: ");
        double altura = scanner.nextDouble();

        double volumen = areaBase * altura;
        System.out.println("El volumen del prisma es: " + volumen);
    }

    static void calcularAreaParalelogramo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del paralelogramo: ");
        double baseParalelogramo = scanner.nextDouble();

        System.out.print("Ingrese la altura del paralelogramo: ");
        double altura = scanner.nextDouble();

        double area = baseParalelogramo * altura;
        System.out.println("El área del paralelogramo es: " + area);
    }

    static void calcularVolumenCilindro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        double volumen = Math.PI * radio * radio * altura;
        System.out.println("El volumen del cilindro es: " + volumen);
    }

    static void calcularAreaEsfera() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();

        double area = 4 * Math.PI * radio * radio;
        System.out.println("El área de la esfera es: " + area);
    }
    }


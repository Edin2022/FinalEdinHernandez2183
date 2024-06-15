import java.util.Scanner;

public class ExamenFinalVarianteA {

    public static void main(String[] args) {
        ExamenFinalVarianteA examen = new ExamenFinalVarianteA();
        Scanner scanner = new Scanner(System.in);
        
        // Prueba del método de concatenación
        System.out.println("Ingrese tres textos:");
        String texto1 = scanner.nextLine();
        String texto2 = scanner.nextLine();
        String texto3 = scanner.nextLine();
        examen.concatenarTextos(texto1, texto2, texto3);
        
        // Prueba del método de tabla de multiplicar
        System.out.println("Ingrese un número para generar la tabla de multiplicar:");
        int numeroTabla = scanner.nextInt();
        examen.generarTablaMultiplicar(numeroTabla);
        
        // Prueba del método de operaciones aritméticas
        System.out.println("Ingrese un número:");
        double numero = scanner.nextDouble();
        System.out.println("Ingrese un operador (+, -, *, /):");
        char operador = scanner.next().charAt(0);
        System.out.println("Ingrese otro número:");
        double otroNumero = scanner.nextDouble();
        double resultadoOperacion = examen.realizarOperacion(numero, otroNumero, operador);
        System.out.println("El resultado de la operación es: " + resultadoOperacion);
        
        // Prueba del método para determinar si es primo
        System.out.println("Ingrese un número para determinar si es primo:");
        int numeroPrimo = scanner.nextInt();
        boolean esPrimo = examen.esNumeroPrimo(numeroPrimo);
        if (esPrimo) {
            System.out.println(numeroPrimo + " es un número primo.");
        } else {
            System.out.println(numeroPrimo + " no es un número primo.");
        }
        
        scanner.close();
    }
    
    public void concatenarTextos(String texto1, String texto2, String texto3) {
        String resultado = texto1 + texto2 + texto3;
        System.out.println("Resultado de la concatenación: " + resultado);
    }
    
    public void generarTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    
    public double realizarOperacion(double numero1, double numero2, char operador) {
        double resultado = 0;
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            default:
                System.out.println("Operador no válido.");
                break;
        }
        return resultado;
    }
    
    public boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

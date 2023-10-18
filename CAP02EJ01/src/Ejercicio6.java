public class Ejercicio6 {
  public static void main(String[] args) {
    // Declaración de variables
    double base, impuestoAlValorAgregado, total;

    // Asignación de valores
    base = 200;
    impuestoAlValorAgregado = 50;

    // Cálculo del total
    total = base + impuestoAlValorAgregado;

    // Impresión de los resultados
    System.out.printf("%-15s\t%5.2f%n", "Base imponible: ", base);
    System.out.printf("%-15s\t\t%5.2f%n", "IVA", impuestoAlValorAgregado);
    System.out.printf("%-15s\t\t%5.2f%n", "Total", total);
  }
}


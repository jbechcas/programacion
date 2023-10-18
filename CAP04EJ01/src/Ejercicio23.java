import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        try {
        System.out.print("Introduce la base imponible: ");
        Scanner sc = new Scanner (System.in);
        Double baseImponible = sc.nextDouble();
        sc.nextLine();
        System.out.print("Introduzca el tipo de IVA(general, reducido o superreducido): ");
        String iva = sc.nextLine();
        double descuento = 0;
        double calcularIva = 0;
        if(iva.toUpperCase().equals("GENERAL") || iva.toUpperCase().equals("REDUCIDO") || iva.toUpperCase().equals("SUPERREDUCIDO")){
            if (iva.toUpperCase().equals("GENERAL")) {
                calcularIva = baseImponible*0.21;
            }
            if (iva.toUpperCase().equals("REDUCIDO")) {
                calcularIva = baseImponible*0.10;
            }
            if (iva.toUpperCase().equals("SUPERREDUCIDO")) {
                calcularIva = baseImponible*0.04;
            }
        }else{
            System.out.println("HAS INTRODUCIDO UN DATO ERRÓNEO, REINICIA EL PROGRAMA");
        }
        double precioIVA = baseImponible + calcularIva;
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc):");
        String codigoPromocional = sc.nextLine();
        if(codigoPromocional.toUpperCase().equals("NOPRO") || codigoPromocional.toUpperCase().equals("MITAD") || codigoPromocional.toUpperCase().equals("MENO5") || codigoPromocional.toUpperCase().equals("5PORC")){
            if (codigoPromocional.toUpperCase().equals("NOPRO")) {
                descuento = 0;
            }
            if (codigoPromocional.toUpperCase().equals("MITAD")) {
                descuento = precioIVA/2;
            }
            if (codigoPromocional.toUpperCase().equals("MENOS5")) {
                descuento = 5;
            }
            if (codigoPromocional.toUpperCase().equals("5PORC")) {
                descuento = precioIVA*0.05;
            }
            double preciofinal = precioIVA - descuento;
            System.out.printf("%-1s%27.2f%n","Base imponible",baseImponible);
            System.out.printf("%-1s%32.2f%n","IVA (10%)",calcularIva);
            System.out.printf("%-1s%27.2f%n","Precio con IVA",precioIVA);
            System.out.printf("%-1s%18s%1.2f%n","Código pormocional","-",descuento);
            System.out.printf("%-1s%36.2f%n","TOTAL",preciofinal);
            sc.close();
        }else{
            System.out.println("HAS INTRODUCIDO UN DATO ERRÓNEO, REINICIA EL PROGRAMA");
        }

        } catch (Exception e) {
            System.out.print("HAS INTRODUCIDO UN DATO ERRÓNEO, REINICIA EL PROGRAMA");
        }
        
    }
}

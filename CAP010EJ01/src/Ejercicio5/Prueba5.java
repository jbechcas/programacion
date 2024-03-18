package Ejercicio5;

import java.sql.Array;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Prueba5 {
    
    public static void main(String[] args) {
        ArrayList<Disco> discos = new ArrayList<Disco>();
        discos.add(new Disco("pop", 54));
        boolean salida = false;
        while (!salida) {
            System.out.println("_____________________________");
            System.out.println("_____________________________");
            System.out.println("1 Añadir disco");
            System.out.println("2 Listar discos");
            System.out.println("3 Borrar Disco");
            System.out.println("4 Salir");
            System.out.println("------------------------------");
            System.out.print("Introduce una opción: ");
            int opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el tema del disco: ");
                    String tema = System.console().readLine();
                    System.out.print("Introduce la duración del disco: ");
                    int duracion = Integer.parseInt(System.console().readLine());
                    discos.add(new Disco(tema, duracion));
                    break;
                case 2:
                    for (Disco disco : discos) {
                        System.out.println(disco);
                    }
                    break;
                case 3:
                System.out.println("------------------------------");
                System.out.print("Introduce el código del disco a borrar ");
                String codigo = System.console().readLine();
                int contador = -1;
                boolean econtrado = false;
                for (Disco disco : discos) {
                    contador += 1;
                    if(disco.getCodigo().equals(codigo)){
                        discos.remove(contador);
                        econtrado = true;
                        break;
                    }
                }
                if (!econtrado) {
                    System.out.println("No hay ningún disco con es código");
                }
                    break;
                case 4:
                    salida = true;
                    break;
                default:
                    break;
            }
        }
    }
}

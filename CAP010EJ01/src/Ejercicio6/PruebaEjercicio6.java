package Ejercicio6;

import java.util.HashMap;

public class PruebaEjercicio6 {
    public static void main(String[] args) {
        HashMap <String,String> m = new HashMap <String,String>();
        m.put("jorge","1234");
        m.put("lucia","hola1234");
        boolean login = false;
        for(int i = 1;i<=3;i++){
            System.out.print("Introduce el usuario: ");
            String usuario = System.console().readLine();
            System.out.print("Introduce la contraseña: ");
            String contrasena = System.console().readLine();
            System.out.println("");
            if (m.get(usuario) != null) {
                if (m.get(usuario).equals(contrasena)) {
                    login = true;
                }
            }
            if (login) {
                System.out.println("Ha accedido al área restringida");
                i = 4;
            }
            if(i == 3){
                System.out.println("Lo siento, no tiene acceso al área restringida");
            }
        }
    }
}

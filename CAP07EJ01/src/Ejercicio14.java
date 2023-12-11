public class Ejercicio14 {
    public static void main(String[] args) {
        String palabra[] = new String[8];
        String listaColores[] = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
        String colores[] = new String[8];
        String noColores[] = new String[8];
        int contColores = 0;
        int contNoColores = 0;
        for(int i = 0;i < 8;i++){
            System.out.print("Introduce una palabra: ");
            palabra[i] = System.console().readLine();
        }
        for(int i = 0;i < 8;i++){
            boolean color = false;
            for(int j = 0;j < 9;j++){
                if (palabra[i].equals(listaColores[j])) {
                    colores[contColores] = palabra[i];
                    contColores = contColores + 1;
                    color = true;
                }
            }
            if (!color) {
                noColores[contNoColores] = palabra[i];
                    contNoColores = contNoColores + 1;
            }
        }
        for(int i = 0;i < contColores;i++){
            palabra[i] = colores[i];
        }
        for(int i = contColores;i < 8;i++){
            palabra[i] = noColores[i-contColores];
        }
        System.out.printf("%-6s ","Indice");
        for(int i = 0;i<8;i++){
            System.out.printf("%-8d ",i);
            if(i == 7){
                System.out.printf("%n");
            }
        }
        System.out.printf("%-6s ","Valor");
        for(int i = 0;i<8;i++){
            System.out.printf("%-8s ",palabra[i]);
        }
    }
}


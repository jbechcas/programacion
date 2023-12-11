public class Ejercicio15 {
    public static void main(String[] args) {
        int mesa [] = new int[10];
        for(int i = 0; i<10;i++){
            mesa[i] = (int)(Math.random()*5);
        }
        System.out.printf("%-7s ","Mesa Nº");
        for(int i = 0;i<10;i++){
            System.out.printf("%-3d ",i+1);
            if(i == 9){
                System.out.printf("%n");
            }
        }
        System.out.printf("%-7s ","Valor");
        for(int i = 0;i<10;i++){
            System.out.printf("%-3d ",mesa[i]);
        }
        System.out.println(" ");
        System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
        int respuesta = Integer.parseInt(System.console().readLine());
        boolean validar = false;
        while (!validar) {
            if (respuesta == -1) {
                System.out.println("Gracias. Hasta pronto.");
                validar = true;
            }else if (respuesta > 4 || respuesta == 0 || respuesta < -1) {
                System.out.println("Lo siento, no admitimos grupos de " + respuesta +", haga grupos de 4 personas como máximo e intente de nuevo");
                System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
                respuesta = Integer.parseInt(System.console().readLine());
            }else{
                validar = true;
            }
        }
        boolean disponible = false;
        for(int i = 0; i < 10;i++){
            if (mesa[i]==0) {
                mesa[i] = respuesta;
                disponible = true;
                System.out.println("Por favor, siéntense en la mesa número " + i+1 );
                i = 10;
            }
        }
        if (!disponible){
            for(int i = 0; i < 10;i++){
                if (mesa[i] + respuesta < 5) {
                    mesa[i] = respuesta + mesa[i];
                    disponible = true;
                    System.out.println("Por favor, siéntense en la mesa número " + (i+1) );
                    i = 10;
                }
            }
        }
        if (!disponible){
            System.out.println("Lo siento, en estos momentos no queda sitio.");
        }
        System.out.printf("%-7s ","Mesa Nº");
        for(int i = 0;i<10;i++){
            System.out.printf("%-3d ",i+1);
            if(i == 9){
                System.out.printf("%n");
            }
        }
        System.out.printf("%-7s ","Valor");
        for(int i = 0;i<10;i++){
            System.out.printf("%-3d ",mesa[i]);
        }
        
    }
        
}


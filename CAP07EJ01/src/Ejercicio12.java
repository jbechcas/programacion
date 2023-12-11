/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 7. Arrays
 * 
 * Ejercicio 12
 *
 * @author Luis José Sánchez
 */
public class Ejercicio12 {
    public static void Tabla(){
        
    }
    public static void main(String[] args) {
        int num [] = new int[10];
        for (int i = 0; i<10;i++){
            System.out.print("introduce un número: ");
            num [i] = Integer.parseInt(System.console().readLine());
        }
        System.out.printf("%-6s ","Indice");
        for(int i = 0;i<10;i++){
            System.out.printf("%-3d ",i);
            if(i == 9){
                System.out.printf("%n");
            }
        }
        System.out.printf("%-6s ","Valor");
        for(int i = 0;i<10;i++){
            System.out.printf("%-3d ",num[i]);
        }
        System.out.println("");
        System.out.println("La posción inicial debe ser menor a la posición final");
        System.out.print("Introduce la posción inicial del array 0-9: ");
        int posicionInicial = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce la posción final del array 0-9: ");
        int posicionFinal = Integer.parseInt(System.console().readLine());
        boolean comprobar = false;
        while (!comprobar) {
            if (posicionInicial>posicionFinal || posicionInicial<0 || posicionInicial>9 || posicionFinal<0 || posicionFinal>9 ) {
                System.out.println("Has introducido los datos de manera errónea: ");
                System.out.print("Introduce la posción inicial del array 0-9: ");
                posicionInicial = Integer.parseInt(System.console().readLine());
                System.out.print("Introduce la posción final del array 0-9: ");
                posicionFinal = Integer.parseInt(System.console().readLine());
            }else{
                comprobar = true;
            }
        }
        int diferencia = posicionFinal-posicionInicial;
        for(int i = 1;i<=diferencia;i++){
            int valorAntiguo = num[9];
            for(int j = 9; j >= 0;j--){
                if(j == 0){
                    num[j] = valorAntiguo;
                }else{
                    num[j] = num[j-1];
                }
            }
        }
        System.out.printf("%-6s ","Indice");
        for(int i = 0;i<10;i++){
            System.out.printf("%-3d ",i);
            if(i == 9){
                System.out.printf("%n");
            }
        }
        System.out.printf("%-6s ","Valor");
        for(int i = 0;i<10;i++){
            System.out.printf("%-3d ",num[i]);
        }      
    }
}
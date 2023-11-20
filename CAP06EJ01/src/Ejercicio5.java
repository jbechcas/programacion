public class Ejercicio5 {
    public static void main(String[] args) {
        int numeromayor = 0;
        int nummenor = 102;
        int media = 0;
        for(int i = 1;i<=50;i++){
            int numero = (int)(Math.random()*100)+100;
            if(numeromayor<=numero){
                numeromayor = numero;
            }
            if(numero<=nummenor){
                nummenor = numero;
            }
            media = media + numero;
            System.out.print(numero + " ");
        }
        System.out.println("");
        System.out.println("Numero mayor: " + numeromayor);
        System.out.println("Numero menor: " + nummenor);
        System.out.printf("%1s %1.2f","Media:",((double)media/(double)50));
    }
}

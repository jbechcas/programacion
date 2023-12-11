public class Ejercicio3 {
    public static void main(String[] args) {
        int numero [] = new int[10];

        for(int i = 0;i<10;i++){
            System.out.print("Introduce un número: ");
            numero [i] = Integer.parseInt(System.console().readLine());
        }
        for(int i = 9;i>=0;i--){
            System.out.print(numero[i]);
        }
    }
}


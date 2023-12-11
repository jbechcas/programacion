public class Ejercicio7 {
    public static void main(String[] args) {
        int num [] = new int [100];
        for(int i = 0;i<100;i++){
            num [i] = (int)(Math.random()*21);
            System.out.print(num[i] + " ");
        }
        System.out.println("");
        System.out.print("Introduce el valor 1: ");
        int valor1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el valor 2: ");
        int valor2 = Integer.parseInt(System.console().readLine());
        for(int i = 0;i<100;i++){
            if (num[i] == valor1) {
                num[i] = valor2;
            }
            System.out.print(num[i] + " ");
        }
    }
}

public class Ejercicio8 {
    public static void main(String[] args) {
        int temperaturas [] = new int[12];
        for (int i = 0;i<12;i++){
            System.out.print("Introduce la temperatura del mes " + (i+1)+": ");
            temperaturas [i] = Integer.parseInt(System.console().readLine());
        }
        for (int i = 0;i<12;i++){
            System.out.print("mes " + (i+1)+": ");
            for(int j = 1;j<=temperaturas[i];j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

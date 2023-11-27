import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud = sc.nextInt();
        for(int i = 1;i<=longitud;i++){
            if (i==1){
                System.out.printf("%13s %n","@");
            }else{
                int posicion = (int)(Math.random()*3)+1;
                switch (posicion) {
                    case 1:
                        System.out.printf("%13s %n","*");
                        break;
                    case 2:
                        System.out.printf("%12s %n","*");
                        break;
                    case 3:
                        System.out.printf("%11s %n","*");
                        break;
                    default:
                        break;
                }
            }
        }
        sc.close();
    }
}

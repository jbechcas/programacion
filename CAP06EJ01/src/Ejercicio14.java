import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int max = 100;
        int desplazamiento = 0;
        for (int i = 1;i<=5;i++){
            int adivinarnum = (int)(Math.random()*(max-desplazamiento+1)) + desplazamiento;
            System.out.print("Tu número es " +  adivinarnum + " ¿Si(s) o No(n)?");
            String respuesta = sc.nextLine();
            if(i<5){
                switch (respuesta) {
                case "s":
                    i=6;
                    break;

                case "n":
                        System.out.print("Tu número es mayor(1) o menor(2)");
                        int mayomeno = sc.nextInt();
                        sc.nextLine();
                        switch (mayomeno) {
                            case 1:
                                desplazamiento = adivinarnum + 1;
                                break;
                            case 2:
                                max = adivinarnum - 1;
                                break;
                            default:
                                break;
                        }
                default:
                    break;
                }
            }else{
                switch (respuesta) {
                case "s":
                    System.out.println("He adivinado el número");
                case "n":
                    System.out.println("La próxima vez lo conseguiré");  
                default:
                    break;
                }
            }
            
        }
        sc.close();
    }
}

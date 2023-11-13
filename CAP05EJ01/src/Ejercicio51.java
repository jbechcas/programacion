import java.util.Scanner;

public class Ejercicio51 {
    public static int InvertirNumero(int num){
        String alreves = "";
        String cifras = num + "";
        int cifrasn = cifras.length();
        for(int i = 1;i<=cifrasn;i++){
            int digito = num%10;
            num = num/10;
            alreves = alreves + digito;
        }
        num = Integer.parseInt(alreves);
        return num;
    }
    public static int GusanoNumerico(int num){
        String alreves = "";
        String cifras = num + "";
        int cifrasn = cifras.length();
        for(int i = 1;i<=cifrasn;i++){
            int digito = num%10;
            num = num/10;
            if(digito!=0 && digito!=8){
                alreves = alreves + digito;
            }
        }
        num = Integer.parseInt(alreves);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca un número entero (mayor que cero): ");
        int num = sc.nextInt();

        boolean validado = false;

        while (!validado) {
            if(num>0){
                validado = true;
            }else{
                System.out.println("Has introducido un número erróneo");
                System.out.print("Introduzca un número entero (mayor que cero): ");
                num = sc.nextInt();
            }
        }

        String longnum = num + "";
        int longnumn = longnum.length();

        num = InvertirNumero(num);
        num = GusanoNumerico(num);

        String longnumgus = num + "";
        int longnumgusn = longnumgus.length();
        if(longnumgusn == longnumn){
            System.out.print("El gusano numérico no se ha comido ningún dígito");
        }else{
            System.out.print("Después de haber sido comido por el gusano numérico se queda en " + num);
        }
        sc.close();
    }
}

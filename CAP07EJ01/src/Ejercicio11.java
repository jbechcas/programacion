public class Ejercicio11 {
    public static boolean EsPrimo(boolean primo, int num){
        primo = true;
        if(num == 1 || num == 0){
            primo = false;
        }else{
            for (int i = 2;i<num;i++){
                if(num%i==0){
                    primo=false;
                    i = num;
                }
            }
        }
        return primo;
    }
    public static void main(String[] args) {
        int num[] = new int[10];
        int esPrimo[] = new int[10];
        int noPrimo[] = new int[10];
        int contprim = 0;
        int contnoprim = 0;
        boolean primo = true;
        for(int i = 0; i<10;i++ ){
            System.out.print("Introduce un número: ");
            num [i] = Integer.parseInt(System.console().readLine());
        }
        for(int i = 0;i<10;i++){
            primo = EsPrimo(primo, num[i]);
            if (primo) {
                esPrimo[contprim] = num[i];
                contprim = contprim + 1; 
            }else{
                noPrimo[contnoprim] = num[i];
                contnoprim = contnoprim + 1; 
            }
        }
        for(int i = 0;i<contprim;i++){
            num[i] = esPrimo[i];
        }
        for(int i = contnoprim;i<10;i++){
            num[i] = noPrimo[i-contnoprim];
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

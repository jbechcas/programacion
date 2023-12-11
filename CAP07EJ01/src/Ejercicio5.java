public class Ejercicio5 {
    public static void main(String[] args) {
        int num [] = new int[10];
        for(int i = 0;i <= 9;i++){
            System.out.print("Introduce un número: ");
            num[i] = Integer.parseInt(System.console().readLine());
        }
        int maximo = num[0];
        int minimo = num[0];

        //Número máximo
        for(int i = 0;i<=9;i++){
            if (num[i]>maximo) {
                maximo = num [i];
            }
        }
        //Número mínimo
        for(int i = 0;i<=9;i++){
            if (num[i]<minimo) {
                minimo = num [i];
            }
        }
        //mostar número mínimo y máximo
        for(int i = 0;i<=9;i++){
            if (num[i] == maximo) {
                System.out.println(num[i] + " - máximo");
            }else if (num[i] == minimo) {
                System.out.println(num[i] + " - minimo");
            }else{
                System.out.println(num[i]);
            }
            
        }
    }
}

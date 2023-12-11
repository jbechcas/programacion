public class Ejercicio6 {
    public static void main(String[] args) {
        int num [] = new int[15];
        for (int i = 0; i<=14;i++){
            System.out.print("Introduce un número:");
            num [i] = Integer.parseInt(System.console().readLine());
        }
        int antiguo = num [14];
        for (int i = 14; i>=0;i--){
            if (i == 0){
                num[i] = antiguo;
            }else{
                num[i] = num[i-1];
            }
        }
        for (int i = 0;i<=14;i++){
            System.out.print(num[i] + " ");
        }
    }
}

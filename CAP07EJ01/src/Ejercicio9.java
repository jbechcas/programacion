public class Ejercicio9 {
    public static void main(String[] args) {
        int num [] = new int[8];
        for (int i = 0;i<8;i++){
            System.out.print("Introduce un número: ");
            num [i] = Integer.parseInt(System.console().readLine());
        }
        for (int i = 0;i<8;i++){
            if(num[i]%2==0){
                System.out.println(num[i] + " - par");
            }else{
                System.out.println(num[i] + " - impar");
            }
            
        }
    }
}

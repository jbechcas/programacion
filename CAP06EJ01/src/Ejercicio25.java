public class Ejercicio25 {
     //(max-desplazamiento+1)) + desplazamiento;
    public static boolean Primo(boolean primo, int num){
        primo = true;
        if (num == 0 || num == 1){
            primo = false;
        }else{
            for(int i = 2;i<num;i++){
            if (num%i==0) {
                primo = false;
                i = num + 1;
            }
        }
        }
        return primo;
    }
    public static void main(String[] args) {
        for (int i = 0; i<=100; i++) {
            int numale = (int)(Math.random()*191)+10;
            if (numale%5==0) {
                System.out.print("[" + numale + "] ");
            }
            boolean primo = Primo(false, numale);
            if(primo){
                System.out.print(i + " ");
            }
            
            if (primo){
                System.out.print("#" + numale + "# ");
            }
            if (numale%5!=0 && !primo) {
                System.out.print(numale + " ");
            }
        }
    }
}

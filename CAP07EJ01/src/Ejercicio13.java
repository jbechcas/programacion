public class Ejercicio13 {
    public static void main(String[] args) {
        int num[] = new int[100];
        int numMax = 0;
        int numMin = 501;
        for (int i = 0; i<100;i++){
            num[i] = (int)(Math.random()*501);
            System.out.print(num[i] + " ");
            if (num[i] > numMax) {
                numMax = num[i];
            }
            if (num[i] < numMin) {
                numMin = num[i];
            }    
        }
        System.out.println("");
        System.out.print("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): 1: ");
        int opcion = Integer.parseInt(System.console().readLine());
        if (opcion == 1) {
            for (int i = 0; i<100;i++){
                if (num[i] == numMin){
                    System.out.print("**"+num[i]+"**"+ " ");
                }else{
                    System.out.print(num[i] + " ");
                }
            }
        }else{
            for (int i = 0; i<100;i++){
                if (num[i] == numMax){
                    System.out.print("**"+num[i]+"**"+ " ");
                }else{
                    System.out.print(num[i] + " ");
                }
            }
        }
    }
}

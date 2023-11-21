public class Ejercicio19 {
    public static void main(String[] args) {
        int nummax = -101;
        int nummin = 201;
        int media = 0;
        for(int i = 1;i<=50;i++){
            int numAle =(int)(Math.random()*301)-100;
            if (numAle<nummin && numAle%2!=0){
                nummin = numAle;
            }
            if (numAle>nummax && numAle%2==0){
                nummax = numAle;
            }
            media = media + numAle;
            System.out.print(numAle + " ");
        }
        System.out.println(" ");
        System.out.println("Num max par: " + nummax);
        System.out.println("Num min impar: " + nummin);
        System.out.printf("Media: %1.2f",(double)media/50);
    }
}

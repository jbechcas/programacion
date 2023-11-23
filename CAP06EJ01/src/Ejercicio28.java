public class Ejercicio28 {
    public static void main(String[] args) {
        boolean valido = false;
        int altura = (int)(Math.random()*11)+3;
        while (!valido) {
            if(altura%2==0){
                altura = (int)(Math.random()*11)+3;
            }else{
                valido = true;
            }
        }
        for(int i = 1;i<=altura;i++){
            if (i==1){
                System.out.println("*    *   ****   *        ****");
            }
            if(i==altura){
                System.out.println("*    *   ****   ******  *    *");
            }
            if(i==altura/2+1){
                System.out.println("******  *    *  *       ******");
            }
            else if(i!=1 && i<altura){
                System.out.println("*    *  *    *  *       *    *");
            }
        }
    }
}

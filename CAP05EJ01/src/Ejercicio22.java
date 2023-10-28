public class Ejercicio22 {
    public static void main(String[] args) {
        for(int i = 2;i<=100;i++){
            boolean sp = true;
            for(int j = 2;j<i;j++){
                if(i%j==0){
                    sp = false;
                    break;
                }
            }
            if(sp){
                System.out.println(i);
            }
        }
    }
}

public class Ejercicio10 {
    public static void main(String[] args) {
        int num [] = new int[20];
        int par [] = new int[20];
        int impar [] = new int[20];
        int contpar = 0;
        int contimp = 0;
        for(int i = 0;i<20;i++){
            num[i] = (int)(Math.random()*101);
            System.out.print(num[i] + " ");
            if (num[i]%2==0) {
                par[contpar] = num[i];
                contpar = contpar + 1;
            }else{
                impar[contimp] = num[i];
                contimp = contimp + 1;
            }
        }
        System.out.println(" ");
        for(int i = 0;i<contpar;i++){
            num[i] = par[i];
        }
        for(int i = contpar;i<20;i++){
            num[i] = impar[i-contpar];
        }
        for(int i = 0;i<20;i++){
            System.out.print(num[i] + " ");
        }
    }
}

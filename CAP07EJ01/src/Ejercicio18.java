

public class Ejercicio18 {
    public static void main(String[] args) {
        int num [] = new int[10];
        int mayor [] = new int[10];
        int menor [] = new int[10];
        int contMayor = 0;
        int contMenor = 0;
        for(int i = 0;i < 10; i++){
            num[i] = (int)(Math.random()*201);
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
        for(int i = 0;i<10;i++){
            if(num[i]<=100){
                menor[contMenor] = num[i];
                contMenor = contMenor + 1;
            }
            if(num[i]>100){
                mayor[contMayor] = num[i];
                contMayor = contMayor + 1;
            }
        }
        int j = 0;
        int k = 1;
        if(contMayor > contMenor){
            for (int i = 0;i<10;i++){
                if(i <= contMenor){
                    if (i == j) {
                        num[i] = menor[i];
                        j = j + 2;
                    }
                    if (i == k) {
                        num[i] = mayor[i];
                        k = k + 2;
                    }
                }else{
                    num[i] = mayor[contMenor+(i-contMenor)];
                }
                
            }
        }
        if(contMenor > contMayor){

        }
        System.out.println("");
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

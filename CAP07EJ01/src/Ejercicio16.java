public class Ejercicio16 {
    public static void main(String[] args) {
        int num [] = new int [20];
        for(int i = 0;i < 20;i++){
            num[i] = (int)(Math.random()*401);
            System.out.print(num[i] + " ");
        }
        System.out.println("");
        System.out.print("¿Qué números quiere resaltar? (1 los múltiplos de 5, 2 los múltiplos de 7): ");
        int resaltar = Integer.parseInt(System.console().readLine());
        switch (resaltar) {
            case 1:
                for(int i = 0;i < 20;i++){
                    if(num[i]%5==0){
                        System.out.print("["+ num[i] + "] ");
                    }else{
                        System.out.print(num[i] + " ");
                    }
                    
                }
                break;
            case 2:
                for(int i = 0;i < 20;i++){
                    if(num[i]%7==0){
                        System.out.print("["+ num[i] + "] ");
                    }else{
                        System.out.print(num[i] + " ");
                    }
                    
                }
                break;
        
            default:
                System.out.println("Has introducido una opción incorrecta");
                break;
        }
    }
}

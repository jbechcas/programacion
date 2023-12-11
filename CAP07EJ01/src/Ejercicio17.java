public class Ejercicio17 {
    public static void main(String[] args) {
        int num[] = new int[10];
        for (int i = 0;i<10;i++){
            num[i] = (int)(Math.random()*101);
            System.out.print(num[i] + " ");
        }
        boolean validar = false;
        int introducido;
        System.out.println(" ");
        while (!validar) {
            System.out.print("Introduce un número: ");
            introducido = Integer.parseInt(System.console().readLine());
            for (int i = 0;i<10;i++){
                if(num[i] == introducido){
                    validar = true;
                }
            }
            if (!validar) {
                System.out.println("El número no se encuentra en el array");
            }
            while (num[0]!=introducido) {
                int antiguo = num[9];
                for (int i = 9;i>=0;i--){
                    if(i == 0){
                        num[i] = antiguo;
                    }else{
                        num[i] = num[i-1];
                    }
                    
                }
            }
            for (int i = 0;i<10;i++){
                System.out.print(num[i] + " ");
            }
        }

    }
}

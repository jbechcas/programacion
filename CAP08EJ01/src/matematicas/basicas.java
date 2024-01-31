package matematicas;

public class basicas {


    public static int voltea(int x){
        String numStr = "";
        int longitud = digito(x);
        for (int i = 0; i < longitud;i++){
            int digito = x%10;
            x = x/10;
            numStr = numStr + digito; 
        }
        x = Integer.parseInt(numStr);
        return x;
    }


    public static boolean esCapicua(int x){
        boolean capicua = false;
        int y = voltea(x);
        if (x == y) {
            capicua = true;
        }
        return capicua;
    }
    public static boolean esPrimo(int x){
        boolean primo = true;
        if (x == 0 || x == 1) {
            primo = false;
        }else{
            for(int i = 2;i<x;i++){
            if (x%i==0) {
                primo = false;
            }
            }
        }
        return primo;
    }

    public static int siguientePrimo(int x){
        boolean seguir = true;
        int cont = x + 1;
        while (seguir) {
            boolean primo = esPrimo(cont);
            if (primo) {
                seguir = false;
            }else{
                cont = cont +1;
            }
        }
        return cont;
        }

        public static int potencia(int base, int exponente){
            int num = 1;
            for(int i  = 0;i < exponente; i ++){
                num = num * base;
            }
            return num;
        }

        public static int digito(int x){
            boolean seguir = true;
            int digito = 1;
            while (seguir) {
                x = x/10;
                if (x > 0){
                    digito = digito +1;
                }else{
                    seguir = false;
                }
            }
            return digito;
        }

        public static int digitoN(int x,int posicion){;
            x = voltea(x);
            int digitox = 0;
            for (int i = -1;i<posicion;i++){
                digitox = x%10;
                x = x/10;
            }
            return digitox;
        }
        public static int PosicionDeDigito(int num, int numcom){
            numcom = voltea(numcom);
            int longitud = digito(numcom);
            int posicion = 0;
            for(int i = 0;i < longitud;i++){
                int digito = numcom%10;
                if(digito == num){
                    posicion = i;
                    i = longitud;
                }else{
                    posicion = -1;
                    numcom = numcom/10;
                }
            }
            return posicion;
        }

        public static int quitarPorDetras(int num,int x){
            for (int i = 1; i<= x;i++){
                num = num/10;
            }
            return num;
        }

        public static int quitarPorDelante(int num,int x){
            num = voltea(num);
            for (int i = 1; i<= x;i++){
                num = num/10;
            }
            num = voltea(num);
            return num;
        }
    }




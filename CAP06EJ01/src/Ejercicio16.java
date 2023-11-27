public class Ejercicio16 {
    public static void main(String[] args) {
        String fString = "";
        int coincidir = 1;
        for(int i = 1;i<=3;i++){
            int figura = (int)(Math.random()*5)+1;
            String fStringAnt = fString;
            switch (figura) {
                case 1:
                    fString = "corazón";
                    break;
                case 2:
                    fString = "diamante";
                    break;
                case 3:
                    fString = "herradura";
                    break;
                case 4:
                    fString = "camapana";
                    break;
                case 5:
                    fString = "limón";
                    break;
            
                default:
                    break;
            
            }
            if(fString.equals(fStringAnt)){
                coincidir = coincidir + 1;
            }
            System.out.print(fString + " ");
        }
        System.out.println("");
        if (coincidir == 1) {
            System.out.println("Lo siento, has perdido");
        }
        if (coincidir == 2) {
            System.out.println("Bien, has recuperado su moneda");
        }
        if (coincidir == 3) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        }
        
    }
}

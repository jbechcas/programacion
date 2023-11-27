public class Ejercicio23 {
    public static void main(String[] args) {
        
        for(int i = 1;i<=5;i++){
            int dado = (int)(Math.random()*6)+1;
            String caraDado = "";
            switch (dado) {
                case 1:
                    caraDado = "Q";
                    break;
                case 2:
                    caraDado = "J";
                    break;
                case 3:
                    caraDado = "7";
                    break;
                case 4:
                    caraDado = "As";
                    break;
                case 5:
                    caraDado = "K";
                    break;
                case 6:
                    caraDado = "8";
                default:
                    break;
            }
            System.out.print(caraDado + " ");
        }
    }
}

public class Ejercicio21 {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            int caraCruz = (int)(Math.random()*2)+1;
            switch (i) {
                case 1:
                    System.out.print("2 céntimos - ");
                    break;
                case 2:
                    System.out.print("20 céntimos - ");
                    break;
                case 3:
                    System.out.print("50 céntimos - ");
                    break;
                case 4:
                    System.out.print("1 euro - ");
                    break;
                case 5:
                    System.out.print("2 euros - ");
                    break;
                default:
                    break;
            }
            switch (caraCruz) {
                case 1:
                    System.out.print("cara");

                    break;
                case 2:
                    System.out.print("cruz");
                    break;
                default:
                    break;
            }
            System.out.println(" ");
        }
    }
}

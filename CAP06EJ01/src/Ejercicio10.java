public class Ejercicio10 {
    public static void main(String[] args) {
        int caracteraletorio = (int)(Math.random()*5)+1;
        String caraString = "";
        int lineasaletorias = (int)(Math.random()*40)+1;
        switch (caracteraletorio) {
            case 1:
                caraString = "*";
                break;
            case 2:
                caraString = "-";
                break;
            case 3:
                caraString = "=";
                break;
            case 4:
                caraString = ".";
                break;
            case 5:
                caraString = "|";
                break;
            default:
                break;
        }
        for(int i = 1;i<=lineasaletorias;i++){
            System.out.print(caraString);
        }
    }
}

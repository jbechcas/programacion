public class Ejercicio15 {
    public static void main(String[] args) {
        boolean multiplo = false;
        int nnotas = 0;
        while (!multiplo) {
            nnotas = (int)(Math.random()*25)+4;
            if (nnotas%4==0){
                multiplo = true;
            }
        }
        String almnotaString = "";
        for(int i = 1;i<=nnotas;i++){
            int notas = (int)(Math.random()*7 + 1);
            String notaString = "";
            switch (notas) {
                case 1:
                    notaString = "do";
                    break;
                case 2:
                    notaString = "re";
                    break;
                case 3:
                    notaString = "mi";
                    break;
                case 4:
                    notaString = "fa";
                    break;
                case 5:
                    notaString = "sol";
                    break;
                case 6:
                    notaString = "la";
                    break;
                case 7:
                    notaString = "si";
                    break;
                default:
                    break;
            }
            if(i==1){
                almnotaString = notaString;
            }
            if (i==nnotas){
                System.out.print(almnotaString + " ");
                System.out.print("||");
            }else{
                System.out.print(notaString + " ");
            }
            
            if (i%4==0 && i!=nnotas){
                System.out.print("|");
            }
        }
    }
}

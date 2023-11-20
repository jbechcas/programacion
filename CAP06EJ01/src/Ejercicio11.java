public class Ejercicio11 {
    public static void main(String[] args) {
        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliete = 0;
        for (int i = 1; i<=20;i++){
            int nota = (int)(Math.random()*11);
            if (nota < 5){
                suspenso+=1;
            }
            if(nota>=5 && nota < 6){
                suficiente+=1;
            }
            if(nota>=6 && nota < 7){
                bien+=1;
            }
            if(nota>=7 && nota <= 8){
                notable+=1;
            }
            if(nota>=9 && nota <=10){
                sobresaliete+=1;
            }
        }
        System.out.println("Suspenso: " + suspenso);
        System.out.println("Suficiente: " + suficiente);
        System.out.println("Bien: " + bien);
        System.out.println("Notable: " + notable);
        System.out.println("Sobresaliente: " + sobresaliete);
    }
}

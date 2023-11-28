import java.util.Scanner;
//(max-desplazamiento+1)) + desplazamiento;
public class Ejercicio29 {
    public static void main(String[] args) {
        System.out.println("1. Primavera\r\n" + //
                "2. Verano\r\n" + //
                "3. Otoño\r\n" + //
                "4. Invierno");
        Scanner sc = new Scanner (System.in);
        System.out.println("Seleccione la estación del año (1-4): ");
        int estacion = sc.nextInt();
        switch (estacion) {
            case 1:
                //Primavera
                int tempMax = (int)(Math.random()*(30-15+1))+15;
                int tempMin = (int)(Math.random()*(tempMax-15+1))+15;
                System.out.println("Previsión del tiempo para mañana");
                System.out.println("---------------------------------");
                System.out.println("Temperatura máxima: " + tempMax);
                System.out.println("Temperatura mínima: " + tempMin);
                int nubladoSoleado = (int)(Math.random()*10)+1;
                String nuString = "";
                if (nubladoSoleado<=6){
                    nuString = "soleado";
                }else{
                    nuString = "nublado";
                }
                System.out.println(nuString);
                
                break;
            case 2:
                //Verano
                tempMax = (int)(Math.random()*(45-25+1))+25;
                tempMin = (int)(Math.random()*(tempMax-25+1))+25;
                System.out.println("Previsión del tiempo para mañana");
                System.out.println("---------------------------------");
                System.out.println("Temperatura máxima: " + tempMax);
                System.out.println("Temperatura mínima: " + tempMin);
                nubladoSoleado = (int)(Math.random()*10)+1;
                nuString = "";
                if (nubladoSoleado<=8){
                    nuString = "soleado";
                }else{
                    nuString = "nublado";
                }
                System.out.println(nuString);
                
                break;
            case 3:
            //Otoño
                tempMax = (int)(Math.random()*(30-20+1))+20;
                tempMin = (int)(Math.random()*(tempMax-20+1))+20;
                System.out.println("Previsión del tiempo para mañana");
                System.out.println("---------------------------------");
                System.out.println("Temperatura máxima: " + tempMax);
                System.out.println("Temperatura mínima: " + tempMin);
                nubladoSoleado = (int)(Math.random()*10)+1;
                nuString = "";
                if (nubladoSoleado<=4){
                    nuString = "soleado";
                }else{
                    nuString = "nublado";
                }
                System.out.println(nuString);
                
                break;
            case 4:
            //Invierno
                tempMax = (int)(Math.random()*(25+1));
                tempMin = (int)(Math.random()*(tempMax+1));
                System.out.println("Previsión del tiempo para mañana");
                System.out.println("---------------------------------");
                System.out.println("Temperatura máxima: " + tempMax);
                System.out.println("Temperatura mínima: " + tempMin);
                nubladoSoleado = (int)(Math.random()*10)+1;
                nuString = "";
                if (nubladoSoleado<=2){
                    nuString = "soleado";
                }else{
                    nuString = "nublado";
                }
                System.out.println(nuString);
                
                break;
            
        }
        sc.close();
    }
    
}

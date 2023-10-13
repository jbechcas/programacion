import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("***HOROSCOPO***");
        System.out.print("Introduce el mes: ");
        Scanner sc = new Scanner (System.in);
        int mes = sc.nextInt();
        System.out.print("Introduce el día del mes: ");
        int mesDia = sc.nextInt();
        sc.close();
        if(mes==1){
            if(mesDia>=1 && mesDia<19){
                System.out.print("Capricornio");
            }
            if(mesDia>=20 && mesDia<=31){
                System.out.print("Aquario");
            }
        }
        
        if(mes==2){
            if(mesDia>=1 && mesDia<18){
                System.out.print("Aquario");
            }
            if(mesDia>=20 && mesDia<=31){
                System.out.print("Piscis");
            }
        }
        if(mes==3){
            if(mesDia>=1 && mesDia<=20){
                System.out.print("Piscis");
            }
            if(mesDia>=21 && mesDia<=31){
                System.out.print("Aries");
            }
        }
        if(mes==4){
            if(mesDia>=1 && mesDia<=19){
                System.out.print("Aries");
            }
            if(mesDia>=20 && mesDia<=30){
                System.out.print("Tauro");
            }
        }
        if(mes==5){
            if(mesDia>=1 && mesDia<=20){
                System.out.print("Tauro");
            }
            if(mesDia>=21 && mesDia<=31){
                System.out.print("Geminis");
            }
        }
        if(mes==6){
            if(mesDia>=1 && mesDia<=20){
                System.out.print("Geminis");
            }
            if(mesDia>=21 && mesDia<=30){
                System.out.print("Cancer");
            }
        }
        if(mes==7){
            if(mesDia>=1 && mesDia<=22){
                System.out.print("Cancer");
            }
            if(mesDia>=23 && mesDia<=31){
                System.out.print("Leo");
            }
        }
        if(mes==8){
            if(mesDia>=1 && mesDia<=22){
                System.out.print("Leo");
            }
            if(mesDia>=23 && mesDia<=31){
                System.out.print("Virgo");
            }
        }
        if(mes==9){
            if(mesDia>=1 && mesDia<=22){
                System.out.print("Virgo");
            }
            if(mesDia>=22 && mesDia<=30){
                System.out.print("Libra");
            }
        }
        if(mes==10){
            if(mesDia>=1 && mesDia<=22){
                System.out.print("Libra");
            }
            if(mesDia>=23 && mesDia<=31){
                System.out.print("Escorpio");
            }
        }
        if(mes==11){
            if(mesDia>=1 && mesDia<=21){
                System.out.print("Escorpio");
            }
            if(mesDia>=22 && mesDia<=30){
                System.out.print("Sagitario");
            }
        }
        if(mes==12){
            if(mesDia>=1 && mesDia<=21){
                System.out.print("Sagitario");
            }
            if(mesDia>=22 && mesDia<=31){
                System.out.print("Capricornio");
            }
        }
        }
    }

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Comprobar probabilidad de que nuestra pareja sea infiel");
        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println("1 Si");
        System.out.println("2 No");
        Scanner sc = new Scanner (System.in);
        int opcion = sc.nextInt();
        int contador = 0;
        switch(opcion){
            case 1:
                contador=contador+3;
                break;
            case 2:
                break;
            default:
            System.out.println("Opción icorrecta");
            break;
        
        }
        
        System.out.println("Ha aumentado sus gastos de vestuario");
        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println("1 Si");
        System.out.println("2 No");

        opcion = sc.nextInt();

        switch(opcion){
            case 1:
                contador=contador+3;
                break;
            case 2:
                break;
            default:
            System.out.println("Opción icorrecta");
            break;
        
        }

        
        System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
        System.out.println("1 Si");
        System.out.println("2 No");
        
        opcion = sc.nextInt();

        switch(opcion){
            case 1:
                contador=contador+3;
                break;
            case 2:
                break;
            default:
            System.out.println("Opción icorrecta");
            break;
        
        }
        System.out.println(". Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        System.out.println("1 Si");
        System.out.println("2 No");
        
        opcion = sc.nextInt();

        switch(opcion){
            case 1:
                contador=contador+3;
                break;
            case 2:
                break;
            default:
            System.out.println("Opción icorrecta");
            break;
        
        }
        System.out.println("No te deja que mires la agenda de su teléfono móvil");
        System.out.println("1 Si");
        System.out.println("2 No");
        
        opcion = sc.nextInt();

        switch(opcion){
            case 1:
                contador=contador+3;
                break;
            case 2:
                break;
            default:
            System.out.println("Opción icorrecta");
            break;
        
        }
        System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás delante");
        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println("1 Si");
        System.out.println("2 No");
        
        opcion = sc.nextInt();

        switch(opcion){
            case 1:
                contador=contador+3;
                break;
            case 2:
                break;
            default:
            System.out.println("Opción icorrecta");
            break;
        
        }
        System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        System.out.println("1 Si");
        System.out.println("2 No");
        
        opcion = sc.nextInt();

        switch(opcion){
            case 1:
                contador=contador+3;
                break;
            case 2:
                break;
            default:
            System.out.println("Opción icorrecta");
            break;
        
        }
        System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        System.out.println("1 Si");
        System.out.println("2 No");
        
        opcion = sc.nextInt();

        switch(opcion){
            case 1:
                contador=contador+3;
                break;
            case 2:
                break;
            default:
            System.out.println("Opción icorrecta");
            break;
        
        }
        System.out.println("Has notado que últimamente se perfuma más");
        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println("1 Si");
        System.out.println("2 No");
        
        opcion = sc.nextInt();

        switch(opcion){
            case 1:
                contador=contador+3;
                break;
            case 2:
                break;
            default:
            System.out.println("Opción icorrecta");
            break;
        
        }
        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println("1 Si");
        System.out.println("2 No");
        
        opcion = sc.nextInt();

        switch(opcion){
            case 1:
                contador=contador+3;
                break;
            case 2:
                break;
            default:
            System.out.println("Opción icorrecta");
            break;
        
        }
        sc.close();
        if(contador>=0 && contador<=10){
            System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }
        if(contador>=11 && contador<=22){
            System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        }
        if(contador>=23 && contador<=30){
            System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }
}

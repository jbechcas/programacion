public class Ejercicio5 {
    public static void main(String[] args) {
        String CYAN = "\033[0;36m";
        String RED = "\033[0;31m";
        String BLUE = "\033[1;34m";
        String GREEN = "\033[1;32m";
        String YELLOW = "\033[1;33m";
        String PURPLE = "\033[0;35m";
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-12s %-12s %-13s %-12s %-12s %-12s %n","",RED + "|Lunes      ",BLUE + "|Martes      ",GREEN + "|Miércoles  ",YELLOW + "|Jueves     |", PURPLE + "Viernes|" + CYAN);
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-12s %-12s %-13s %-12s %-12s %-12s %n","|8:15-9:15","|Progrmación","|Lenguajes","|Lenguajes","|Progrmación|","FOL    |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-12s %-12s %-13s %-12s %-12s %-12s %n","|9:15-10:15","|Progrmación","|Lenguajes","|Lenguajes","|Progrmación|","FOL    |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-12s %-12s %-13s %-12s %-12s %-12s %n","|10:15-11:15","|Progrmación","|BD","|Progrmación","|Progrmación|","FOL    |");  
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-12s %-12s %-13s %-12s %-11s %-12s %n","|11:45-12:45","|Sistemas","|BD","|Progrmación","|BD","|Sistemas|"); 
        System.out.println("---------------------------------------------------------------------------"); 
        System.out.printf("%-12s %-12s %-13s %-12s %-11s %-12s %n","|11:45-13:45","|Sistemas","|Entornos","|BD","|BD","|Sistemas|");  
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-12s %-12s %-13s %-12s %-11s %-12s %n","|13:45-14:45","|Sistemas","|Entornos","|BD","|Entornos","|Sistemas|");  
        System.out.println("---------------------------------------------------------------------------");          
    }
}
package POO.Ejercicio2;

public class Ejercicio2 {
    public static void menu(){
        System.out.println("VEHÍCULOS\r\n" + //
                "=========\r\n" + //
                "1. Anda con la bicicleta\r\n" + //
                "2. Haz el caballito con la bicicleta\r\n" + //
                "3. Anda con el coche\r\n" + //
                "4. Quema rueda con el coche\r\n" + //
                "5. Ver kilometraje de la bicicleta\r\n" + //
                "6. Ver kilometraje del coche\r\n" + //
                "7. Ver kilometraje total\r\n" + //
                "8. Salir\r\n");
        System.out.print("Elige una opción (1-8): ");
    }
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta(0, "b1", "22r234");
        Coche c1 = new Coche(0, "c1", "76846ey");
        boolean salida = false;
        while (!salida) {
            menu();
            int opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    b1.andar();;
                    break;
                case 2:
                    b1.caballito();
                    break;
                case 3:
                    c1.andar();
                    break;
                case 4:
                    c1.quemarRueda();;
                    break;
                case 5:
                    System.out.println(b1.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println(c1.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println(b1.kilometrosRecorridos+c1.kilometrosRecorridos);
                    break; 
                case 8:
                    salida = true;
                    break;                   
                default:
                    break;
            }
            
        }
            
            
        
    }
    
}

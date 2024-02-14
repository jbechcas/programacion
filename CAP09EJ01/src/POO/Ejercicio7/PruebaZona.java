package POO.Ejercicio7;

public class PruebaZona {
    public static void menu(){
        System.out.println("1. Mostrar número de entradas libres\r\n" + //
                "2. Vender entradas\r\n" + //
                "3. Salir");
    }

    public static void menu2(){
        System.out.println("-------------------------------");
        System.out.println("Elige la zona:");
        System.out.println("1º Sala principal");
        System.out.println("2º Compra venta");
        System.out.println("3º Zona Vip");
    }
    public static void main(String[] args) {
        Zona zona1 = new Zona(1000);
        Zona zona2 = new Zona(200);
        Zona zona3 = new Zona(25);
        boolean salida = false;
        while (!salida) {
            menu();
            int opcion = Integer.parseInt(System.console().readLine());
            int cantidad;
            switch (opcion) {
                case 1:
                    System.out.println("Zona 1 " + zona1);
                    System.out.println("Zona 2 " + zona2);
                    System.out.println("Zona 3 " + zona3);
                    break;
                case 2:
                    menu2();
                    int opcion2 = Integer.parseInt(System.console().readLine());
                    switch (opcion2) {
                        case 1:
                            System.out.println("Introduce la cantidad que quieres vender");
                            cantidad = Integer.parseInt(System.console().readLine());
                            zona1.vender(cantidad);
                            break;
                        case 2:
                            System.out.println("Introduce la cantidad que quieres vender");
                            cantidad = Integer.parseInt(System.console().readLine());
                            zona2.vender(cantidad);
                            break;
                        case 3:
                            System.out.println("Introduce la cantidad que quieres vender");
                            cantidad = Integer.parseInt(System.console().readLine());
                            zona3.vender(cantidad);
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    salida = true;
                    break;
                default:
                    System.out.println("La opción elegida no existe");
                    break;
            }
        }
    }
}

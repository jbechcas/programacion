package ArraysObjetos.Ejercicio1;

public class PruebaGato {
    public static void main(String[] args) {
        Gato gatos[] = new Gato[4];
        for(int i = 0; i<gatos.length;i++){
            System.out.print("Introduce el nombre del gato: ");
            gatos[i] = new Gato();
            String nombre = System.console().readLine();
            gatos[i].setNombre(nombre);
            System.out.print("Introduce el género del gato: ");
            gatos[i].setGenero(System.console().readLine());
            System.out.print("Introduce la edad del gato: ");
            gatos[i].setEdad(Integer.parseInt(System.console().readLine()));
        }

        for (Gato gato : gatos) {
            System.out.println("-------------------------------------");
            System.out.println(gato.getNombre());
            System.out.println(gato.getGenero());
            System.out.println( gato.getEdad());
        }
    }
}

package POO.Ejercicio5;

public class Pizza {
    private String tipo;
    private String tamano;
    private boolean servida = false;
    private static int totalPedidas;
    private static int totalServidas;

    @SuppressWarnings("static-access")
    public Pizza(String tipo,String tamano){
        this.tipo = tipo;
        this.tamano = tamano;
        this.totalPedidas += 1;
    }
    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamano() {
        return tamano;
    }
    
    public void sirve(){
        if(this.servida==false){
            totalServidas+=1;
            this.servida=true;
        }else{
            System.out.println("esa pizza ya se ha servido");
        }
    }

    @Override
    public String toString() {
        String texto = "";
        if(servida == false){
            texto = "pizza " + this.tipo +" " + this.tamano + ", pedida";
        }else{
            texto = "pizza " + this.tipo +" " + this.tamano + ", servida";
        }
        return texto;
    }
    
}

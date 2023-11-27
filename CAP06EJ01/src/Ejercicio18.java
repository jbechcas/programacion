public class Ejercicio18 {
    public static void main(String[] args) {
        String colorString = "";
        int color1 = 0,color2 = 0,color3 = 0;
        boolean validacion = false;
        for(int i = 1;i<=3;i++){
            int color = (int)(Math.random()*6)+1;
            if(i==1){
                color1 = color;
            }
            if(i==2){
                while(!validacion){
                    color2 = color;
                    if(color1==color2){
                        color = (int)(Math.random()*6)+1;
                    }else{
                        validacion = true;
                    }
                }
            }
            if(i==3){
                validacion = false;
                while (!validacion) {
                    color3 = color;
                    if(color3 == color1 || color3 == color2){
                        color = (int)(Math.random()*6)+1;
                    }else{
                        validacion = true;
                    }
                }
            }
            switch (color) {
                case 1:
                    colorString = "rojo";
                    break;
                case 2:
                    colorString = "azul";
                    break;
                case 3:
                    colorString = "verde";
                    break;
                case 4:
                    colorString = "amarillo";
                    break;
                case 5:
                    colorString = "violeta";
                    break;
                case 6:
                    colorString = "naranja";
                    break;
            
                default:
                    break;
            }
            System.out.println("El color habitación " + i + " es: " + colorString);
        }
    }
}

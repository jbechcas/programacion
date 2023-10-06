public class Ejercicio8 {
    public static void main(String[] args) {
        char char1='a';
        char char2='b';
        char char3='c';
        char char4='d';
        char char5='e';
    //El problema que podemos encontrar es que se suman ya que se representa en código ASCII
    System.out.println(char1 + char2 + char3 + char4 + char5);
    //La solución consiste en poner al principio un espacio para que no se muestre en ASCII
    System.out.println("" + char1 + char2 + char3 + char4 + char5);
    }
}

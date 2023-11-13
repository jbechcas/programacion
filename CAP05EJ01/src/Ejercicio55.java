public class Ejercicio55 {
    public static int InvertirNum(int num){
        String longitud = num + "";
        String alreves = "";
        int longitudnum = longitud.length();
        for(int i = 1;i<=longitudnum;i++ ){
            int digito = num%10;
            num = num/10;
            alreves = alreves + digito;
        }
        num = Integer.parseInt(alreves);
        return num;
    }
    public static int DesplazarNumero(int num){
        String longitud = num + "";
        int longitudnum = longitud.length();
        for(int i = 1;i<=longitudnum;i++ ){
            int digito = num%10;
            num = num/10;
            if(digito==0){
                String numstring = digito + "" + num;
                num = Integer.parseInt(numstring);
            }else{
                String numstring = digito + "" + num;
                num = Integer.parseInt(numstring);
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int num =  78201345;
        num = InvertirNum(num);
        num = DesplazarNumero(num);
        num = InvertirNum(num);
        System.out.print(num);
    }
}

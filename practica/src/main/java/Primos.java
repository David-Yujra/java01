import java.util.Scanner;

public class Primos {
    public boolean verificar(int x){
        //Scanner leer=new Scanner (System.in);
        int numero=x;
        int contador=2;
       boolean primo = true;
        //String primo="si";
       //numero=leer.nextInt();
        while ((primo)&&(contador!=numero)){
            if(numero % contador == 0){
                primo =false;
                //primo = "no";
            }
            contador ++;
        }
       return primo;
    }
}

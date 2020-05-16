public class Factorial {
    public int verificar(int y){
        double x=1;
        while(y!=0){
            x=x *y;
            y--;
        }
        return (int)x;
    }
}

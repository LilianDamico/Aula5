import java.io.IOException;
import java.io.InputStream;

public class Top3 {
    
    
    public static void main (String[] args) {

        final Scanner lector = new Scanner(System.in);
        int valor = ((Object) lector).nextInt();
        while (valor != 0) {
            valor = lector.nextInt();
            System.out.println(valor);
        };
    }

    
}
import java.util.Scanner;

public class RETO1 {
    public static void main(String[] args) {
        double grados,F,k,c;

        
        Scanner lectura=new Scanner(System.in);
        System.out.println("escriba Tipo De calentura :  \n1 Fahrenheit\n2 Kelvin ");
        grados=lectura.nextDouble();
        System.out.println("escriba Los Grados Celsius A Convertir");
        c=lectura.nextDouble();

        if (grados == 1) {
            
            F = (c - 32)/1.8;

            System.out.println("La calentura De Grados Celcius A Grados Fahrenheit Es: "+F);



        } else if (grados == 2) {

            k = (F =1.8* c +32);

            System.out.println("La calentura De Grados Celcius A Grados Kelvin Es: "+k);
            
        } else {
            
        } 

        lectura.close();
    }
}

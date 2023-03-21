
import java.util.Scanner;

public class RETO2 {

    public static void main(String[] args){
        Scanner Lectura = new Scanner(System.in);
        String nomEnfermera,nomMama,nomBebe;
        double pesoBebe,cantidadVacuna;
        int mesesBebe;

        System.out.print(" Este es elNombre De La Enfermera: ");
        nomEnfermera=Lectura.nextLine();
        System.out.print("Este es el Nombre De La Mamá: ");
        nomMama=Lectura.nextLine();
        System.out.print("Este es el Nombre Del Bebe: ");
        nomBebe=Lectura.nextLine();
        System.out.print("Peso Bebe: ");
        pesoBebe=Lectura.nextDouble();

        System.out.print("Meses Del Bebe:");
        mesesBebe=Lectura.nextInt();


        cantidadVacuna=((pesoBebe+10)/(mesesBebe))*8;

        

        System.out.println("Nombre De La Enfermera:"+nomEnfermera+", Nombre De La mamá:"+nomMama+", Nombre Del Bebe:"+nomBebe+", Dosis De La Vacuna Para El Bebe:"+cantidadVacuna);

        Lectura.close();

    }
}
import java.util.Scanner;

public class RETO6 {
  
    public static void main(String[]args) {
        String nJugador;
        int codigoJug,i,VecesInfi = 9999;
        int Moneda,apuesta,vida=5,Saldo = 2000;


        try (Scanner lectura = new Scanner(System.in)) {
            System.out.println("Ingrese  Su Nombre");
            nJugador = lectura.nextLine();

            System.out.println("tenga en cuenta Que Tiene 2000K Para Apostar Y Acuerdese Que Solo Tiene 5 Vidas");
            System.out.println("Cuanto quiere Apostar");
            apuesta=lectura.nextInt();



            for (i=1;i <= VecesInfi;i++) {
            
            
            System.out.println("Si Quieres Elegir:  Cara = 1,     Sello = 2");
            codigoJug=lectura.nextInt();
            System.out.println("La Moneda Callo En: ");
            System.out.println();
            Moneda=(int) (Math.random()*2)+1;
            if(Moneda==1 && codigoJug==1){
                System.out.println("Cara,  "+nJugador+"Usted Ha sido el vencedor");
                apuesta = Saldo + apuesta;
                
            }
            else if(Moneda==2 && codigoJug==2){
                System.out.println("Sello,  "+nJugador+"Usted Ha sido el vencedor!!");
                apuesta = Saldo + apuesta;

            }
            else if(Moneda==1 && codigoJug==2){
                System.out.println("Cara,  "+nJugador+" Ha Sido El Que perdio ;(");
                apuesta = Saldo - apuesta;
                vida = vida - 1;
            }
            else if(Moneda==2 && codigoJug==1){
                System.out.println("Sello,  "+nJugador+" Ha Sido El que perdio ;(");
                apuesta = Saldo - apuesta;
                vida = vida - 1;
            }


            if (apuesta == 0) {
            
                VecesInfi = 0;

                System.out.println("Nos disculpamos pero usted No puede Continuar No Tiene Suficiente plata ");



            } else {
                
            }


            if (vida == 0) {

                VecesInfi = 0;
                
            } else {
                
            }

            System.out.println("Ronda: "+i+", Tienes "+vida+" Vidas "+"Y Tienes "+apuesta+" Para Apostar");

   }
            System.out.println(nJugador+" Tenias 2000 Y quedo Con: "+apuesta+" Veces Intentos "+i);

            
            lectura.close();
        }
    
    }
}

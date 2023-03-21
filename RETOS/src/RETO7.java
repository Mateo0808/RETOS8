import java.util.Scanner;

public class RETO7 {
     
    public static void main(String[]args) {
        String nomJu;
        int codigoJugador,codigoMaquina,vida = 3,Moneda = 1000,Apuesta, i, numI = 9999;

        try (Scanner lectura = new Scanner(System.in)) {
            System.out.println("ingrese El Nombre Del Jugador");
            nomJu = lectura.nextLine();

            System.out.println("Recuerde Que Solo Tiene 3 Vidas");


            for (i=0;i <= numI;i++) {
            System.out.println("Tienes "+Moneda+" Para Apostar, Cuanto Desea Apostar");
            Apuesta = lectura.nextInt();
            System.out.println("Si Desea Escoger: Piedra = 3,   Papel = 2,    Tijeras = 1");
            System.out.println();
            codigoJugador=lectura.nextInt();
                

            
            System.out.println("La Maquina Escogió: ");
            codigoMaquina=(int) (Math.random()*3)+1;
            
            if(codigoMaquina==3 && codigoJugador==3){
                System.out.println("Ambos Sacaron Piedra, Han Empatado");
            }
            else if(codigoMaquina==2 && codigoJugador==2){
                System.out.println("Ambos Sacaron Papel, Han Empatado");
            }
            else if(codigoMaquina==1 && codigoJugador==1){
                System.out.println("Ambos Sacaron Tijera, Han Empatado");
            }
            else if(codigoMaquina==1 && codigoJugador==2){
                System.out.println("La Maquina Saco Tijeras Y "+nomJu+" Papel, "+nomJu+" Perdío ;("+" Y La Maquina !!Ganó¡¡");
                Moneda = Moneda-Apuesta;
                vida =  vida-1;
            }
            else if(codigoMaquina==3 && codigoJugador==1){
                System.out.println("La Maquina Saco Piedra Y "+nomJu+" Tijeras, "+nomJu+" Perdío ;("+" Y La Maquina !!Ganó¡¡");
                Moneda = Moneda-Apuesta;
                vida =  vida-1;
            }
            else if(codigoMaquina==2 && codigoJugador==3){
                System.out.println("La Maquina Saco Papel Y "+nomJu+" Piedra, "+nomJu+" Perdío ;("+" Y La Maquina !!Ganó¡¡");
                Moneda = Moneda-Apuesta;
                vida =  vida-1;
            }
            else if(codigoMaquina==3 && codigoJugador==2){
                System.out.println("La Maquina Saco Piedra Y "+nomJu+" Papel, "+nomJu+" !!Ganó¡¡"+" Y La Maquina Perdió");
                Moneda = Moneda+Apuesta;
            }
            else if(codigoMaquina==2 && codigoJugador==1){
                System.out.println("La Maquina Saco Papel Y "+nomJu+" Tijeras, "+nomJu+" !!Ganó¡¡"+" Y La Maquina Perdió");
                Moneda = Moneda+Apuesta;
            }
            else if(codigoMaquina==1 && codigoJugador==3){
                System.out.println("La Maquina Saco Tijeras Y "+nomJu+" Piedra, "+nomJu+" !!Ganó¡¡"+" Y La Maquina Perdió");
                Moneda = Moneda+Apuesta;
            }

            System.out.println(vida+" De 3 Vidas");
            System.out.println();
            System.out.println();

            if (vida == 0) {
   
                numI = vida;

            } else {
                
            }
            if (Moneda == 0) {
                
                numI = Moneda;

                System.out.println("No tienes Suficiente Dinero Para Continuar.");

            } else {
                
            }




   }
            System.out.println(nomJu+" Jugo: "+i+" Quedo Con Esta Cantidad De Dinero: "+Moneda);

            lectura.close();
        }
    
    }
    
}

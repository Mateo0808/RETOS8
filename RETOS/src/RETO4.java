import java.util.Scanner;

public class RETO4 {
     
    public static void main(String[]args) {
        String nombreJu;
        int dinero = 1000;
        int codigoJugador;
        int codigoMaquina;

        Scanner lectura=new Scanner(System.in);
        System.out.println("Bienvenido Al Juego Piedra, Papel O Tijera");

        System.out.println("Nombre Del Jugador");
        nombreJu=lectura.nextLine();
        System.out.println("Empiezas Con 1000K");
        System.out.println("Si Desea elegir: Piedra = 3,   Papel = 2,    Tijeras = 1");

        codigoJugador=lectura.nextInt();
        System.out.println("La Maquina Eligio: ");
        codigoMaquina=(int) (Math.random()*3)+1;

        
        if(codigoMaquina==3 && codigoJugador==3){

            System.out.println("los dos Sacaron Piedra, Han Empatado");

            System.out.println("Has Quedado Con: "+dinero);

        }
        else if(codigoMaquina==2 && codigoJugador==2){

            System.out.println("Ambos Sacaron Papel, Han Empatado");

            System.out.println("Has Quedado Con: "+dinero);
        }
        else if(codigoMaquina==1 && codigoJugador==1){

            System.out.println("Ambos Sacaron Tijera, Han Empatado");

            System.out.println("Has Quedado Con: "+dinero);
            
        }
        else if(codigoMaquina==1 && codigoJugador==2){

            System.out.println("La Maquina Saco Tijeras Y "+nombreJu+" Ha sacado Papel Asi Que, Ha Perdido ;(");

            dinero =dinero-1000;

            System.out.println("Has Quedado Con: "+dinero);

        }
        else if(codigoMaquina==3 && codigoJugador==1){

            System.out.println("La Maquina Saco Piedra Y "+nombreJu+" Ha Sacado Tijeras Asi Que, Ha Perdido ;(");

            dinero =dinero-1000;

            System.out.println("Has Quedado Con: "+dinero);

        }
        else if(codigoMaquina==2 && codigoJugador==3){

            System.out.println("La Maquina Saco Papel Y "+nombreJu+" Ha Sacado Piedra Asi Que, Ha Perdido ;(");

            dinero =dinero-1000;

            System.out.println("Has Quedado Con: "+dinero);

        }
        else if(codigoMaquina==3 && codigoJugador==2){

            System.out.println("La Maquina Saco Piedra Y "+nombreJu+" Ha Sacado Papel Asi Que, Ha !!Ganado¡¡");

            dinero =dinero+1000;

            System.out.println("Has Quedado Con: "+dinero);

        }
        else if(codigoMaquina==2 && codigoJugador==1){

            System.out.println("La Maquina Saco Papel Y "+nombreJu+" Ha Sacado Tijeras Asi Que, Ha !!Ganado¡¡");

            dinero =dinero+1000;

            System.out.println("Has Quedado Con: "+dinero);
            

        }
        else if(codigoMaquina==1 && codigoJugador==3){

            System.out.println("La Maquina Saco Tijeras Y "+nombreJu+" Ha Sacado Piedra Asi Que, Ha !!Ganado¡¡");

            dinero=dinero+1000;
            System.out.println("Has Quedado Con: "+dinero);

        }





        lectura.close();
    }
}

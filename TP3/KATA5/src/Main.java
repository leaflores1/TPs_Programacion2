import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unidades;
        boolean sepudoavanzar=false;
        boolean cargatanque = false;

        System.out.print("-----COMANDO DE LA NAVE ESPACIAL------- ");

        System.out.println("Nave en movimiento...");

        NaveEspacial nave = new NaveEspacial( "Endurance",50);
//DESPEGUE
        System.out.println("Iniciando despegue...");
        if (!nave.despegar()) {
            System.out.println("No se pudo despegar. Abortando misión.");
            return;
        }

//PRIMER AVANCE
        System.out.println("Cuantas metros desea avanzar?: ");
         unidades = input.nextInt();
         sepudoavanzar = nave.avanzar(unidades);

        if(sepudoavanzar==false){
            while(sepudoavanzar==false){
                System.out.println("Cuantas metros desea avanzar?: ");
                unidades = input.nextInt();
                sepudoavanzar = nave.avanzar(unidades);
            }
        }
//CARGA DE COMBUSTIBLE
        System.out.println("Recargar combustible...Cuanto desea cargar?: ");
        int combustible = input.nextInt();
        nave.recargarCombustible(combustible);

       if(cargatanque==false){
           while(cargatanque==false){
               System.out.println("Recargar combustible nuevamente...Cuanto desea cargar?: ");
               combustible = input.nextInt();
               cargatanque = nave.recargarCombustible(combustible);
           }
       }
        System.out.println("Estado actual de la nave ");
        nave.mostrarEstado();

//AVANZAR NUEVAMENTE
        System.out.println("Cuantos metros desea avanzar nuevamente?: ");
        unidades = input.nextInt();
        sepudoavanzar = nave.avanzar(unidades);

        if(sepudoavanzar==false){
            while(sepudoavanzar==false){
                System.out.println("Cuantas metros desea avanzar?: ");
                unidades = input.nextInt();
                sepudoavanzar = nave.avanzar(unidades);
            }
        }


        input.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numArt,extios, numFans;
        String nombre, cancion, genero, ritmo, club, lider;

        System.out.println("Ingrese cuantos artistas quiere ingresar: ");
        numArt = entrada.nextInt();
        Fans objeto[] = new Fans[numArt];

        for (int i = 0; i < objeto.length; i++){
            System.out.println("");
            entrada.nextLine();
            System.out.println("Ingere el nombre del artista " + (i+1) + ":");
            System.out.print("Ingrese el nombre del artista: ");
            nombre = entrada.nextLine();
            System.out.print("Ingrese el nombre de la cancion: ");
            cancion = entrada.nextLine();
            System.out.print("Ingrese el genero de la cancion: ");
            genero = entrada.nextLine();
            System.out.print("Ingrese el tipo de ritmo que tiene la cancion: " +
                    "\n(Muy bueno / bueno / malo / muy malo): ");
            ritmo = entrada.nextLine();
            System.out.print("Ingrese el nombre del club de fans: ");
            club = entrada.nextLine();
            System.out.print("Ingrese el nombre de la persona que dirige el club de fans: ");
            lider = entrada.nextLine();
            System.out.print("Ingrese el numero de personas pertenecientes al club: ");
            numFans = entrada.nextInt();
            System.out.print("Ingrese el numero de exitos que tiene el artista: ");
            extios = entrada.nextInt();
            objeto[i] = new Fans(genero,ritmo,cancion,nombre,extios,club,numFans,lider);
            System.out.println("");
            objeto[i].imprimirDatos();
        }
    }
}
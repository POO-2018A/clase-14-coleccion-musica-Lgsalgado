package musica;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class Principal {


    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("#########################COLECCION DE MUSICA#########################");
        System.out.print("INGRESE NUMERO DE ARTISTAS QUE VA INGRESAR EN COLECCION: ");
        int numArtista=scan.nextInt();;
        int aux2=0;
        int cont=0;
        Artista[] artisans= new Artista[numArtista];


        for (int i=0; i<artisans.length; i++) {

            System.out.println("INGRESE INFORMACION DEL ARTISTA " + (i + 1));
            scan.nextLine();

            System.out.print("NOMBRE: ");
            String nombre = scan.nextLine();
            System.out.println();
            System.out.println("FECHA NACIMIENTO ");
            System.out.println("INGRESE LA FECHA EN EL SIGUIENTE FORMATO");
            System.out.println("DD/MM/YYYY");
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fecha=scan.nextLine();
            System.out.println();
            Date date = new Date();
            try {

                 date = formatter.parse(fecha);
                System.out.println(date);
                System.out.println(formatter.format(date));

            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println("INGRESE PAIS DE ORIGEN");
            String pais = scan.nextLine();
            System.out.println();

            artisans[i]=new Artista(nombre,date,pais);
            System.out.println("DESEA INGRESAR ALBUM");

            do {
                System.out.println("1.-SI DESEA");
                System.out.println("2.-SI NO DESEA");
                aux2 = scan.nextInt();
                switch (aux2) {
                    case 1:
                        System.out.println("CUANTOS VA A INGRESAR: ");
                        int x = scan.nextInt();
                        Album[] albums= new Album[x];
                        for (int j=0; j<albums.length; j++){
                            System.out.println("DATOS ALBUM "+(j+1));
                            System.out.println();
                            System.out.print("INGRESE EL NOMBRE DEL ALBUM: ");
                            String nombreAlbumn=scan.nextLine();
                            System.out.println();
                            scan.nextLine();
                            System.out.print("INGRESE EL AÑO DEL ALBUM: ");
                            int anio=scan.nextInt();
                            System.out.println();
                            scan.nextLine();
                            System.out.print("INGRESE GENERO ALBUM: ");
                            String nombreGenero=scan.nextLine();
                            System.out.println();

                            System.out.print("INGRESE EL NUMERO DE CANCIONES : ");
                            int nCancionces=scan.nextInt();
                            System.out.println();

                            albums[j]=new Album(nombreAlbumn,anio,nombreGenero,nCancionces);
                        }
                        artisans[i].setAlbum(albums);
                        if (cont==2){aux2=2;}
                        break;
                    case 2:
                        System.out.println("Siguiente ARTISTA");
                        break;
                    default:
                        System.out.println("OPCION INCORRECTA");
                        System.out.println();
                        System.out.println();}

            }while (aux2!=2);
        }
    }
}
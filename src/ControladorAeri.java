import java.util.Scanner;



public class ControladorAeri {
	
	static Scanner sc;
	static EspaiAeri espaiAeri1;

	public static void main(String[] args) {
		
		int accio;
		espaiAeri1= new EspaiAeri("KosovoZone",5);
		
		do{
			System.out.println("Entra una opció de les següents");
			System.out.println("1.- Donar d’alta avió al sistema");
			System.out.println("2.- Gestionar un dels avions");
			System.out.println("3.- Manteniment de l’espai aeri");
			System.out.println("4.- Informació de l’espai aeri");
			System.out.println("0.- Sortir");
			
			sc = new Scanner(System.in);
			accio = sc.nextInt();
		    switch (accio)
		    {
		    case 1: donaAltaAvio(); break;
		    	
		    case 2:  break;
		    	
		    case 3:  break;
		    
		    case 4: espaiAeri1.mostrarAvions(); break;
		    	
		    }
		}while (accio!=0);

	}
	
	
	public static void donaAltaAvio(){
		
		String model,marca,matricula;
		int coordenadaX,coordenadaY,passatge;
		
		System.out.println("Entra el model del avio:");
		model=sc.next();//canvis per agafar be el que entra per teclat
		sc.nextLine();//canvis per agafar be el que entra per teclat
		System.out.println("Entra el nom del fabrican/marca del avio:");
		marca=sc.next();//canvis per agafar be el que entra per teclat
		sc.nextLine();//canvis per agafar be el que entra per teclat
		System.out.println("Entra la matricula del avio:");
		matricula=sc.next();//canvis per agafar be el que entra per teclat
		sc.nextLine();//canvis per agafar be el que entra per teclat
		System.out.println("Entra coordenada X on esta inicialment:");
		coordenadaX=sc.nextInt();//canvis per agafar be el que entra per teclat
		sc.nextLine();//canvis per agafar be el que entra per teclat
		System.out.println("Entra coordenada Y on esta inicialment:");
		coordenadaY=sc.nextInt();//canvis per agafar be el que entra per teclat
		sc.nextLine();//canvis per agafar be el que entra per teclat
		System.out.println("Entra el numero de passatges que porta:");
		passatge=sc.nextInt();//canvis per agafar be el que entra per teclat
		sc.nextLine();//canvis per agafar be el que entra per teclat
		
		espaiAeri1.afegirAvio(model,marca,matricula,coordenadaX,coordenadaY,passatge);
		
	}
	
	/*public static void informaEspaAeri(){
		System.out.println("Entra La matrícula del avio buscar:");
		String MatriculaBuscar=sc.next();//Agreiments oscar! per debugar i trobar que agafava un espai en blanc
		sc.nextLine();
		EspaiAeri.mostrarAvions(MatriculaBuscar);
	}*/

}

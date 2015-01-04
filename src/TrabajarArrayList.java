import java.util.Scanner;
import java.util.ArrayList;

class TrabajarArrayList {
	
	public static void menu () {
		System.out.println();
		System.out.println("Elige la opción que desee entre las siguientes opciones:");
		System.out.println("--------------------------------------------------------");
		System.out.println("1. Introducir dato");
		System.out.println("2. Modificar dato");
		System.out.println("3. Eliminar dato");
		System.out.println("4. Buscar dato");
		System.out.println("5. Mostrar datos");
		System.out.println("6. Salir");
		System.out.println();

	}


	public static void main(String[] args) {
		
		ArrayList <Integer> listado=new ArrayList <Integer> ();
		Scanner sc=new Scanner(System.in);
		int opcion;
		int dato;

		menu();
		
		int i;
		do {
			int p=-1;
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Por favor, introduzca un dato: ");
				dato=sc.nextInt();
				listado.add(dato);
				System.out.println();
				break;

			case 2:
				System.out.print("Por favor, introduzca el dato a modificar: ");
				dato=sc.nextInt();
				
				//Busco el valor y me quedo con la posicion en la que está
				for (i=0; i<listado.size(); i++) {
					if (listado.get(i)==dato) {
						p=i;
					}
				}
				//Compruebo si lo he encontrado y si es así lo modifico
				if (p==-1) {
					System.out.println("No existe ese dato.");
					System.out.println();
				}

				else {
					System.out.print("Introduzca el dato nuevo: ");
					dato=sc.nextInt();
					listado.set(p, dato);
				}
								
				System.out.println();
				break;

			case 3:
				System.out.print("Por favor, introduzca el dato a eliminar: ");
				dato=sc.nextInt();
				for (i=0; i<listado.size(); i++) {
					if (listado.get(i)==dato) {
						p=i;
					}
				}

				if (p==-1) {
				 	System.out.println("No existe ese dato.");
				}

				else {
					listado.remove(p);
					System.out.println("Dato "+dato +" eliminado.");
				}
					
				System.out.println();
				break;

			case 4:
				System.out.print("Por favor, introduzca el dato que quiere buscar: ");
				dato=sc.nextInt();
				for (i=0; i<listado.size(); i++) {
					if (listado.get(i)==dato) {
						p=i;
						System.out.println("El dato "+dato +" está en la posicion "+p);
					}
				}
				if (p==-1){
						System.out.println("Dato no encontrado.");
				}
				System.out.println();
				break;

			case 5:
				System.out.println("Estos son los datos que disponemos: ");
				for (i=0; i<listado.size(); i++) {
					System.out.println("En la posicion "+(i+1)+" está: "+listado.get(i));
				}
				System.out.println();
				break;

			case 6:
				System.out.println("Ha finalizado el programa. Gracias!");
				break;

			default:
				System.out.println("Esa opción no existe.");
								  	
		  }//fin switch

		if(opcion!=6) {
			System.out.print("Vuelve a elegir otra opción: ");
		}
		
		System.out.println();
		
		}//fin do
		while (opcion!=6);
		
	}
}
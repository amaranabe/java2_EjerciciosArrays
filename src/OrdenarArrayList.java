import java.util.Scanner;
import  java.util.ArrayList;


/* EJERCICIO PARA ORDENAR UN ARRAYLIST DE MENOR A MAYOR */

class Persona {
	int edad=0;
	String nombre;
}


class OrdenarArrayList {

	public static void mostrararray (ArrayList <Persona> a)  {

		for (int i=0; i<a.size(); i++) {
			System.out.println("En la posicion "+i+":");
			System.out.println("                  Nombre: "+a.get(i).nombre);
			System.out.println("                  Nombre: "+a.get(i).edad);
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
	
	//Declaro objetos
		Persona p;
		ArrayList <Persona> arraylistdepersona= new ArrayList <Persona>();
		
	/*Añado valores:
		1. Doy valores a las variable del objeto creado p
		2. Llamo al metodo add para añadir la referencia de p en arraylist
	*/
		Scanner sc=new Scanner(System.in);
			
		int i;
		for (i=0; i<3; i++) {
			p=new Persona();
			System.out.print("Como se llama: ");
			p.nombre=sc.next();
			System.out.print("Qué edad tiene: ");
			p.edad=sc.nextInt();
			arraylistdepersona.add(p);
		}

	//Visualizar Arraylist
		System.out.println();
		System.out.println("El Array sin ordenar es:");
		mostrararray(arraylistdepersona);
				
	/*Ordenar ArrayList por edad:
		1. Buscar edad mínima
		2. Intercambiar a la posicion que le corresponda
	*/
		int j;
		for (j=0; j<arraylistdepersona.size(); j++) {
			
			//Buscar minimo		
			int min=arraylistdepersona.get(j).edad;
			int posicion=j;
			Persona aux;
			int k;
			for (k=j; k<arraylistdepersona.size(); k++) {
				if (arraylistdepersona.get(k).edad<min) {
					min=arraylistdepersona.get(k).edad;
					posicion=k;
				}
			}
			//Intercambiar edad mínima a la posicion que le corresponda
			aux=arraylistdepersona.get(j);
			arraylistdepersona.set(j, arraylistdepersona.get(posicion));
			arraylistdepersona.set(posicion, aux);
		}
		
	//Visualizar arraylist ordenado
		System.out.println();
		System.out.println("El Array ordenado por edad es:");
		mostrararray(arraylistdepersona);

		

	}
}
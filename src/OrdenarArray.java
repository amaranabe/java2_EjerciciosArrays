/* EJERCICIO PARA ORDENAR UN ARRAY DE MENOR A MAYOR */

class OrdenarArray {

	public static void mostrararray (int [] a)  {

		System.out.print("[");

		for (int i=0; i<a.length; i++ ) {
			if (i==a.length-1) {
				System.out.print(a[i]);
			}
			else {
				System.out.print(a[i]+", ");
			}
		}
		System.out.print("]");
		System.out.println();
	}



	public static void main(String[] args) {
	
	//Declaro variables
		int array []= {20, 70, 52, 4, 7};

	//Visualizo por pantalla el array
		System.out.println("El Array sin ordenar es:");
		mostrararray(array);

		int j;
		for (j=0; j<array.length; j++) {
			
			//Buscar minimo		
			int min=array[j];
			int posicion=j;
			int aux;
			int i;
			for (i=j; i<array.length; i++) {
				if (array[i]<min) {
					min=array[i];
					posicion=i;
				}
			}

			//Intercambiar minimo a la posicion que le corresponde
			aux=array[j];
			array[j]=min;
			array[posicion]=aux;
		}
		
		//Visualizar array ordenado
		System.out.println();
		System.out.println("El Array una vez ordenado es:");
		mostrararray(array);

	}
}
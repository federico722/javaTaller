
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Prueba {

	public static void main(String args[]) {
		 //1
		 nombre();
		 //2
		 numero(8);
		 //3
		 int numeroGenerado =aleatorio();
		 System.out.println("Numero aleatorio: " + numeroGenerado);
		 
		 //4
		 int[] arreglo = { 10, 5, 8, 20, 3, 15 };
		 int maximo = valorMaximo(arreglo);
		 System.out.println("El valor maximo en el arreglo es: "+maximo);
		 
		 //5
		 ArrayList<Integer> lista = new ArrayList<>();
		 lista.add(10);
		 lista.add(5);
		 lista.add(3);
		 lista.add(14);
		 lista.add(22);
		 lista.add(9);
		 
		 int maximo1 = encontrarValorMaximo(lista);
		 System.out.println("el valor maximo en la lista es "+maximo1);
		 
		 //6
		 int[] arreglo1 = { 12, 4, 6, 7, 9, 13 };
		 int[] arreglo2 = { 34, 2, 1, 7, 2, 34 };
		 String resultado = sumaArreglos(arreglo1, arreglo2);
		 System.out.println(resultado);
		 
		 //7
		 
		
	}
	public static void nombre() {
		System.out.println("Ingresa al metodo");
		String nombre1=JOptionPane.showInputDialog("ingrese su nombre completo");
		
		System.out.println("Bienvenido "+nombre1);
	}
	
	public static void numero(int num) {
		if(num > 10) {
			System.out.println("El numero es mayor de 10,su numero es: "+num);
		}else {
			JOptionPane.showMessageDialog(null,"su numero no es mayor de 10");
		}
	}
	
	public static int  aleatorio() {
		int numeroAleatorio = (int)(Math.random()*100);
		return numeroAleatorio;
	}
	
	public static int valorMaximo(int []arreglo){
		int maximo=arreglo[0];
		for(int i=1; i < arreglo.length; i++) {
			if(arreglo[i] > maximo) {
				maximo = arreglo[i];
			}
		}
		
		return maximo;
	}
	
	public static String sumaArreglos(int []arreglo1,int []arreglo2) {
		int suma1=0;
		int suma2=0;
		for(int i=0; i < arreglo1.length; i++) {
			suma1=suma1+arreglo1[i];
		}
		for(int i=0; i < arreglo2.length; i++) {
			suma2=suma2+arreglo2[i];
		}
		String resultado="la suma del primer arreglo es: "+suma1+"\n";
		resultado+="la suma del segundo arreglo es: "+suma2+"\n";
		
		return resultado;
	}
	
	public static int encontrarValorMaximo(ArrayList<Integer> lista) {
		
		int maximo =lista.get(0);
		
		for (int i = 0; i < lista.size(); i++) {
			int elemento =lista.get(i);
			if(elemento > maximo) {
				maximo = elemento;
			}
		}
		return maximo;
	}
	
}

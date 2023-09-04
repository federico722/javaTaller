import java.util.HashMap;
import java.util.Scanner;
//7


public class Prueba1 {
     public static void main(String []args) {
    	 HashMap<String, String> diccionario = new HashMap<>();
    	 
    	 
    	 diccionario.put("apple","manzana");
    	 diccionario.put("banana","platano");
    	 diccionario.put("car","coche");
    	 diccionario.put("house","casa");
    	 diccionario.put("book","libro");
    	 
    	 Scanner scanner =new Scanner(System.in);
    	 
    	 
    	 System.out.print("Ingrese una palabra en ingles: ");
    	 String palabraIngles =scanner.nextLine().toLowerCase();
    	 
    	 String traduccion =diccionario.get(palabraIngles);
    	 
    	 if(traduccion != null) {
    		 System.out.println("La traduccion al espanol es: "+traduccion);
    	 }else {
    		 System.out.println("La palabra no se encontró en el diccionario.");
    	 }
    	 scanner.close();
     }
     
}

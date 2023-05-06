package selenium.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaCoreBrush2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//lñist arrays dinamic allow value inset don´t make your dimension
		
		//Example
		
		
		
		ArrayList<String> aL= new ArrayList<String>();//Su sintaxis es Arreglo tipo de Arreglo en este caso es Tipo String Cadena
		aL.add("Ernesto");
		aL.add("Trejo");
		aL.add("Haro");
		aL.add("Esemeralda juarez rodriguez");
		//aL.get(3);
		
		//aL.ensureCapacity(4);
		System.out.println(aL.size());
		System.out.println(aL.get(3));
		aL.trimToSize();
		
		
		//System.out.println(aL.lastIndexOf(3));
		for (String val: aL) {
			
			System.out.println("Valores del Arreglo \n"+val);
			
			
			//item is present 
			
			
			
			
		}
		
		

		String [] name={"Ernesto","Trejo","HAro"};
		List <String> ArraynameArrayList = Arrays.asList(name);
		System.out.println("contiene"+ArraynameArrayList.contains("Trejo"));
		//The method as list --> to converting your normal matriz  in Arraylist
		System.out.println(aL.contains("Haro"));//Boolean if is present show it true 
		
		
		
		
		
		
		
	}

}

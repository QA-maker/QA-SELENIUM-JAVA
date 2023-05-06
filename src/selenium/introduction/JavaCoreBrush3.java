package selenium.introduction;

public class JavaCoreBrush3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaCoreBrush3 d= new JavaCoreBrush3();
		//String types 
		
		String s= "Ernesto Trejo Selenium Java";
		
		String[] spliteed=s.split("Trejo");
		
		System.out.println("el valor es "+spliteed[0]);
		System.out.println("el valor es "+spliteed[1]);
		System.out.println("el valor es "+spliteed[1].trim());
		//System.out.println("el valor es "+spliteed[2]);
		//System.out.println("el valor es "+spliteed[3].trim());
		
		
		
		System.out.println("++++++++++");
		//Entonces dentro de esta es una cadena que se trata de matriz normal
		
		for(String i: spliteed)
		{
			System.out.println("El dato es \n"+i.trim()); //elimina los caracteres blancos de la cadena
			
		}		
		
		System.out.println("Aqui se inicia con int i");
		
		for (int i=0; i<s.length();i++) {
			
			System.out.println(s.charAt(i));
		}
		
		System.out.println("Inicia el conteo al reves");
		//imprimeir los datos de la cadena al reves
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
			
		}		//el metodo static permite accesos a los metodos sin definir un objeto
		
		
		String name= d.getData();
		System.out.println(name);
	
		
		
		
		
	}
	
	public String getData() {
		System.out.println("Aqui empezamos acceso a los metodos");
		return "neto trejo";
	}

}

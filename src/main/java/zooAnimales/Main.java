package zooAnimales;

public class Main {
	public static void main(String[] args) {
		new Anfibio();
		new Anfibio();
		new Mamifero();
		new Mamifero();
		new Mamifero();
		new Reptil();
		new Pez();
		new Ave();
		new Ave();
		
		
		System.out.println(Animal.totalPorTipo());
	}
}

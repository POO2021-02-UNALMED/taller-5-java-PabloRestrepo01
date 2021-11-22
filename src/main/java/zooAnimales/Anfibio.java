package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	private static int ranas;
	private static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
		totalAnimales++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	public Anfibio() {}
	
	public static int cantidadAnfibios() {return ranas + salamandras;}
	
	@Override
	public String movimiento() {return "saltar";}
	
	public static Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
		ranas++;
		return new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona) {
		salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
	}

	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public static int getRanas() {
		return ranas;
	}

	public static void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}

	public static int getSalamandras() {
		return salamandras;
	}

	public static void setSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}
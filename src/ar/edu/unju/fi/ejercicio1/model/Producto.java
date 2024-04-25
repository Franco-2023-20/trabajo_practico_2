package ar.edu.unju.fi.ejercicio1.model;

public class Producto {
   private String Codigo;
   private String descripcion;
   private double precio;
   private Categoria categoria;
   private OrigenFabricacion origenFabricacion;


public Producto(String codigo, String descripcion, double precio, Categoria categoria,
		OrigenFabricacion origenFabricacion) {
	
	Codigo = codigo;
	this.descripcion = descripcion;
	this.precio = precio;
	this.categoria = categoria;
	this.origenFabricacion = origenFabricacion;
}

public Producto() {
	// TODO Auto-generated constructor stub
}

public String getCodigo() {
	return Codigo;
}

public void setCodigo(String codigo) {
	Codigo = codigo;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

  public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}

public OrigenFabricacion getOrigenFabricacion() {
	return origenFabricacion;
}

public void setOrigenFabricacion(OrigenFabricacion origenFabricacion) {
	this.origenFabricacion = origenFabricacion;
}

public enum Categoria {
	  TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
  }
  public enum OrigenFabricacion {
	  ARGENTINA,CHINA, BRASIL, URUGUAY
  
}
}

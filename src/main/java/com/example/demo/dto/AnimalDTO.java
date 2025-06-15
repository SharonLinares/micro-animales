package com.example.demo.dto;

public class AnimalDTO {

	private int id;
	private String nombre;
	private String tipoAnimal;
	private String reinoAnimal;

	public AnimalDTO(int id, String nombre, String tipoAnimal, String reinoAnimal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipoAnimal = tipoAnimal;
		this.reinoAnimal = reinoAnimal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getReinoAnimal() {
		return reinoAnimal;
	}

	public void setReinoAnimal(String reinoAnimal) {
		this.reinoAnimal = reinoAnimal;
	}

}

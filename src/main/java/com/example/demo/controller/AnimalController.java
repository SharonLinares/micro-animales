package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.AnimalDTO;

public class AnimalController {

	private List<AnimalDTO> animales = new ArrayList<>();

	public AnimalDTO consultarAnimalPorId(String id) {
		for (AnimalDTO animalDTO : animales) {
			if (animalDTO.getId() == Integer.parseInt(id)) {
				return animalDTO;
			}

		}
		return null;
	}

	public String agregarAnimal(AnimalDTO animaldto) {
		for (AnimalDTO animalDTO : animales) {
			if (animalDTO.getId() == animaldto.getId()) {
				return "el id ya existe";
			}
		}
		this.animales.add(animaldto);
		return "se agrego al animal";
	}
}

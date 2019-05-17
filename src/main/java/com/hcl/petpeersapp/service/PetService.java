package com.hcl.petpeersapp.service;

import java.util.List;

import com.hcl.petpeersapp.domain.Pets;

public interface PetService {

	public Pets savePet(Pets pets);

	public List<Pets> getAllPets();

	public Pets updatePets(Pets pets);

	public Pets getPetById(Long id);

	public Pets buyPet(Long petId, Long userId);

}

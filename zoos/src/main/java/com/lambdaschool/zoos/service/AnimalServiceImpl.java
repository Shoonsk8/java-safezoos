package com.lambdaschool.zoos.service;

import com.lambdaschool.zoos.model.Animal;
import com.lambdaschool.zoos.model.Zoo;
import com.lambdaschool.zoos.repository.AnimalRepository;
import com.lambdaschool.zoos.view.CountAnimalInZoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService
{
    @Autowired
    private AnimalRepository animalrepos;

    @Override
    public ArrayList<Animal> findAll()
    {
        ArrayList<Animal> list = new ArrayList<>();
        animalrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Animal findAnimalByType(String type) throws EntityNotFoundException
    {
        Animal animal = animalrepos.findByAnimaltype(type);

        if (animal == null)
        {
            throw new EntityNotFoundException("Animal " + type + " not found!");
        }
        return animal;
    }


    @Override
    public ArrayList<CountAnimalInZoo> getCountAnimalInZoo()
    {
        return animalrepos.getCountAnimalInZoo();
    }

    @Override
    public List<Zoo> getZoosByAnimal(Animal animal) {
        List<Zoo> zoos= animal.getZoos();

        return zoos;
    }
}

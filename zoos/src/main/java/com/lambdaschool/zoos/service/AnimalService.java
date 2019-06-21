package com.lambdaschool.zoos.service;

import com.lambdaschool.zoos.model.Animal;
import com.lambdaschool.zoos.model.Zoo;
import com.lambdaschool.zoos.view.CountAnimalInZoo;

import java.util.ArrayList;
import java.util.List;

public interface AnimalService
{
    ArrayList<Animal> findAll();

    Animal findAnimalByType(String type);

    ArrayList<CountAnimalInZoo> getCountAnimalInZoo();

    List<Zoo> getZoosByAnimal(Animal animal);
}

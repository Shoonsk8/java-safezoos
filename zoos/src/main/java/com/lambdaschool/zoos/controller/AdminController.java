package com.lambdaschool.zoos.controller;

import com.lambdaschool.zoos.model.Animal;
import com.lambdaschool.zoos.service.AnimalService;
import com.lambdaschool.zoos.service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController
{
    @Autowired
    ZooService zooService;


    @Autowired
    private AnimalService animalService;
 //   ROLE ADMIN should be allowed to access /admin /animals /zoos
//http://localhost:2020/admin/animals/zoos
    @GetMapping(value = "/animals/zoos",
            produces = {"application/json"})
    public ResponseEntity<?> listAllAnimals()
    {

            return new ResponseEntity<>(animalService.findAll(), HttpStatus.OK);
            //        Animal animal=Animal
  //      return new ResponseEntity<>(animalService.getZoosByAnimal().findAll(), HttpStatus.OK);
    }


//    @PutMapping(value = "/zoos/{id}", produces = {"application/json"}, consumes = {"application/json"})


    @PostMapping(value = "/zoos", produces = {"application/json"}, consumes = {"application/json"})



    @DeleteMapping(value = "/zoos/{zooid}")
    public ResponseEntity<?> deleteZooById(@PathVariable long zooid)
    {
        zooService.delete(zooid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

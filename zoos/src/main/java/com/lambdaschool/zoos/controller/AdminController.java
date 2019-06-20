package com.lambdaschool.zoos.controller;

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

//    @PutMapping(value = "/zoos/{id}", produces = {"application/json"}, consumes = {"application/json"})


//    @PostMapping(value = "/zoos", produces = {"application/json"}, consumes = {"application/json"})


    @DeleteMapping(value = "/zoos/{zooid}")
    public ResponseEntity<?> deleteZooById(@PathVariable long zooid)
    {
        zooService.delete(zooid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

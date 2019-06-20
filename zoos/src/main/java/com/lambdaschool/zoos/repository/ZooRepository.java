package com.lambdaschool.zoos.repository;

import com.lambdaschool.zoos.model.Zoo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long>
{
    Zoo findByZooname(String name);

    @Modifying
    @Query(value = "DELETE FROM zooanimals WHERE zooid = :zooid", nativeQuery = true)
    void deleteZooFromZooAnimals(long zooid);
}

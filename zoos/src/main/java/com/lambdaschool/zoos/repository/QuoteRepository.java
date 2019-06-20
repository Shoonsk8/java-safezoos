package com.lambdaschool.zoos.repository;

import com.lambdaschool.zoos.model.Quote;
import org.springframework.data.repository.CrudRepository;

public interface QuoteRepository extends CrudRepository<Quote, Long>
{

}

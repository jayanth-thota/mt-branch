package my.spring.project.stockexchange.dao;

import org.springframework.data.repository.CrudRepository;

import my.spring.project.stockexchange.pojos.StockExchange;

public interface StockExchangeRepository extends CrudRepository<StockExchange, Integer> {

}
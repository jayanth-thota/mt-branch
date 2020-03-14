package my.spring.project.stockprice.dao;

import org.springframework.data.repository.CrudRepository;

import my.spring.project.stockprice.pojos.StockPrice;

public interface StockPriceRepository extends CrudRepository<StockPrice, String> {

}

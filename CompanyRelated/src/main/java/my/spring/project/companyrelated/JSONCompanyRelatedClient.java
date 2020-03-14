package my.spring.project.companyrelated;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "jcompany" , url ="http://localhost:8039/ipo/")
public interface JSONCompanyRelatedClient {
@GetMapping("/findByCompanyName/{companyName}")
public List<Ipo> findByCompanyName(@PathVariable("companyName") String companyName );
}

package com.demo.mappings;

import java.util.List;

import org.hibernate.engine.spi.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {
	
	@Autowired
	 private MappingService mappingService;
	
	public void setMappingService(MappingService mappingService) {
		  this.mappingService = mappingService;
		 }
	
		 @GetMapping("/api/mappings")
		 public List<CashAccMapping> getMappings() {
		  List<CashAccMapping> mapping = mappingService.retrieveMappings();
		  return mapping;
		 }
		  
		 @GetMapping("/api/mappings/{cptyShortName}")
		 public CashAccMapping getMapping(@PathVariable(name="cptyShortName")String cptyShortName) {
		  return mappingService.getMapping(cptyShortName);
		 }

		 
		 @PostMapping("/api/mappings")
		 public void saveMapping(@RequestBody CashAccMapping mapping){
			 
			
			 mappingService.saveMapping(mapping);
		  System.out.println("Mapping Saved Successfully");
		  System.out.println(mapping.getCptyName()+""+mapping.getSystemType() +"Mapping Saved Successfully");
		  
		 }

}

package com.demo.mappings;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MappingServiceImpl implements MappingService {

	@Autowired
	 private MappingRepository mappingRepository;
	
	public void setMappingRepository(MappingRepository mappingRepository) {
		  this.mappingRepository = mappingRepository;
		 }
		  
	
	
	public List<CashAccMapping> retrieveMappings() {
		  List<CashAccMapping> mappings = mappingRepository.findAll();
		return mappings;
	}

	
	public CashAccMapping getMapping(String cptyShortName) {
		Optional<CashAccMapping> optEmp = mappingRepository.findById(cptyShortName);
		  return optEmp.get();
	}
	
	public void saveMapping(CashAccMapping mapping){
		mappingRepository.save(mapping);
		 }

	

}

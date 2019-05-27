package com.demo.mappings;

import java.util.List;


public interface MappingService {

	
	 public List<CashAccMapping> retrieveMappings();
	  
	 public CashAccMapping getMapping(String cptyShortName);
	 
	 
	 public void saveMapping(CashAccMapping mapping);
}

package com.demo.mappings;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MappingRepository  extends JpaRepository<CashAccMapping,String> {

	


}

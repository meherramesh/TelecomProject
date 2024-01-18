package com.ibm.cna.telecom.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.cna.telecom.model.Address;


/**
*
* @author Chetana
*/
@Repository
public interface AddressRepository extends CrudRepository<Address, Serializable>{
	
}

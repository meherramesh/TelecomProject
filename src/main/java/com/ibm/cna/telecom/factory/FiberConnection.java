package com.ibm.cna.telecom.factory;


import com.ibm.cna.telecom.service.ConnectionTypeService;
/**
 * @author Chetana
 */
public class FiberConnection implements ConnectionTypeService {


	@Override
	public String getConnectionType() {
		// TODO Auto-generated method stub
		return "Fiber Connection";
	}

	

}

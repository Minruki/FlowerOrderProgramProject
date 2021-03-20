package FlowerOrderProgramProject.dao;

import java.util.List;

import jdbcFlowerProject.dto.customer_information;

public interface customer_informationDao {
	List<customer_information> selectcustomer_informationByAll();
	customer_information selectcustomer_informationByNo(customer_information customer_information);
	
	int insertcustomer_information(customer_information customer_information);
	int updatecustomer_information(customer_information customer_information);
	int deletecustomer_information(int cumulative_amount);
	
	

}

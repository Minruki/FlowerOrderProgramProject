package FlowerOrderProgramProject.dao;

import java.util.List;

import jdbcFlowerProject.dto.Customer_information;

public interface Customer_informationDao {
	List<Customer_information> selectcustomer_informationByAll();
	Customer_information selectcustomer_informationByNo(Customer_information customer_information);
	
	int insertcustomer_information(Customer_information customer_information);
	int updatecustomer_information(Customer_information customer_information);
	int deletecustomer_information(Customer_information customer_information);
	
	

}

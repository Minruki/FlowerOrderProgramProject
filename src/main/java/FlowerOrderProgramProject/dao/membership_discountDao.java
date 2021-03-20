package FlowerOrderProgramProject.dao;

import java.util.List;

import jdbcFlowerProject.dto.membership_discount;
import jdbcFlowerProject.dto.order_program;

public interface membership_discountDao {
	List<membership_discount> selectmembership_discountByAll();
	membership_discount selectmembership_discountByNo(membership_discount membership_discount);
	
	int insertmembership_discount(membership_discount membership_discount);
	int updatemembership_discount(membership_discount membership_discount);
	int deletemembership_discount(String discount_rate);
	List<order_program> selectorder_programByAll();
	order_program selectorder_programByNo(order_program order_program);
	int insertorder_program(order_program neworder_program);
	

}

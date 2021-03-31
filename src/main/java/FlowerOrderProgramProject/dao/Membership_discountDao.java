package FlowerOrderProgramProject.dao;

import java.util.List;

import jdbcFlowerProject.dto.Membership_discount;
import jdbcFlowerProject.dto.Order_program;

public interface Membership_discountDao {
	List<Membership_discount> selectmembership_discountByAll();
	Membership_discount selectmembership_discountByNo(Membership_discount membership_discount);
	
	int insertmembership_discount(Membership_discount membership_discount);
	int updatemembership_discount(Membership_discount membership_discount);
	int deletemembership_discount(Membership_discount membership_discount);
	

	

}

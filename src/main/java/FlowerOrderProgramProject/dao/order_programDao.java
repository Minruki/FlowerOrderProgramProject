package FlowerOrderProgramProject.dao;

import java.util.List;

import jdbcFlowerProject.dto.order_program;

public interface order_programDao {
	List<order_program> selectorder_programByAll();
	order_program selectorder_programByNo(order_program order_program);
	
	int insertorder_program(order_program order_program);
	int updateorder_program(order_program order_program);
	int deleteorder_program(order_program ono); 

}

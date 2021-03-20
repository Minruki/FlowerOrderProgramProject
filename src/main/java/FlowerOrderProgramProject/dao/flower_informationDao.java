package FlowerOrderProgramProject.dao;

import java.util.List;

import jdbcFlowerProject.dto.flower_information;

public interface flower_informationDao {
	List<flower_information> selectflower_informationByAll();
	flower_information selectflower_informationByNo(flower_information flower_information);
	
	int insertflower_information(flower_information flower_information);
	int updateflower_information(flower_information flower_information);
	int deleteflower_information(flower_information flower_price); // flower_price or flower_information

}

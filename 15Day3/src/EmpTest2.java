import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.biz.EmpService;
import com.biz.EmpService2;
import com.entity.EmpDTO;

public class EmpTest2 {

	public static void main(String[] args) {

		// multi insert
		ArrayList<EmpDTO> kkk = new ArrayList<>();
		kkk.add(new EmpDTO(1, "aaa", null, 1000));
		kkk.add(new EmpDTO(2, "bbb", null, 2000));
		kkk.add(new EmpDTO(3, "ccc", null, 3000));

		EmpService2 kkk2 = new EmpService2();
		kkk2.insertMulti(kkk);

		System.out.println("=====================================");

		// 1. select ==> 상황에 따라서 where절 있고 없고
		EmpDTO dto = new EmpDTO();
		// dto.setEname("SMITH");
		EmpService2 service2 = new EmpService2();
		List<EmpDTO> list = service2.searchEname(dto);
		for (EmpDTO empDTO : list) {
			System.out.println(empDTO);
		}

		System.out.println("=====================================");

		// 2. 800,3000,5000 또는 800,3000 동적인 검색

		ArrayList<Integer> xxx = new ArrayList<>();
		xxx.add(1600);
		xxx.add(3000);
		xxx.add(1250);

		service2.delMulti(xxx);

		List<EmpDTO> xxx2 = service2.searchMulti(xxx);
		for (EmpDTO empDTO : xxx2) {
			System.out.println(">>" + empDTO);
		}

	}// end main
}

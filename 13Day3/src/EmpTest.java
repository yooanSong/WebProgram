import java.util.ArrayList;

import com.biz.EmpService;
import com.entity.EmpDTO;
import com.exception.RecordNotFoundException;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpService service = new EmpService();
		//service.insert(70,"관리","부산");
		service.insert(new EmpDTO(70, "관리", "부산"));
		
		//삭제 : deptno가 70 삭제
		try {
			service.delete(99);
		} catch (RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		//조회
		ArrayList<EmpDTO> list = service.select();
		for (EmpDTO dto : list) {
			System.out.println(dto);
		}
	}//end main
}//end class







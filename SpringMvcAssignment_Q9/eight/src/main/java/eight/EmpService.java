package eight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eight.EmpData;
import eight.Emp;

@Service
public class EmpService {

	@Autowired
	private EmpData edata;

	public List<Emp> getEmployeesByPage( int pageid, int total ) {
		
		return edata.getEmployeesByPage( pageid, total );
	}
}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Inter {

	int id;
	String empName;
	int salary;

	public Inter(int id, String empName, int salary) {
		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}

}

public class MapInter {

	public static void main(String[] args) {

		List<Inter> empDetails = Arrays.asList(
				new Inter(1, "Ajith", 10000), 
				new Inter(2, "Vijay", 20000),
				new Inter(3, "Arul", 30000));

		List<Integer> list = empDetails.stream().filter(x->x.salary > 10000).map(x->x.salary).collect(Collectors.toList());
		list.forEach(System.out::println);
	}

}

package ro.ase.acs.example1;

//DRY - don't repeat yourself
//KISS - keep it simple and stupid
//YAGNI - you aren't gonna need it

public class EmployeeStudent {
	int salaryPerHour;
	//int salary;
	int hours;

	public void addHours(int addedHours) {
		hours += addedHours;
		//salary = salaryPerHour * hours;
		//we don't store variables that are calculated
		//for a variable name we need to have nouns, not verbs
		//for function names we need to start with a verb
	}
	
	public int getFullSalary() {
		return hours * salaryPerHour;
	}

	public String getExam(int examNumber) throws Exception {
		
		String[] exams = {
				ConstantVariables.EXAM_OOP, 
				ConstantVariables.EXAM_JAVA, 
				ConstantVariables.EXAM_DS, 
				ConstantVariables.EXAM_CS, 
				ConstantVariables.EXAM_STATISTICS
		};
		
		if (examNumber < exams.length && examNumber > 0) {
			return exams[examNumber - 1];
		}else {
			throw new Exception("exam must be in range 1 to 5");
		}
		
		//it is better to use a data structure instead of if or switch
		
//		switch (ExamNumber) {
//		case 1:
//			return ConstantVariables.EXAM_OOP;
//		case 2:
//			return ConstantVariables.EXAM_JAVA;
//		case 3:
//			return ConstantVariables.EXAM_DS;
//		case 4:
//			return ConstantVariables.EXAM_CS;
//		case 5:
//			return ConstantVariables.EXAM_STATISTICS;
//
//		default:
//			throw new Exception("exam must be in range 1 to 5");
//		}
	}
}

import java.math.BigDecimal;

public class StduentClass {
	
	public static void main(String[] args) {
		
		Student student =new Student("Kim", 97,98,100);
		
	
		
		
		int number = student.getNumberOfMarks();
		System.out.println("number Of mark: "+number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("number Of sum: "+sum);
		int maximumMark = student.getMaximumMark();
		System.out.println("number of Maximum: " +  maximumMark);
	
		int minimumMark = student.getminimumMark();
		System.out.println("number of minimum: " +  minimumMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("average:"+average );
		
		System.out.println(student);
		
		student.addNewMark(35);
		System.out.println(student);
		
		student.removeMarkAtInex(1);
		System.out.println(student);
		
		}
		
	
	}



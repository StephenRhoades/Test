
public class Student implements Comparable<Object>{
	private String lastName, firstName;
	private Integer ID;
	private Double GPA;

	public Student(String lastName, String firstName, Integer ID, Double GPA) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.ID = ID;
		this.GPA = GPA;
	}

	public String name() {
		return lastName + " " + firstName;
	}

	public Integer ID() {
		return ID;
	}

	public Double GPA() {
		return GPA;
	}
	
	public String toString() {
		return String.format("%-10s %-10s %1.2f %08d", lastName, firstName, GPA, ID);
	}
	
	public int compareTo(Object o) {
		if(o.getClass() == Student.class) {
			return ID.compareTo(((Student)o).ID());
		}
		return toString().compareTo(o.toString());
	}
}

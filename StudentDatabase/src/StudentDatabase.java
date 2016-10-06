import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class StudentDatabase {
	
	private Map<Integer, Student> IDMap = new TreeMap<Integer, Student>();
	private Map<Double, Set<Student>> GPAMap = new TreeMap<Double, Set<Student>>();
	private Map<String, Set<Student>> nameMap = new TreeMap<String, Set<Student>>();
	
	public StudentDatabase(String filename) {
		Scanner read = null;
		try {
			read = new Scanner(new File(filename));
			while (read.hasNextLine()) {
				String lastName = read.next();
				String firstName = read.next();
				Double GPA = read.nextDouble();
				Integer ID = read.nextInt();
				Student stud = new Student(lastName, firstName, ID, GPA);
				IDMap.put(ID, stud);
				
				if (GPAMap.containsKey(GPA)) {
					(GPAMap.get(GPA)).add(stud);
				} else {
					Set<Student> set = new TreeSet<Student>();
					set.add(stud);
					GPAMap.put(GPA, set);
				}
				
				if (nameMap.containsKey(lastName + " " + firstName)) {
					(nameMap.get(lastName + " " + firstName)).add(stud);
				} else {
					Set<Student> set = new TreeSet<Student>();
					set.add(stud);
					nameMap.put(lastName + " " + firstName, set);
				}
				if (read.hasNextLine()) {
					read.nextLine();
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (read != null) {
				read.close();
			}
		}
	}
	
	public Student getStudentByID(int id) {
		return IDMap.get(id);
	}
	
	public Set<Student> getStudentByGPA(double min, double max) {
		return GPAMap.get(min);
	}
	
	public Set<Student> getStudentByName(String name) {
		return nameMap.get(name);
	}
	
	public String IDToString() {
		String ans = "";
		for (Integer ID : IDMap.keySet()) {
			ans += IDMap.get(ID).toString() + "\n";
		}
		return ans;
	}
	
	public String GPAToString() {
		String ans = "";
		for (Double GPA : GPAMap.keySet()) {
			for (Student stud : GPAMap.get(GPA)) {
				ans += stud.toString() + "\n";
			}
		}
		return ans;
	}
	
	public String nameToString() {
		String ans = "";
		for (String name : nameMap.keySet()) {
			for (Student stud : nameMap.get(name)) {
				ans += stud.toString() + "\n";
			}
		}
		return ans;
	}
	public String toString() {
		return nameToString();
	}
}

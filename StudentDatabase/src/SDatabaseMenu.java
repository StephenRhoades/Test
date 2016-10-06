import java.util.Scanner;

public class SDatabaseMenu {

	public static void main(String[] args) {
//		Student stud = new Student("Rhoades", "Stephen", 630520, 4.205);
//		System.out.println(stud);
		Scanner input = new Scanner(System.in);
		StudentDatabase database = new StudentDatabase("src/StudentInfo");
		boolean out = false;
		while (out == false) {
			System.out.println("Enter command or type help.");
			String in = input.nextLine();
			if(in.toLowerCase().equals("help")) {
				System.out.println("some commands : \"list\", \"sortByGPA\", \"sortByID\", \"sortByName\", \"stop\"");
			}
			else if(in.toLowerCase().equals("stop")|| in.toLowerCase().equals("out") 
					|| in.toLowerCase().equals("end")) {
				out = true;
			}
			else if(in.toLowerCase().equals("sortbyname") || in.toLowerCase().equals("name") 
					|| in.toLowerCase().equals("sort by name")) {
				System.out.println(database.nameToString());
			}
			else if(in.toLowerCase().equals("sortbygpa")|| in.toLowerCase().equals("gpa") 
					|| in.toLowerCase().equals("sort by gpa")) {
				System.out.println(database.GPAToString());
			}
			else if(in.toLowerCase().equals("sortbyid")|| in.toLowerCase().equals("id") 
					|| in.toLowerCase().equals("sort by id")) {
				System.out.println(database.IDToString());
			}
			else if(in.toLowerCase().equals("list")) {
				System.out.println(database);
			}
			else if(in.toLowerCase().equals("find by name") ||in.toLowerCase().equals("findbyname")
					||in.toLowerCase().equals("search by name")||in.toLowerCase().equals("searchbyname")) {
				System.out.println("what is the name of the Student(s)?");
				String ID = input.nextLine();
				System.out.println();
			}
			else if(in.toLowerCase().equals("find by id") ||in.toLowerCase().equals("findbyid")
					||in.toLowerCase().equals("search by id")||in.toLowerCase().equals("searchbyid")) {
				System.out.println("what is the ID of the Student?");
				String name = input.nextLine();
				System.out.println();
			}
			else if(in.toLowerCase().equals("find by gpa") ||in.toLowerCase().equals("findbygpa")
					||in.toLowerCase().equals("search by gpa")||in.toLowerCase().equals("searchbygpa")) {
				System.out.println("what is the range of GPA for the Student(s)?");
				Double min = input.nextDouble();
				Double max = input.nextDouble();
				System.out.println(database.getStudentbyGPA());
			}
			else {
				System.out.println("not a valid command.");
			}
		}
/*		System.out.println("names:");
		System.out.println(database.nameToString());
		System.out.println("GPAs:");
		System.out.println(database.GPAToString());
		System.out.println("IDs:");
		System.out.println(database.IDToString());
*/
		
		input.close();
		
	}

}

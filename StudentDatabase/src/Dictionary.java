import java.util.Scanner;
import java.io.File;

public class Dictionary {

	private DictionaryEntry [] dictionary;

	public Dictionary() {
		File file = new File("src/Dictionary");

		Scanner input = null;

		try {

			input = new Scanner(file);

			if (input.hasNextLine()) {
				dictionary = new DictionaryEntry[input.nextInt() * 2];
				input.nextLine();
			}
			while (input.hasNextLine()) {
				DictionaryEntry temp = new DictionaryEntry(input.nextLine(), 
						input.nextLine());
				int hash = temp.hashCode();
				int inc = 0;
				while (dictionary[Math.abs(hash + inc) % dictionary.length] != null)
				{
					inc += 1;
				}
				dictionary[Math.abs(hash + inc) % dictionary.length] = temp;
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			if (input != null) {
				input.close();
			}
		}
	}
	
	public String getWord(int i) {
		if (dictionary[i] != null) {
			return dictionary[i].getWord();
		}
		return null;
		
	}
	public int size() {
		return dictionary.length;
	}
}


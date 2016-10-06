
public class DictionaryEntry {
	
	private String word, definition;
	
	public DictionaryEntry(String word, String definition) {
		this.word = word;
		this.definition = definition;
	}
	
	public String getWord() {
		return word;
	}
	
	public String getDefinition() {
		return definition;
	}
	
	public String toString() {
		return word + ": " + definition;
	}
	
	public boolean equals( Object o ) {
		return o.getClass() == DictionaryEntry.class && 
				((DictionaryEntry)o).getWord() == word;
	}
	
	public int hashCode() {
		return word.hashCode();
	}

}

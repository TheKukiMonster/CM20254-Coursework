/** A stack abstract data type that contains Strings. */
public class StringStack {
	
	String[] stringStack;
	int size;
	
	/**
	* Constructor for creating a new StringStack with a certain capacity.
	* @param capacity the maximum number of strings the stack can hold
	*/
	public StringStack(int capacity) {
		this.stringStack = new String[capacity];
		this.size = 0;
	}
	
	/**
	* Puts the given String on top of the stack (if there is enough space).
	* @param s the String to add to the top of the stack
	* @return false if there was not enough space in the stack to add the string;
	*         otherwise true
	*/
	public boolean push(String s) {
		if(stringStack.length == size){
			return false;
		}
		stringStack[size] = s;
		size++;
		return true;
	}
	
	/**
	* Removes the String on top of the stack from the stack and returns it.
	* @return the String on top of the stack, or null if the stack is empty.
	*/
	public String pop() {
		if(size==0){
			return null;
		}
		else{
			String popString = stringStack[size-1];
			stringStack[size-1] = "";
			size--;
			return popString;
		}
	}
	
	/**
	* Returns the number of Strings in the stack.
	* @return the number of Strings in the stack
	*/
	public int count() {
		return size;
	}
}

package Queue;

public interface PnrInterface {
	/**
	 * @return the first part (YYMMDD) of personal number
	 */
	public String getFirstPart();
	
	/**
	 * @return the second part (NNNN) of personal number
	 */
	public String getSecondPart();

	/**
	 * print the date of birth as, for example, "12th of August 1985"
	 */
	public  void getDateOfBirth();


	/**
	 * @return the current age of the person
	 */
	public  int getAge();

	
	/** 
	 * @return true if the number is a correct Swedish personal identity number
	 */
	public boolean isCorrect();
	 
	/**
	 *  @return true if the identity number corresponds to a female, respectively
	 */
	public boolean isFemaleNumber();
	
	/**
	 *  @return true if the identity number corresponds to a male, respectively
	 */
	public boolean isMaleNumber();
	
	/**
	 * @return a string representation of the identity number
	 */
	
	public String toString();
	
	/**
	 * @return true if two Pnr instances correspond to the same identity number
	 */
	public  boolean isEqualTo(PnrInterface pnr);


}

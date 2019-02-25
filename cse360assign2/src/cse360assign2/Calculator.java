
package cse360assign2;
/*
 * Author: Kyle Nguyen
 * ClassID: 507
 * Assignment#: 2
 * Description: This is an application mimics the
 * functionality of a calculator
 */

/*
 * Calculator represents the total value
 * after executed computations.
 */


public class Calculator 
{

	private int total;
	private String history;
	/*
	 * Class constructor
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history = "";
	}
	
	/*
	 * Returns the class variable total
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/*
	 * Adds a new value to the current total
	 * 
	 * @param  value  the value to be added to the current total
	 */
	public void add (int value) 
	{
		if(history.length() == 0)
		{
			history += Integer.toString(total);		
		}
		history += " + ";
		history += Integer.toString(value);
		total += value;
	}
	
	/*
	 * Subtracts the new value from the current total
	 * 
	 * @param  value  the value to be subtracted from the current total
	 */
	public void subtract (int value) 
	{
		if(history.length() == 0)
		{
			history += Integer.toString(total);		
		}
		history += " - ";
		history += Integer.toString(value);
		total -= value;
	}
	
	/*
	 * Multiplies the new value to the current total
	 * 
	 * @param  value  the value to be multiplied by the current total
	 */
	public void multiply (int value) 
	{
		if(history.length() == 0)
		{
			history += Integer.toString(total);		
		}
		history += " * ";
		history += Integer.toString(value);
		total *= value;
	}
	
	/*
	 * Divides the current total by the new value.  If the new 
	 * value is zero, the current total becomes zero.
	 * 
	 * @param  value  the value the total is divided by
	 */
	public void divide (int value) 
	{
		if(history.length() == 0)
		{
			history += Integer.toString(total);		
		}
		history += " / ";
		history += Integer.toString(value);
		
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total /= value;
		}
	}
	
	/*
	 * Prints the history of computations done by the user.
	 */
	public String getHistory () 
	{
		return history;
	}
}
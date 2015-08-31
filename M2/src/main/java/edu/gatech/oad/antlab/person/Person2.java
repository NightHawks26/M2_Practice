package edu.gatech.oad.antlab.person;
import java.util.Random;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 *
 *  TEAM MEMBER: Adam Lawrence
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
        int len = input.length();
        Random randy = new Random();
        int[] usedValues = new int[len];
        boolean flag = true;
        String nName = "";
        int value = 0;
        for (int i = 0; i < len; i++) {

            while(flag) {
                value = randy.nextInt(len);
                flag = false;
                for(int j = 0; j < len; j++) {
                    if (value +1 == usedValues[j]) {
                        flag = true;
                    }
                }
            }
            flag = true;
            usedValues[i] = value +1;
            nName += input.substring(value,value+1);

        }
        return nName;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}

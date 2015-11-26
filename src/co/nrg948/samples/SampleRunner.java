/**
 * 
 */
package co.nrg948.samples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author davequick
 *
 */
public class SampleRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		OurSpecialArray sample = new OurSpecialArray();
		sample.Add(10);
		sample.Add(12);
		sample.Add(7);
		sample.Add(10);
		sample.Add(12);
		sample.Add(8);
		sample.Add(10);
		sample.Add(12);
		sample.Add(10);
		sample.Add(3);
		Integer[] output = sample.ReducedOutput();

	    System.out.print("[");
		for(Integer e : output){
           System.out.print(e);
	       System.out.print(",");
		}
        System.out.println("\b]");
	}	

}


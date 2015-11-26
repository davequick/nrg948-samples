package co.nrg948.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OurSpecialArray {
	
	private List<Integer> numbers = new ArrayList<>();
	
	public OurSpecialArray(){
	}
	
	public OurSpecialArray Add(int input){
		numbers.add(new Integer(input));
		return this;
	}
	
	public Integer[] ReducedOutput() { // first element is total element count
		
		// dedup entries
		List<Integer> deduped = new ArrayList<>( Dedupe() );
		
		// sort entries
		Collections.sort(deduped,Integer::compare);
		
		// build new array to return
		List<Integer> result = new ArrayList<>();
		
		// add to it the number of deduped values that exist
		result.add(deduped.size());

		// add the sorted deduped values
		result.addAll(deduped);
		
		// return the array
		return result.toArray(new Integer[result.size()]);
	}
	
	public Set<Integer> Dedupe() {
		Set<Integer> dedup = new HashSet<>();
		dedup.addAll(numbers);
		return dedup;
	}
}


package york.eecs.source;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author song and you
 * @description: @BubbleSort uses bubble sorting algorithm to rank a map based on the values.
 */
public class BubbleSort implements MapSort<String, Integer>{
    /**
     * @map to be sorted;
     */
	
	public Map<String, Integer> map;
    
	/**
	 * TODO: There are missing methods, you can find clues from test cases.
     */
	

	/**
	 * @description: Sort a map by the values in ascending order with bubble sorting algorithm. 
	 * @return: Return the corresponding key list of the sorted map.
	 */
	@Override
	public ArrayList<String> sortbyValue(){
		
	/**
	 *  TODO: Implement sorting the maps by values with bubble sorting algorithm.
	 *  	  This method returns the corresponding key list.
	 */
	 ArrayList<String> key = new ArrayList<String>();
	 ArrayList<Integer> value = new ArrayList<Integer>();
	 
	 for (Map.Entry<String, Integer> entry : map.entrySet()){
	  key.add(entry.getKey());
	  value.add(entry.getValue());
	  
	 }
	 boolean swapped;
	 
	for (int i = 0; i < key.size() -1; i++) {
		swapped = false;
		for(int j = 0; j< key.size()-i - 1; j++) {
			if(value.get(j).compareTo(value.get(j +1)) > 0) {
				String k;
				int temp;
				temp = value.get(j);
				k = key.get(j);
				value.set(j,value.get(j+1));
				key.set(j, key.get(j+1));
				value.set(j+1, temp);
				key.set(j+1, k);
				swapped = true;
				
			}
			
			if(!swapped)
				break;
		}
		
	}
	   return key;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		if(map.containsValue(null)) {
			throw new MapContainsNullValueException("Contains null value");
			
		}
		this.map = map;
	}

	@Override
	public ArrayList<String> sortbyValue(Map<String, Double> map) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'sortbyValue'");
	}
}
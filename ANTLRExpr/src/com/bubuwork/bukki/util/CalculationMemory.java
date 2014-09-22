package com.bubuwork.bukki.util;

import java.util.HashMap;
import java.util.Map;

public class CalculationMemory {
	
	/**
	 * calculation memory
	 */
	private Map<String, Object> memory;
	
	public CalculationMemory(){
		this.memory = new HashMap<String, Object>();
	}
	
	
	/**
	 * @return the memory
	 */
	public Map<String, Object> memory() {
		return memory;
	}


	/**
	 * 
	 * @param key
	 * @param value
	 */
	public void addVariable(String key, Object value){
		memory.put(key, value);
	}
	
	
	/**
	 * Get value from memory
	 * @param key
	 * @return
	 */
	public Object getVariable(String key){
		return memory.get(key);
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public boolean containsKey(String key){
		return memory.containsKey(key);
	}
	
}

package com.bubuwork.bukki.util;

import java.util.HashMap;
import java.util.Map;

public class CalculationMemory {
	
	/**
	 * calculation memory
	 */
	private static Map<String, Object> memoryMap = new HashMap<String, Object>();
	
	/**
	 * @return the memoryMap
	 */
	public static Map<String, Object> getMemoryMap() {
		return memoryMap;
	}


	/**
	 * 
	 * @param key
	 * @param value
	 */
	public static void addVariable(String key, Object value){
		memoryMap.put(key, value);
	}
	
	
	/**
	 * Get value from memory
	 * @param key
	 * @return
	 */
	public static Object getVariable(String key){
		return memoryMap.get(key);
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public static boolean containsKey(String key){
		return memoryMap.containsKey(key);
	}
	
}

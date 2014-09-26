package com.bubuwork.bukki.function;

import java.util.List;

import com.bubuwork.bukki.util.CalculationMemory;


/**
 * function executer
 * @author HL
 *
 */
public interface FunctionExecutor {
	
	public Object execute(List paramValueList, CalculationMemory memory);
	
	public String getName();
	
}

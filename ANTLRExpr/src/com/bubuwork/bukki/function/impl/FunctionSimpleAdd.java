package com.bubuwork.bukki.function.impl;

import java.util.List;

import com.bubuwork.bukki.function.FunctionExecutor;
import com.bubuwork.bukki.util.CalculationMemory;

public class FunctionSimpleAdd implements FunctionExecutor{
	
	public static String FUNCTION_NAME = "ADD";
	
	@Override
	public Object execute(List paramList, CalculationMemory memory) {
		Long result = 0L;
		for (Object object : paramList) {
			if(object instanceof Long){
				result = result + (Long)object;
			}
		}
		return result;
	}

	@Override
	public String getName() {
		return FUNCTION_NAME;
	}

}

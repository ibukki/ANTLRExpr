package com.bubuwork.bukki.function;

import com.bubuwork.bukki.function.impl.FunctionSimpleAdd;

public class FunctionExecutorFactory {
	
	public static FunctionExecutor createExecutor(String funcName){
		if("add".equals(funcName)){
			return new FunctionSimpleAdd();
		}
		return null;
	}
}

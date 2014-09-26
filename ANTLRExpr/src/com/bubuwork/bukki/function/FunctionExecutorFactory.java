package com.bubuwork.bukki.function;

import java.util.HashMap;
import java.util.Map;

import com.bubuwork.bukki.function.impl.FunctionSimpleAdd;

public class FunctionExecutorFactory {
	
	/**
	 * static map
	 */
	private static Map<String, FunctionExecutor> executerMap = new HashMap<String, FunctionExecutor>();
	
	static{
		executerMap.put(FunctionSimpleAdd.FUNCTION_NAME, new FunctionSimpleAdd());
	}
	
	/**
	 * create executer
	 * @param funcName
	 * @return
	 */
	public static FunctionExecutor createExecutor(String funcName){
		return executerMap.get(funcName.toUpperCase());
	}
	
	/**
	 * register a  new executor
	 * @param executer
	 */
	public static void registerFunction(FunctionExecutor executer){
		executerMap.put(executer.getName(), executer);
	}
}

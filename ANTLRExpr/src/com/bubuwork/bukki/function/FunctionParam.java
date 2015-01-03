package com.bubuwork.bukki.function;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.TYPE,java.lang.annotation.ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FunctionParam {
	
	public String name();
	
	public ParamTypeEnum type();
	
}

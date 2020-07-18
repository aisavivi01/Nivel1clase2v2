package com.sophos.capacitacion.NivelCalse6;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class matematica {
	public static void main(String[] args) {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		
		engine.put("X", 5);
		
		try {
			Object operation = engine.eval("X^3+X^2+X-2");
			System.out.println("Resultado :"+ operation);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		
	}
	
}

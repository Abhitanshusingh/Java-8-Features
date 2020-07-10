package com.intellect.nashorn_java_script;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample1 {

	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");

		String name = "Abhi";
		Integer result = null;

		try {
			engine.eval("print('" + name + "')");
			 result = (Integer) engine.eval("99 + 1");
		} catch (ScriptException e) {
			System.out.println("Error executing script: " + e.getMessage());
		}
		System.out.println(result.toString());
	}
}
package com.intellect.nashorn_java_script;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample2 {
	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");
		try {
			engine.eval(new FileReader(".\\src\\com\\intellect\\nashorn_java_script\\Nashorn.js"));
		} catch (FileNotFoundException | ScriptException e) {
			e.printStackTrace();
		}
	}
}

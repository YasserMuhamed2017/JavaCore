	package mainpackage;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScript {
	
		public static void main(String[] args) {
			
			ScriptEngineManager scripteEngineManager = new ScriptEngineManager();
			
			ScriptEngine engine = scripteEngineManager.getEngineByName("nashorn");
			
			String script = " var name = 'Yasser Muhamed';name;";
			
			
			try {
				Object result = engine.eval(script);
				System.out.println(result);
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
		}
	}

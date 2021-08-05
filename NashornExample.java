
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {
	public static void main(String[] args) {
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine se = sem.getEngineByName("nashorn");
		String name = "Einstein";

		Integer result = null;
		try {
			se.eval("print('" + name + "')");
			result = (Integer) se.eval("10 + 2");
		} catch (ScriptException e) {
			System.out.println("Error executing script::" + e.getMessage());
		}
		System.out.println(result.toString());

	}
}

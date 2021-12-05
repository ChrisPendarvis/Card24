import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import java.math.BigDecimal;
import java.util.List;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptException;

public class Parser {
    //Parses the equation given by the user into a more usable format.
    //May or may not need this, depending on what we need to solve the equation.
    
    public boolean test(String userInput) throws ScriptException {
        ScriptEngine engine = mgr.getEngineByName("nashorn");
        List<ScriptEngineFactory> factories = mgr.getEngineFactories();
        System.out.println("Hello!");
    for (ScriptEngineFactory factory : factories) {
        System.out.println("\nName : " + factory.getEngineName());
        System.out.println("Version : " + factory.getEngineVersion());
        System.out.println("Language name : " + factory.getLanguageName());
        System.out.println("Language version : " + factory.getLanguageVersion());
        System.out.println("Extensions : " + factory.getExtensions());
        System.out.println("Mime types : " + factory.getMimeTypes());
        System.out.println("Names : " + factory.getNames());
        ScriptEngine engine2 = mgr.getEngineByName(factory.getEngineName());
        if (engine2 == null) {
            System.out.println("Impossible to find the engine with name " + factory.getEngineName()+"\n");
        }

    }
        Object x = engine.eval(userInput);
        int z = new BigDecimal(x.toString()).intValue();
        return z==24;
    }
    private final ScriptEngineManager mgr;
    
    public Parser(){
        mgr = new ScriptEngineManager();
    }
}

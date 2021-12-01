package Maria.FaçadePattern;

import Maria.AdapterPattern.IProcessor;
import Maria.AdapterPattern.Log;

public class RequestHandler {
    public static void processLog(IProcessor processor, Log log){
        processor.process(log);
    }
    
}

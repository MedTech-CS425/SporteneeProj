package Maria.AdapterPattern;

public class PredictorAdapter extends Predictor implements IProcessor {

    @Override
    public void process(Log log) {
        predict(log);
        
    }
    
}

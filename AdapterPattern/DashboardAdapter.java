package Maria.AdapterPattern;

public class DashboardAdapter extends Dashboard implements IProcessor {

    @Override
    public void process(Log log) {
        display(log);
        
    }
    
}

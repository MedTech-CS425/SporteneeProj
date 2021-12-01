package Maria;

public class DistanceCommand implements ICommand {

    Runner client;
    DistanceReceiver receiver;
    
    public Runner getClient() {
        return client;
    }

    public void setClient(Runner client) {
        this.client = client;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public DistanceReceiver getReceiver() {
        return receiver;
    }

    @Override
    public void setReceiver(IReceiver receiver) {
        this.receiver=(DistanceReceiver) receiver;
        
    }

    
}

package Maria;



public interface ICommand {

    
    public Runner getClient();

    public void setClient(Runner client);

    public IReceiver getReceiver();
    public void setReceiver(IReceiver receiver);
    public void execute();
}

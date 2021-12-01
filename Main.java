package Maria;

import Maria.AdapterPattern.DashboardAdapter;
import Maria.AdapterPattern.IProcessor;
import Maria.AdapterPattern.Predictor;
import Maria.AdapterPattern.PredictorAdapter;
import Maria.FaçadePattern.RequestHandler;
import Observer.Observer;
import Observer.Subject;
import ObserverImpl.BloodPressure;
import ObserverImpl.Display;
import ObserverImpl.Distance;
import ObserverImpl.Log;

public class Main {
    public static void main(String Args[]){
        Maria.AdapterPattern.Log log = new Maria.AdapterPattern.Log();
        log.setData("data");
        IProcessor processor = new DashboardAdapter();
        RequestHandler.processLog(processor, log);
        
        /* //Abstract Factory
        ICreator creator = new BasicCreator();
        Watch watch = createWatch(creator);
        BloodPressureBelt belt = createBelt(creator);
        System.out.println(watch.getType());
        System.out.println(belt.getType());*/

        /*//Singleton pattern
        Runner maria = Runner.getInstance();
        maria.setName("Maria");
        System.out.println(maria.getName());
        Runner john =Runner.getInstance();
        john.setName("John");
        System.out.println(maria.getName());*/

        /*//Observer pattern
        Subject distance = new Distance();
        Observer log1 = Log.getInstance();
        Observer display1 = new Display();
        distance.add(log1);
        distance.add(display1);
        distance.setState("Distance = 200m");
        Observer log2 = Log.getInstance();
        distance.add(log2);
        Subject bloodPressure = new BloodPressure();
        bloodPressure.add(log2);
        bloodPressure.add(display1);
        bloodPressure.setState("Blood pressure = 125bpm");*/

       /* 
        //factory method
        Transmitter transmitter;
        transmitter = create(new WatchCreator());
        System.out.println(transmitter.getType());
        Transmitter transmitter2;
        transmitter2 = create(new BPBCreator());
        System.out.println(transmitter2.getType());

        //command pattern
        Runner runner1 = new Runner();
        ICommand distance = new DistanceCommand();
        IReceiver distanceReceiver = new DistanceReceiver();
        distance.setClient(runner1);
        distance.setReceiver(distanceReceiver);
        distance.execute();*/
    }
    /*private static Transmitter create(ICreator creator){
        return creator.create();
    }*/
    private static Watch createWatch(ICreator creator) {
        Watch newWatch = (Watch) creator.createWatch();
        return newWatch;
    } 
    private static BloodPressureBelt createBelt(ICreator creator) {
        BloodPressureBelt newBelt = (BloodPressureBelt) creator.createBelt();
        return newBelt;
    } 
}

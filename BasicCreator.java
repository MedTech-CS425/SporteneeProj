package Maria;

public class BasicCreator implements ICreator {

    @Override
    public Transmitter createBelt() {
        BasicBelt basicBelt = new BasicBelt();
        basicBelt.setType(EnumType.Basic);
        return basicBelt;
    }

    @Override
    public Transmitter createWatch() {
        BasicWatch basicWatch = new BasicWatch();
        basicWatch.setType(EnumType.Basic);
        return basicWatch;
    }
    
}

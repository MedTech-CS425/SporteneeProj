package Maria;

public class VipCreator implements ICreator {

    @Override
    public Transmitter createBelt() {
        VipBelt vipBelt = new VipBelt();
        vipBelt.setType(EnumType.Vip);
        return vipBelt;
    }

    @Override
    public Transmitter createWatch() {
        VipWatch vipWatch = new VipWatch();
        vipWatch.setType(EnumType.Vip);
        return vipWatch;
    }
    
}

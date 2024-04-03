public class AirTransportation extends Transport{
    private String name;
    private int numberOfContainers;
    public AirTransportation(String name, int numberOfContainers){
        super();
        setFees(0.04);
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }

    @Override
    public double getPriceWithFees() {
        return super.getPriceWithFees();
    }
    @Override
    public String getTransportType(){
        return "Transporte aéreo";
    }
}

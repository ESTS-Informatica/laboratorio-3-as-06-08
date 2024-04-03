public class GroundTransportation extends Transport{
    private String licensePlate;
    public GroundTransportation(String licensePlate){
        super();
        setFees(0.03);
        this.licensePlate = licensePlate;
    }

    @Override
    public double getPriceWithFees() {
        return super.getPriceWithFees();
    }
    @Override
    public String getTransportType(){
        return "Transporte terrestre";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

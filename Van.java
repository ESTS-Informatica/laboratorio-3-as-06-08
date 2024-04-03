public class Van extends GroundTransportation{
    private int packages;
    public Van(String licensePlate, int packages) {
        super(licensePlate);
        this.packages = packages;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

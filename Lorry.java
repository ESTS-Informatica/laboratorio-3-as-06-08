public class Lorry extends GroundTransportation{
    private int numberOfPallets, trailers;
    public Lorry(String licensePlate, int numberOfPallets, int trailers) {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

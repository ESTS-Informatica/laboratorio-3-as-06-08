import java.util.ArrayList;

public class Main {
    static ShippingCompany sC;
    static ArrayList<Transport> inTrasportation;
    public static void main(String[] args) {
        inTrasportation = new ArrayList<>();
        sC = new ShippingCompany("RELIABLE-MOVING");
        Transport gT1 = new GroundTransportation("00-AA");
        Transport aT1 = new AirTransportation("TransporteA 1",5);
        Transport aT2 = new AirTransportation("TransporteA 2",6);
        GroundTransportation lT1 = new Lorry("11-BB",5,2);
        GroundTransportation vt1 = new Van("22-CC",3);
        //sC.addAll(gT1,aT1,aT2,lT1,vt1);
        sC.add(gT1);
        sC.add(aT1);
        sC.add(aT2);
        sC.add(lT1);
        sC.add(vt1);
        makeTransportation(gT1.getId(),"Setúbal","Lisboa",45);
        finalizeTransportation(gT1.getId());

        for(Transport transport:sC){
            System.out.println(transport.toString());
        }

    }
    public static void makeTransportation(String id, String origin, String destination, double price){
        for(Transport transport: sC){
            if(transport.getId().equals(id) && transport.isAvailable()){
                transport.setOrigin(origin);
                transport.setDestination(destination);
                transport.setPrice(price);
                transport.setAvailable(false);
                sC.addTransportInService(transport);
                inTrasportation.add(transport);
                sC.remove(transport);
            }
        }
    }

    private static Transport getTransportation(String id){
        for (Transport transport: inTrasportation){
            if(transport.getId().equals(id)){
                return transport;
            }
        }
        return null;
    }
    public static void finalizeTransportation(String id){
        sC.getTransportById(id).resetValues();
        sC.removeTransportInService(sC.getTransportById(id));
        sC.add(getTransportation(id));

    }
}

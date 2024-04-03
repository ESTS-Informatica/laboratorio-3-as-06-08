import java.util.ArrayList;
import java.util.HashSet;

public class ShippingCompany extends HashSet<Transport> {
    private String name;
    private ArrayList<Transport> inService;
    private Transport inTransportation;
    public ShippingCompany(String name){
        this.name = name;
        inTransportation = new Transport();
        inService = new ArrayList<>();
    }

    public void addTransportInService(Transport transport){
        inService.add(transport);
    }

    public void removeTransportInService(Transport transport){
        inService.remove(transport);
    }

    public ArrayList<Transport> getInService() {
        return inService;
    }
    public Transport getTransportById(String id){
        for(Transport transport: inService){
            if(transport.getId().equals(id)){
                return transport;
            }
        }
        return null;
    }
/*
    public void setInService(ArrayList<Transport> inService) {
        this.inService = inService;
    }*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShippingCompany").append("name: ").append(name);
        for (Transport transport : inService){
            sb.append('/').append(", inService").
                    append(transport.toString()).append('}');
        }

        return sb.toString();
        /*return "ShippingCompany{" +
                "name='" + name + '\'' +
                ", inService=" + inService +
                '}';*/
    }
}

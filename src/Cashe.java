import service.Service;

import java.util.ArrayList;
import java.util.List;

public class Cashe {
 private List<Service> list;

    public Cashe() {
        list = new ArrayList<>();
    }

    public Service getService(String serviceName) {
        for (Service sss:list) {
            if (sss.getName().equalsIgnoreCase(serviceName)){
                System.out.println("Return cached  " + serviceName + " object");
                return sss;
            }
        }
        return null;
    }

    public void addService(Service newService){
        boolean exists = false;
        for (Service sss:list) {
            if (sss.getName().equalsIgnoreCase(newService.getName())){
                exists=true;
            }
        }
        if (!exists){
            list.add(newService);
        }
    }
}

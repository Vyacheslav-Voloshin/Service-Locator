package context;

import service.Impl.Service1;
import service.Impl.Service2;

public class InitialContex {

    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("Service1")) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("Service2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}

import context.InitialContex;
import service.Service;

public class ServiceLocator {
    private static Cashe cashe;

    static {
        cashe = new Cashe();
    }

    public static Service getService(String jndiName) {
        Service service = cashe.getService(jndiName);
        if (service!=null){
            return service;
        }
        InitialContex contex = new InitialContex();
        service = (Service) contex.lookup(jndiName);
        cashe.addService(service);
        return service;
    }
}

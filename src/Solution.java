import service.Service;

public class Solution {

    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("Service2");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("Service1");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}

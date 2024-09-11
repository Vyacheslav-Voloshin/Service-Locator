package service.Impl;

import service.Service;

public class Service1 implements Service {

    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing the Service1");
    }
}

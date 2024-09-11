package service.Impl;

import service.Service;

public class Service2 implements Service {

    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing the Service2");
    }
}


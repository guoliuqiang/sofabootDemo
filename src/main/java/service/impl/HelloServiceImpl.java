package service.impl;

import service.HelloService;

public class HelloServiceImpl implements HelloService {


    @Override
    public String saySync(String string) {
        return string;
    }
}

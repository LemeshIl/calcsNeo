package ru.study.endpoint;


import ru.study.ws.CalcWebServiceImpl;

import javax.xml.ws.Endpoint;

public class CalcWebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/wss/calc", new CalcWebServiceImpl());
    }
}





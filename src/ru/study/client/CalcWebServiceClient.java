package ru.study.client;

import ru.study.ws.CalcWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;


public class CalcWebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/wss/calc");
        QName qname = new QName("http://ws.study.ru/", "CalcWebServiceImplService");
        Service service = Service.create(url, qname);
        CalcWebService calcWebService = service.getPort(CalcWebService.class);
        System.out.println("Результат сложения = "+calcWebService.getCalcAdd(7,4));
        System.out.println("Результат умножения = "+calcWebService.getCalcMultiply(7,4));
        System.out.println("Результат вычитания = "+calcWebService.getCalcSubtract(7,4));
        System.out.println("Результат деления = "+calcWebService.getCalcDivide(7,4));

    }
}



package test;

import org.junit.Test;
import ru.study.ws.CalcWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class CalcWebServiceImplTest {


    @Test
    public void test() throws MalformedURLException {
        URL url = new URL("http://localhost:8080/wss/calc");
        QName qname = new QName("http://ws.study.ru/", "CalcWebServiceImplService");
        Service service = Service.create(url, qname);
        CalcWebService calcWebService = service.getPort(CalcWebService.class);
        assertEquals(11, calcWebService.getCalcAdd(5, 6));
        assertEquals(20, calcWebService.getCalcMultiply(5, 4));
        assertEquals(1, calcWebService.getCalcSubtract(7, 6));
        assertEquals(2, calcWebService.getCalcDivide(14, 7));
    }
}
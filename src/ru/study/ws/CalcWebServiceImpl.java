package ru.study.ws;


import javax.jws.WebService;

@WebService(endpointInterface = "ru.study.ws.CalcWebService")
public class CalcWebServiceImpl implements CalcWebService {
    @Override
    public int getCalcAdd(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }

    public int getCalcMultiply(int num1, int num2) {
        int res = num1 * num2;
        return res;
    }

    public int getCalcSubtract(int num1, int num2) {
        int res = num1 - num2;
        return res;
    }


    public int getCalcDivide(int num1, int num2) {
        int res = num1 / num2;
        return res;
    }
}



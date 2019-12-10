package ru.study.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface CalcWebService {
    @WebMethod
    public int getCalcAdd(int num1,int num2);


    public int getCalcMultiply(int num1,int num2);


    public int getCalcSubtract(int num1,int num2);


public int getCalcDivide(int num1,int num2);
        }

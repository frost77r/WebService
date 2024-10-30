package com.example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TaxService {
    @WebMethod
    double calculateIncomeTax(double income);
}


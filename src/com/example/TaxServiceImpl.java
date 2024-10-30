package com.example;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.TaxService")
public class TaxServiceImpl implements TaxService {

    // 个人所得税计算逻辑
    @Override
    public double calculateIncomeTax(double income) {
        double tax;
        if (income <= 5000) {
            tax = 0; // 不征税
        } else if (income <= 15000) {
            tax = (income - 5000) * 0.03; // 3%
        } else if (income <= 35000) {
            tax = (10000 * 0.03) + (income - 15000) * 0.1; // 10%
        } else {
            tax = (10000 * 0.03) + (20000 * 0.1) + (income - 35000) * 0.2; // 20%
        }
        return tax;
    }
}


package com.example;

import javax.xml.ws.Endpoint;

public class WebServicePublisher {
    public static void main(String[] args) {
        // 发布 Web Service
        Endpoint.publish("http://localhost:8080/TaxService", new TaxServiceImpl());
        System.out.println("TaxService is running at http://localhost:8080/TaxService");
    }
}


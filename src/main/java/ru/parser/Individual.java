package ru.parser;

import java.util.Map;

public class Individual {
    private final String name;
    private final String industry;
    private final String sertificateOfRegistry;
    private final String adress;
    private final String inn;

    public Individual(Map<String, String> clientType) {
        this.name = clientType.get("name");
        this.industry = clientType.get("industry");
        this.sertificateOfRegistry = clientType.get("sertificateOfRegistry");
        this.adress = clientType.get("adress");
        this.inn = clientType.get("inn");
    }
}

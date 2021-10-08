package ru.parser;

import java.util.Map;

public class LegalEntity {
    private final String name;
    private final String inn;

    public LegalEntity(Map<String, String> clientType) {
        this.name = clientType.get("name");
        this.inn = clientType.get("inn");
    }
}

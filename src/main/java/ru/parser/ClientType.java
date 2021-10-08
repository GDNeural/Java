package ru.parser;

import java.util.Map;

public enum ClientType {
    INDIVIDUAL {
        public Object createClient(Map<String, String> clientInfo) {
            return new Individual(clientInfo);
        }
    },
    HOLDING {
        public Object createClient(Map<String, String> clientInfo) {
            return new Holding(clientInfo);
        }
    },
    LEGAL_ENTITY {
        public Object createClient(Map<String, String> clientInfo) {
            return new LegalEntity(clientInfo);
        }
    };

    public abstract Object createClient(Map<String, String> clientInfo);
}
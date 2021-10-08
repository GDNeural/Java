package ru.parser;

import java.util.Map;
import java.util.Objects;

public class Holding {
    private final String fullName;
    private final String abbreviatedName;
    private final String industry;
    private final String adress;
    private final String inn;
    private final String okato;
    private final String director;

    public Holding(Map<String, String> clientType) {
        this.fullName = clientType.get("fullName");
        this.abbreviatedName = clientType.get("abbreviatedName");
        this.industry = clientType.get("industry");
        this.adress = clientType.get("adress");
        this.inn = clientType.get("inn");
        this.okato = clientType.get("okato");
        this.director = clientType.get("director");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Holding holding = (Holding) o;
        return Objects.equals(fullName, holding.fullName) &&
                Objects.equals(abbreviatedName, holding.abbreviatedName) &&
                Objects.equals(industry, holding.industry) &&
                Objects.equals(adress, holding.adress) &&
                Objects.equals(inn, holding.inn) &&
                Objects.equals(okato, holding.okato) &&
                Objects.equals(director, holding.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, abbreviatedName, industry, adress, inn, okato, director);
    }
}

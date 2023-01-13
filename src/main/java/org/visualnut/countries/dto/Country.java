package org.visualnut.countries.dto;

import java.util.List;

/**
 * @author geraldobarrosjr
 */
public class Country {

    private String country;
    private List<String> languages;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }


}

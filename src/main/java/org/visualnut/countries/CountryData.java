package org.visualnut.countries;

import org.visualnut.countries.dto.Country;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author geraldobarrosjr
 */
public class CountryData {

    private final List<Country> countries;

    public CountryData(List<Country> countries) {
        this.countries = countries;
    }

    public int getNumberOfCountries() {
        return (int)countries.stream().count();
    }

    public String findCountryWithMostGermanLanguages() {
        return countries.stream()
                .filter(item -> item.getLanguages().contains("de"))
                .max((item1, item2) -> item1.getLanguages().size() - item2.getLanguages().size())
                .map(Country::getCountry)
                .orElse("");
    }

    public String findCountryWithMostLanguages() {
        return countries.stream()
                .max((item1, item2) -> item1.getLanguages().size() - item2.getLanguages().size())
                .map(Country::getCountry)
                .orElse("");
    }

    public List<String> findMostCommonLanguage() {
        return countries.stream()
                .flatMap(item -> item.getLanguages().stream())
                .collect(Collectors.groupingBy(l -> l, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .map(List::of)
                .orElse(List.of());
    }



}

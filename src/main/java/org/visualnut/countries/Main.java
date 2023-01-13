package org.visualnut.countries;

import org.visualnut.countries.config.CountryList;

/**
 * @author geraldobarrosjr
 */
public class Main {

        public static void main(String[] args) {
            CountryList countryList = new CountryList();
            CountryData countryData = new CountryData(countryList.getCountries());
            countryList.getCountries().forEach(country -> {
                System.out.println("Country: " + country.getCountry());
                System.out.println("Languages:" );
                country.getLanguages().forEach(language -> System.out.println(" - " + language));
            });

            System.out.println("");
            System.out.println("--- SUMMARY ---");
            System.out.println("- Total countries: " + countryData.getNumberOfCountries());
            System.out.println("- Country with most German languages: " + countryData.findCountryWithMostGermanLanguages());
            System.out.println("- Country with most languages: " + countryData.findCountryWithMostLanguages());
            System.out.println("- Total most common languages: " + countryData.findMostCommonLanguage());


        }

}

package org.visualnut.countries.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.visualnut.countries.dto.Country;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author geraldobarrosjr
 */
public class CountryList {

    private List<Country> countries;

    public List<Country> readJSONFile() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Countries.json");
        ObjectMapper objectMapper = new ObjectMapper();
        var result =  objectMapper.readValue(inputStream, objectMapper.getTypeFactory().constructCollectionType(List.class, Country.class));
        return (List<Country>) result;
    }


    public CountryList() {
        try {
            countries = readJSONFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Country> getCountries() {
        return countries;
    }



}

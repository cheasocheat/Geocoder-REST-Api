package com.glf.geocoding.controller;

import com.glf.geocoding.model.google.Geocoding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
@RestController
@RequestMapping("/google/api")
public class GoogleGeoCodeController {

    @Value("${google.map.api.key}")
    private String apiKey;

    @Value("${google.geocode.api.url}")
    private String geocodeUri;

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/googleMapKey")
    public String getApiKey(){
        if(apiKey != null){
            return apiKey;
        }
        return "";
    }

    @GetMapping("/geocode")
    public Geocoding getLatLongFromAddress(@RequestParam(value = "address", defaultValue="Kampong Chak+Romduol+Svay Rieng+Cambodia") String address){

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(geocodeUri)
                .queryParam("address", address)
                .queryParam("key", apiKey);

        Geocoding geocoding = restTemplate.getForObject(builder.toUriString(), Geocoding.class);

        return geocoding;
    }
}

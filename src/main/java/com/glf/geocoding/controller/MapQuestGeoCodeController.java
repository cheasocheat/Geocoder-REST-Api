package com.glf.geocoding.controller;

import com.glf.geocoding.model.mapquest.Location;
import com.glf.geocoding.model.mapquest.MapQuestGeocoding;
import com.glf.geocoding.model.mapquest.MapQuestGeocodingResult;
import com.glf.geocoding.model.respose.GeocodingResponse;
import com.glf.geocoding.shared.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import java.net.URI;
import java.net.URLDecoder;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
@RestController
@RequestMapping("/mapquest/api")
public class MapQuestGeoCodeController {

    @Value("${mapquest.api.key}")
    private String apiKey;

    @Value("${mapquest.geocode.api.url}")
    private String geocodeUri;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders header;

    @GetMapping("/mapQuestKey")
    public String getApiKey() {
        if (apiKey != null) {
            return apiKey;
        }
        return "";
    }

    @GetMapping("/geocode")
    public GeocodingResponse getLatLongFromAddress(@RequestParam(value = "address", defaultValue = "Phnom Penh, Cambodia") String address) {
        GeocodingResponse response = new GeocodingResponse();
        try {
           /* UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(geocodeUri)
                    .queryParam("location", address)
                    .queryParam("key", apiKey)
                    .encode(Charset.forName("UTF-8"));*/

            String url = "{geocodeUri}?key={apiKey}&location={address}";
            URI expanded = new UriTemplate(url).expand(geocodeUri, apiKey, address); // this is what RestTemplate uses
            url = URLDecoder.decode(expanded.toString(), "UTF-8");

            MapQuestGeocoding geoCoding = restTemplate.getForObject(url, MapQuestGeocoding.class);
            MapQuestGeocodingResult[] locationArray = geoCoding.getMapQuestGeocodingResults();
            if (locationArray.length > 0) {
                Location[] locations = locationArray[0].getLocations();
                for (Location location : locations) {
                    if (this.isAdminAreaNotNull(location)) {
                        response.setLocation(location.getLatLng());
                    }
                }
            }
            response.setStatus(StatusCode.OK);
            response.setMessage(StatusCode.OK.getDesc());
            //response.setLocation();
        } catch (Exception e) {
            response = GeocodingResponse.setErrorResponse(e.getLocalizedMessage());
        }
        return response;
    }

    private boolean isAdminAreaNotNull(Location location) {
        return location != null && (!location.getAdminArea6().isEmpty() || !location.getAdminArea5().isEmpty() || !location.getAdminArea4().isEmpty() || !location.getAdminArea3().isEmpty());
    }
}

package com.weatherstation.precipitation.api.Precipitation;


import java.util.Map;
import java.util.Objects;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/precipitation")
public class PrecipitationController {

  private final PrecipitationService precipitationService;

  public PrecipitationController(PrecipitationService precipitationService) {
    this.precipitationService = precipitationService;
  }

  @GetMapping("/latest")
  public ResponseEntity<Map<String, Object>> getLatestReport(@RequestParam float temperature){
    return ResponseEntity.ok(precipitationService.getPrecipitation(temperature));
  }

}

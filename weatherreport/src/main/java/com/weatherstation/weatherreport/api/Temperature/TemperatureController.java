package com.weatherstation.weatherreport.api.Temperature;


import java.util.Collections;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/temperature")
public class TemperatureController {

  private final TemperatureService temperatureService;

  @Autowired
  public TemperatureController(TemperatureService temperatureService) {
    this.temperatureService = temperatureService;
  }

  @GetMapping("/poll")
  public ResponseEntity<Map<String, Float>> getTemperature(){
    float temperature = temperatureService.pollTemperature();
    Map<String, Float> body = Collections.singletonMap("temperature", temperature);

    return ResponseEntity.ok(body);
  }

}

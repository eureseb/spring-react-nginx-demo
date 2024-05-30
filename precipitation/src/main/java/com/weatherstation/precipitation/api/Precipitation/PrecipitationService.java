package com.weatherstation.precipitation.api.Precipitation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class PrecipitationService {

  public Map<String, Object> getPrecipitation(float temperature) {
    Map<String, Object> weatherInfo = new HashMap<>();

    String currentWeather;
    String mostLikelyFallout;
    double falloutChance;

    Random random = new Random();
    falloutChance = random.nextDouble();

    // Determine current weather, most likely fallout, and its chance based on temperature
    if (temperature >= 30) {
      currentWeather = "sunny";
      mostLikelyFallout = "none";
    } else if (temperature >= 20) {
      currentWeather = "partly cloudy";
      mostLikelyFallout = "rain";
    } else if (temperature >= 10) {
      currentWeather = "cloudy";
      mostLikelyFallout = "rain";
    } else if (temperature >= 0) {
      currentWeather = "rainy";
      mostLikelyFallout = "rain";
    } else {
      currentWeather = "snowy";
      mostLikelyFallout = "snow";
    }

    // Populate the map with weather information
    weatherInfo.put("currentWeather", currentWeather);
    weatherInfo.put("mostLikelyFallout", mostLikelyFallout);
    weatherInfo.put("falloutChance", new BigDecimal(falloutChance).setScale(2, RoundingMode.HALF_UP));
    return weatherInfo;
  }
}

package com.weatherstation.weatherreport.api.Temperature;


import java.util.Map;
import java.util.Random;
import java.util.random.RandomGenerator;
import org.springframework.stereotype.Service;

@Service
public class TemperatureService {
  public float pollTemperature(){
    // Maximum and minimum temperatures recorded on Earth
    float maxTemp = 56.7f; // Maximum temperature in Celsius
    float minTemp = -89.2f; // Minimum temperature in Celsius

    // Create an instance of the Random class
    Random random = new Random();

    // Print the random temperature
    return minTemp + random.nextFloat() * (maxTemp - minTemp);
  }
}

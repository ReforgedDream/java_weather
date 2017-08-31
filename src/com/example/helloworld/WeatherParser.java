package com.example.helloworld;

public class WeatherParser implements WeatherParserInterface {

    @Override
    public int getTemperature(String city) {
        if (city == "Novosibirsk") {
            return 21;
        }
        else {
            return 3;
        }

}

}

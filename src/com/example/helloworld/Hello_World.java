package com.example.helloworld;

public class Hello_World {

    public static void printTempInCity (String inputCity){

        WeatherParser parser1 = new WeatherParser();

        System.out.println("Temperature in "+ inputCity + " is " + parser1.getTemperature(inputCity) + "!");
    }

    public static void main(String[] args) {

        String currentCity = "Novosibirsk";

        printTempInCity(currentCity);

        currentCity = "Tokyo";

        printTempInCity(currentCity);

    }

}

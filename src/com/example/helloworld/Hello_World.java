package com.example.helloworld;

public class Hello_World {

    static WeatherParser parser1 = new WeatherParser();

    static private void printTempInCity(String inputCity){

        System.out.println("Temperature in "+ inputCity + " is " + parser1.getTemperature(inputCity));
    }

    public static void main(String[] args) {

        String currentCity = "Novosibirsk";

        printTempInCity(currentCity);

        currentCity = "Tokyo";

        printTempInCity(currentCity);

    }

}

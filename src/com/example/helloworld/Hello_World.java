package com.example.helloworld;

import java.util.Scanner;

public class Hello_World {

    static WeatherParser parser1 = new WeatherParser();

    //method that prints the human-readable message about weather
    static private void printWeatherInCity(String inputCity){

        //call the WeatherParser's class getTemperature
        //and print it to standard output along with some human-readable notes
        System.out.println("Temperature in "+ inputCity + " is " + parser1.getTemperature(inputCity));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //write prompt in console
        System.out.println("Enter city name:");

        //get typed the walue in currentCity
        String currentCity = in.next();

        //call the method that prints the human-readable message about weather
        printWeatherInCity(currentCity);

    }

}

package org.example;

import java.time.Year;

public class Exercise {
    public static void main(String[] args) {

        // TODO: Fix the following variable declarations by providing the correct type in place of the ___. Fix the value of currentYear so that it is the correct year. BONUS - handle getting the current year programmatically.

         int moonLandingYear = 1969;
         int currentYear = Year.now().getValue();

         int distanceToMoonKM = 384_400;
         int averageHeightEverestMeters = 8_848;

         double averageRainfallInches2023 = 35.5;
         double highestTemperatureRecordedCelsius = 56.7;
         double lowestTemperatureRecordedCelsius = -89.2;

         String intro = "Exploring natural wonders and scientific discoveries helps us understand the world around us.";

        // TODO: Complete the following mathematical calculations.

        // Calculate the time difference between moonLandingYear and currentYear, and print the result.
        int yearsSinceMoonLanding = currentYear - moonLandingYear;
        System.out.println(yearsSinceMoonLanding);

        // Divide distanceToMoonKM by the average speed of light (299,792 km/s) to find how long it takes for light to travel from the Moon to Earth. Print the result.
        double moonEarthLightTravelTimeSeconds = (double) distanceToMoonKM / (double) 299_792;
        System.out.println(moonEarthLightTravelTimeSeconds);

        // TODO: Convert the following String into a number.

        String population2011 = "7_000_000_000";
        long populationNumber = Long.parseLong(population2011.replace("_", ""));
        System.out.println(populationNumber);

        // TODO: Complete the following variable declarations, find the typo, and replace the /*something*/s in the String with the proper variables.

         int averageHumanLifespanYears = 72;
         int numberOfContinents = 7;
         String earthStats = "The average human lifespan is " + averageHumanLifespanYears + " years, and our planet has " + numberOfContinents + " continents.";
         System.out.println(earthStats);

        // TODO: Using one line of code, determine if the `earthStats` string contains the word "wonders". Print the result to the command line.
        System.out.println(earthStats.contains("wonders"));

        // TODO: Calculate the average temperature between the highest recorded temperature and the lowest recorded temperature.
        double averageRecordedTemperatureCelsius = (highestTemperatureRecordedCelsius + lowestTemperatureRecordedCelsius) / 2;
        System.out.println(averageRecordedTemperatureCelsius);

    }
}

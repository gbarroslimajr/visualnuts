# Language Data Analysis

This project is a Java application that performs various analyses on a set of data describing official languages spoken by countries. The data is provided in the form of a JSON file, which is read from the resources directory and then parsed into a list of `Country` objects.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

To run this project, you will need the following:

- Java 19 or later
- Maven

### Installing

Clone the repository to your local machine:
git clone https://github.com/gbarroslimajr/visualnuts


Navigate to the project directory:
cd countries


Run the following command to build and run the project:

mvn clean install


## Features

The following features are provided by the application:

- `getNumberOfCountries()`: Returns the number of countries in the world
- `findCountryWithMostGermanLanguages()`: Finds the country with the most official languages, where they officially speak German
- `findCountryWithMostLanguages()`: Finds the country with the highest number of official languages.
- `findMostCommonLanguage()`: Finds the most common official language(s) of all countries.

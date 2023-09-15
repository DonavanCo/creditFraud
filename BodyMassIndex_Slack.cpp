///////////////////////////////////////////////////////
// Name:Donavan L. Slack, Jr.
// Date:9/5/23
// Assignment:Body Mass Index
// Description: Write a program that calculates and displays a person’s body mass index
// (BMI) when the user provides their weightand height.The BMI is often used to determine
// whether a person is overweight or underweight for his or her height.A person’s BMI is
// calculated with the following formula: BMI = (weight in lbs * 703) / (height in inches)^2
// Where weight is measured in pounds and height is measured in inches.The program should
// display a message indicating whether the person has optimal weight(BMI between 18.5 and 25
// inclusive), is underweight(BMI less than 18.5), or is overweight(BMI greater than 25).
///////////////////////////////////////////////////////

#include <iostream> //Includes the iostream library
#include <string> //Includes the string library
#include <iomanip> //Includes the library for formatting output and input
#include <cmath>  //Includes the cmath library

using namespace std; //Assume the use of the standard (std) family

int main()  //the main function
{ //Start of main

	//Step 1: Declare identifiers
	float weight = 0;
	int height = 0;
	float BMI = 0;
	//Step 2: Create user input
	
	cout << "Type your weight in pounds: ";
	cin >> weight;
	cout << "Type your height in inches: ";
	cin >> height;

	//Step 3: Calculate BMI
	
	BMI = (weight * 703)/pow(height,2);

	//Step 4: Create Output

	if (BMI >= 18.5 && BMI <= 25) {
		cout << "You have an optimal weight! ";
	}
	else if (BMI < 18.5) {
		cout << "You are underweight ";
	}
	else {
		cout << "You are overweight ";
	}

	system("pause");  //Prevents the console from closing on exit.  
	return 0;  //Returns whatever is defined by the function return type

} //End of main
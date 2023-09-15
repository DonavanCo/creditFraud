///////////////////////////////////////////////////////
// Name:Donavan L. Slack, Jr.
// Date:9/5/23
// Assignment: Areas of a Rectangle
// Area of a Rectangle: Write a program that calculates the area of
// a rectangle.For this program, use 12 for the length and 7 for
// the width.[HINT:area = (width * length)]
///////////////////////////////////////////////////////

#include <iostream> //Includes the iostream library
#include <string> //Includes the string library
#include <iomanip> //Includes the library for formatting output and input

using namespace std; //Assume the use of the standard (std) family

int main()  //the main function
{ //Start of main

	//Step 1: Declare identifiers

	int length = 0;
	int width = 0;
	int area = 0;
	//Step 2: Create user input

	cout << "Width of Rectangle: ";
	cin >> width;
	cout << "Length of Rectangle: ";
	cin >> length;
	//Step 3: Calculate

	area = length * width;
	//Step 4: Present Information

	cout << "The rectangle's width: "
		<< width
		<< endl
		<< "The rectangle's length: "
		<< length
		<< endl
		<< "The rectangle's area: "
		<< area
		<< endl;
	//Step 5: End of code

	system("pause");  //Prevents the console from closing on exit.  
	return 0;  //Returns whatever is defined by the function return type

} //End of main
///////////////////////////////////////////////////////
// Name:Donavan L. Slack, Jr.
// Date:3/23/23
// Assignment: Roman Numeral Converter
// Description:Write a program that asks the user to enter a number between 1
// and 10 inclusive.The program should then display the Roman numeral version of that number.
// Don’t allow the program to accept a number less than 1 or greater than 10.
///////////////////////////////////////////////////////

#include <iostream> //Includes the iostream library
#include <string> //Includes the string library
#include <iomanip> //Includes the library for formatting output and input

using namespace std; //Assume the use of the standard (std) family

int main()  //the main function
{ //Start of main

	//Step 1: Declare identifiers
	int num1 = 0;
	int i = 0;
	int num2 = 0;
	//Step 2: Create user input

	cout << "Type a number: ";
	cin >> num1;
	
	if (num1 <= 4) {
		cout << "You entered: " << num1 << endl;
		cout << "The Roman Numeral Equivalent is: ";
		while (i < num1) {
			cout << "I";
			i++;
		}
		cout << " ";
	}
	else if (num1 <= 8) {
		i = num1 - 5;
		cout << "You entered: " << num1 << endl;
		cout << "The Roman Numeral Equivalent is: ";
		cout << "V";
		while (num2 < i) {
			cout << "I";
			num2++;
		}
		cout << " ";
	}
	else if (num1 == 9) {
		cout << "You entered: " << num1 << endl;
		cout << "The Roman Numeral Equivalent is: IX ";
	}
	else if (num1 == 10) {
		cout << "You entered: " << num1 << endl;
		cout << "The Roman Numeral Equivalent is: X ";
	}
	else {
		cout << num1 << " is not a valid number. Please try again. ";
	}

	system("pause");  //Prevents the console from closing on exit.  
	return 0;  //Returns whatever is defined by the function return type

} //End of main
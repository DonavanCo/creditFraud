///////////////////////////////////////////////////////
// Name:Donavan L. Slack, Jr.
// Date: 4/17/23
// Assignment: Countdown
// Description: Write a program that uses a loop to count down and display all of the
// numbers from 50 to 0.
///////////////////////////////////////////////////////

#include <iostream> //Includes the iostream library
#include <string> //Includes the string library

using namespace std; //Assume the use of the standard (std) family

int main()  //the main function
{ //Start of main

	//Step 1: Name Identifiers
	int i = 0;
	//Step 2: Create loop
	i = 50;
	while (i > 0) {
		cout << i;
	}
	


	system("pause");  //Prevents the console from closing on exit.  
	return 0;  //Returns whatever is defined by the function return type

} //End of main
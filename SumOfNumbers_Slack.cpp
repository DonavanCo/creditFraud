///////////////////////////////////////////////////////
// Name:Donavan L. Slack, Jr.
// Date: 4/17/23
// Assignment:Sum of Numbers
// Description: Write a program that uses a loop to sum all of the numbers from 1 to 100 
// inclusive.
///////////////////////////////////////////////////////

#include <iostream> //Includes the iostream library
#include <string> //Includes the string library

using namespace std; //Assume the use of the standard (std) family

int main()  //the main function
{ //Start of main

	//Step 1: Name Identifiers
	int sum = 0;
	int i = 0;
	//Step 2: Create loop
	while (i <= 100){
		sum = sum + i;
		i++;
	}
	cout << "The sum of the numbers from 1 to 100 is: " << sum << " ";

	system("pause");  //Prevents the console from closing on exit.  
	return 0;  //Returns whatever is defined by the function return type

} //End of main
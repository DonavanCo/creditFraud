///////////////////////////////////////////////////////
// Name:Donavan L. Slack, Jr.
// Date: 9/5/23
// Assignment: Product of numbers 
// Description: Write a program that uses a loop to multiply all of the numbers from
// 1 to 10 inclusive.
///////////////////////////////////////////////////////

#include <iostream> //Includes the iostream library
#include <string> //Includes the string library

using namespace std; //Assume the use of the standard (std) family

int main()  //the main function
{ //Start of main

	//Step 1: Name Identifiers
	int product = 0;
	int i = 0;
	//Step 2: Create loop
	product = 1;
	i = 1;
	while (i <= 10){
		product = product * i;
		i++;
	}
	cout << "The product of the numbers from 1 to 10 is: " << product << " " << endl;

	system("pause");  //Prevents the console from closing on exit.  
	return 0;  //Returns whatever is defined by the function return type

} //End of main
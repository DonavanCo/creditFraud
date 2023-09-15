///////////////////////////////////////////////////////
// Name:Donavan L. Slack, Jr.
// Date: 4/17/23
// Assignment: Repeating Phrase 
// Description: Write a program that uses a loop to display the phrase "The loop is
// running" until the user enters a zero. 
///////////////////////////////////////////////////////

#include <iostream> //Includes the iostream library
#include <string> //Includes the string library
using namespace std; //Assume the use of the standard (std) family

int main()  //the main function
{ //Start of main

	//Step 1: Name Identifiers
	int i = 0;
	int use = 1;
	//Step 2: Create loop
	while (use!=0) {
		cout << "The loop is running ";
		cin >> use;
	}

	system("pause");  //Prevents the console from closing on exit.  
	return 0;  //Returns whatever is defined by the function return type

} //End of main
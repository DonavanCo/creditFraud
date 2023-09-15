///////////////////////////////////////////////////////
// Name:Donavan L. Slack, Jr.
// Date: 4/17/23
// Assignment: Repeating Menu 
// Description: Write a program that uses a loop to display the phrase "Please select an item.
// Enter {Q} or {q} to quit" until the user enter a "Q" or a "q".
///////////////////////////////////////////////////////

#include <iostream> //Includes the iostream library
#include <string> //Includes the string library

using namespace std; //Assume the use of the standard (std) family

int main()  //the main function
{ //Start of main

	//Step 1: Name Identifiers
	char quit = 'Q';
	char stop = 'q';
	char use = 'a';
	//Step 2: Create loop
	while (use != quit && use != stop) {
		cout << "Please select an item. Enter {Q} or {q} to quit ";
		cin >> use;
	}

	system("pause");  //Prevents the console from closing on exit.  
	return 0;  //Returns whatever is defined by the function return type

} //End of main
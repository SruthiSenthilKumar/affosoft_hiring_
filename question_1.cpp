#include <iostream>
#include <iomanip>
#include <string.h>
using namespace std;
int main()
{
    string name;
    cout << "Enter the name :" << endl;
    cin >> name;
    for(int i = 0 ; i <= name.length() ; i++)
    {
        cout << right << setw(100) << name.substr(0,i) <<endl;
    }
    return 0;
}

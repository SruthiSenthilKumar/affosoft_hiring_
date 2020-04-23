#include <iostream>
#include <vector>
using namespace std;

class Student
{
    private:
        string first_name;
        string last_name;
    public:
        int x = 0;
        string getFirst_name()
        {
            return first_name;
        }
        string getLast_name()
        {
            return last_name;
        }
        void setFirst_name(string str)
        {
            first_name = str;
        }
        void setLast_name(string str)
        {
            last_name = str;
        }
};

int sameName(Student s[],int n)
{
    vector<bool> visited(n,false);
    int share = 0;
    for(int i = 0 ; i < n ; i++)
    {
        if(visited[i] == true)
            continue;
        int cnt = 1;
        for(int j = i+1 ; j < n ; j++)
        {
            if(s[i].getFirst_name().compare(s[j].getFirst_name()) == 0 )
            {
                visited[j] = true;
                cnt++;
            }
        }

        if(cnt > 1)
        {
            share += cnt;
            cout << s[i].getFirst_name() << " is shared with " << cnt << " students" << endl;
        }
    }
    return share;
}
int main()
{
    int n;
    cout << "Enter the number of students..." ;
    cin >> n;

    Student s[n];
    for(int i = 0 ; i < n ; i++)
    {
        string a;
        cout << "Enter the details of student " << i + 1 << ":\n";
        cin >> a;
        s[i].setFirst_name(a);
        cin >> a;
        s[i].setLast_name(a);
    }
    cout << endl;
    cout << endl << "The students sharing the same name  = "<< sameName(s,n) << endl;
}

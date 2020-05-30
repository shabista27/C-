#include<iostream>
using namespace std;
int main()
{
 int boat,adult,child;
  cin>>boat>>adult>>child;
 adult*=75;
  child*=30;
  int total=adult+child;
  if(total>boat)
  {
    cout<<"Boat will drow";
  }
  else
  {
    cout<<"Boat is stable";
  }
  return 0;
}
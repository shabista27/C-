#include<iostream>
using namespace std;
int main()
{
  int rows,column,number;
  cin>>rows>>column>>number;
  if((rows+column)==number||(rows+column)*2==number)
  {
    cout<<"It is a mango tree";
  }
  else
  {
  cout<<"It is not a mango tree";
  }
}
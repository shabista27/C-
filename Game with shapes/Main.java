#include<iostream>
using namespace std;
int main()
{
 int radius,side;
  cin>>radius>>side;
  int dia;
  dia=2*radius;
  if(dia>side)
  {
    cout<<"circle cannot be inside a square";
  }
  else
  {
  cout<<"circle can be inside a square";
  }
}
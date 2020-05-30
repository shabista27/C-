#include<iostream>
using namespace std;
int main()
{
 float mileage;
  int liters,distance;
  cin>>mileage>>liters>>distance;
  float fuel;
  fuel=distance/mileage;
  if(fuel<=liters)
  {
  cout<<"Can reach";
  }
  
  else
  {
  cout<<"Cannot reach";
  }
}
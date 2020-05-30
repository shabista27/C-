#include<iostream>
using namespace std;
int main()
{
int age;
  float timing;
  float price;
  static float time=12.00;
  cin>>age>>timing;
  if(timing<=time)
  {
    if(age>13)
    {
      price=8.00;
    cout<<"$8.00";
    }
else
{
price=4.00;
  cout<<"$4.00";
}
  }
else
{
if(age>13)
{
price=5.00;
  cout<<"$5.00";
}
  else
  {
  price=2.00;
    cout<<"$2.00";
  }
  
}
  
}
#include<iostream>
using namespace std;
int main()
{
  
  int maxWeight, fWeight;
  
  cin>>maxWeight>>fWeight;
  
  if(fWeight>maxWeight)
  {
    cout<<"Sorry, you can't enter";
  }
  
  else if(fWeight==maxWeight)
  {
    cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else
  {
    cout<<"Yes, you can enter.";
  }
  return 0;
}
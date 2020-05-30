#include<iostream>
using namespace std;
int main()
{
  int items;
  float time;
  float change1,finalchange;
  cin>>items>>time;
  finalchange=items*time;
  if(items<=2)
  {
  	change1=(time*50)/100;
    cout<<finalchange-change1;
  }
  else if(items==3)
  {
  change1=time*2;
    cout<<change1;
  }
  else
  {
    cout<< "Number of items is more";
  }
}
#include<iostream>
using namespace std;
int main()
{
int currAge,bYear,currYear;
  cin>>bYear>>currYear;

  if(bYear>currYear)
  {
     bYear+=1900;
    currYear+=2000;
  }
  else
  {
  bYear+=2000;
   currYear+=2000;
 }
  
  cout<<currYear-bYear;
  
}
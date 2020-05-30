#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int x1,y1,x2,y2;
  float pow1,pow2,powtotal,squart;
  cin>>x2>>y2;
  x1=3;
  y1=4;
  pow1=pow((x2-x1),2);
  pow2=pow((y2-y1),2);
  powtotal=pow1+pow2;
  squart=sqrt(powtotal);
  cout<<int(squart);
  return 0;
}
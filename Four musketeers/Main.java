#include<iostream>
using namespace std;
int main()
{
 int x1,y1,x2,y2,x3,y3;

 cin>>x1>>y1>>x2>>y2>>x3>>y3;

 float x;

 float y;

 x = (float)(x1+x2+x3)/3;   //casting

 y = (float)(y1+y2+y3)/3;

 cout<<x<<endl;

 cout<<y;
}
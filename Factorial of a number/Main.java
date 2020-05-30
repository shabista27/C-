#include<iostream>
using namespace std;
int main()
{
  int num=0,result=1;
  int i;
  cin>>num;
  for(i=1;i<=num;i++)
  {
  	result*=i;
  }
    cout<<result;
}
#include<iostream>
#include<string.h>
using namespace std;
int main()
{
char a[10];
int b;
std::cin>>a;
std::cin>>b;
if((strcmp(a,"front")==0))
{
if(b==1)
std::cout<<"Left Handed";
else
cout<<"Right Handed";
}else{
if(b==1)
{
cout<<"Right Handed";
}
  else  
cout<<"Left Handed";    
}
}


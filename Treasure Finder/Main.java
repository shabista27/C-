#include<iostream>
using namespace std;
int main()
{
  int box1,box2,box3,code,position;
  int flag=0;
  cin>>box1>>box2>>box3;
  
  if(box1>box2 && box1>box3)
  {
    if(box2>box3)
    {
  cout<<"The treasure is in box which has number "<<box2;
    }
    else
    {
      cout<<"The treasure is in box which has number "<<box3;
    }
  }
  else if(box2>box1 && box2>box3){
      if(box1>box3)
    {
  cout<<"The treasure is in box which has number "<<box1;
    }
    else
    {
      cout<<"The treasure is in box which has number "<<box3;
    }
  }
  else if(box3>box1 && box3>box2)
  {
     if(box2>box1)
    {
  cout<<"The treasure is in box which has number "<<box2;
    }
    else
    {
      cout<<"The treasure is in box which has number "<<box1;
    }
  }
  int t=1;
  
  for( int i=1;i<=5;i++)
  {
    if(box1%i==0 && box2%i==0 && box3%i==0)
    {
    t=i;
    }
    
  }
 
  cout<<"\nThe code to open the box is "<<t;
  
}
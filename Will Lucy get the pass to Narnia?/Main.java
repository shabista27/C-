#include<iostream>
using namespace std;
int main()
{
  int num1,num2,op,result;
cout<<"Enter first number : ";
  cin>>num1;
  cout<<"Enter second number : ";
  cin>>num2;
  cout<<"Menu \n";
  cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  cin>>op;
  switch(op)
  {
    case 1: 
    		result=num1+num2;
        cout<<result;
    		break;
    case 2: 
    		result=num1-num2;
        cout<<result;
    		break;
    case 3:
    		result=num1*num2;
        cout<<result;
    		break;
    case 4:
    	result=num1/num2;
    	break;
    case 5:
    	result=num1%num2;
        cout<<result;
    break;
    default:
    cout<<"Invalid operation";
    break;
  }
  

}

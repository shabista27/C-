#include<iostream>
using namespace std;
int main()
{
  int famount,fdiscount,fshipping;
  int samount,sdiscount,sshipping;
  int aamount,adiscount,ashipping;
  
 cin>>famount>>fdiscount>>fshipping;
  cin>>samount>>sdiscount>>sshipping;
  cin>>aamount>>adiscount>>ashipping;

  int discount1= (famount*fdiscount)/100;
  int price1=famount-discount1+fshipping;
  
  int discount2= (samount*sdiscount)/100;
  int price2=samount-discount2+sshipping;
 
  int discount3= (aamount*adiscount)/100;
  int price3=aamount-discount3+ashipping;
  
  if(price1<=price2  &&  price1<=price3)
  {
  cout<<"In Flipkart Rs."<<price1;
   cout<<"\nIn Snapdeal Rs."<<price2;
     cout<<"\nIn Amazon Rs."<<price3;
    cout<<"\nHe will prefer Flipkart";
  }
  
   else if(price2<=price1  &&  price2<=price3)
  {
 cout<<"In Flipkart Rs."<<price1;
   cout<<"\nIn Snapdeal Rs."<<price2;
     cout<<"\nIn Amazon Rs."<<price3;
    cout<<"\nHe will prefer Snapdeal";
  }
  
   else if(price3<=price2  &&  price3<=price1)
  {
  cout<<"In Flipkart Rs."<<price1;
   cout<<"\nIn Snapdeal Rs."<<price2;
     cout<<"\nIn Amazon Rs."<<price3;
    cout<<"\nHe will prefer Amazon";
  }
  
}
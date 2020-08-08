#include<iostream>
using namespace std;
int p(int,int);
int main()
{
  //Type your code here.
  int a,n,k;
  cin>>a>>n;
  cout<<"Enter the value of a"<<"\n";
  cout<<"Enter the value of n"<<"\n";
  k=p(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<k;
  return(0);
}
int p(int a,int n)
{
  int k;
  if(n==0)
    return 1;
 else
   return  a*p(a,n-1);
   
  
  
}
#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
   for(int i=0;i<n-1;i++)
  {
     if (a[i]>a[i+1])
       a[i+1]=a[i];
     else
        a[i+1]=a[i+1] ;
   }
  cout<<a[n-1];
  return(0);
  
       

  
}
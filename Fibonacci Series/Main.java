#include<iostream>
using namespace std;
int f(int);
int main()
{
	int n,r;
	
	
	cin>>n;
	r=f(n);
	cout<<"The term "<<n<<" in the fibonacci series is "<<r;
      ;
	
}
int f(int n)
{
	
	
    if (n==1) 
        return 0; 
    if (n==2) 
        return 1; 
	else	   
    return f(n-1) + f(n-2);
}
#include<iostream>
using namespace std;
int sum(int);
int main()
{
	int n,k;
	//cout<<"enter the value of n = ";
	cin>>n;
	n=n*10;
	//cout<<"sum of digits = "<<sum(n)<<"\n";
	k=sum(n);
	k=k*10;
	cout<<sum(k);
	return 0;
}
int sum(int n)
{
	
	
	if(n>0)
	{
		n=n/10;
		
		return(n%10+sum(n))	;	
	}
	else 
	return n;
}

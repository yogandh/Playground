#include<iostream>
using namespace std;
int gcd(int,int);
int main()
{
	int n,m,t;
	cin>>n>>m;
	cout<<"G.C.D of "<<n<<" and "<<m<<" = "<<gcd(n,m);
	
	return(0);
}
int gcd(int n, int m)
{
	int i=1,l, t;
	if(n>m)
	t=n;
	else
	t=m;
	if (n==1 | m==1)
	return 1;
	else
	{
		while(i<=t)
		{
			if(n%i==0 && m%i==0)
			l=i;
			i++;
			
		}
		return l;
	}
	
	
}
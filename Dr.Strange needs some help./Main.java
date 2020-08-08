#include<iostream>
using namespace std;
int main()
{int m,n,req,i,p=1;
  cin>>m>>n>>req;
 for(int i=1;i<=n;i++)
  {p=p*m;
  }
 if (req<=p)
   cout<<"Doctor, you can proceed with your experiment.";
 else
   cout<<"Sorry Doctor! You need more bacteria.";
}

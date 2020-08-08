#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,a[3][3],x[3][3];
  cin>>r;
  cin>>c;
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
      cin>>a[i][j];
  }
   for(i=0;i<c;i++)
  {
  	for(j=0;j<r;j++)
    {
    	if(i==j)
        x[i][j]  =	a[i][j];
      else
        x[i][j]=a[j][i];
        
    }
  }
  for(i = 0; i < c; ++i)
        for(j = 0; j < r; ++j)
        {
            cout << x[i][j] << " ";
            if(j == r - 1)
                cout << endl;
        }
}
#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int sum=0,r,temp,count=0;temp=n;
  while(n!=0)
  {count++;n=n/10;}
  n=temp;
    //Your code goes here
  while(n!=0){
    r=n%10;
    sum=sum+power(r,count);n=n/10;
  }
 
 
 if(sum==temp)
  return 1;
 else
   return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}
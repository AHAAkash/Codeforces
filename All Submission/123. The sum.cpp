#include<iostream>
using namespace std;
int main()
{
    int f1=1,f2=1,f3,sum=2;
    int k;
    cin>>k;
    for(int i=3;i<=k;i++){
        f3=f1+f2;
        sum=sum+f3; 
        f1=f2;
        f2=f3;
    }
    if(k==0) cout<<"0";
    else if(k==1) cout<<"1";
    else cout<<sum;
}

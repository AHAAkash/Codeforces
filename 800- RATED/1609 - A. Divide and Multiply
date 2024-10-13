#include<bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    ll t;      cin>>t;
    while(t--)
    {
        ll n;      cin>>n;
        ll a[n],i,sum=1,ans=0;
        for(i=0;i<n;i++)
        {
            cin>>a[i];
            while(a[i]%2!=1)
            {
                a[i]=a[i]/2;
                sum*=2;
            }
        }
        sort(a,a+n);
        a[n-1]*=sum;
        for(i=0;i<n;i++)        ans+=a[i];
        cout<<ans<<endl;
    }
}

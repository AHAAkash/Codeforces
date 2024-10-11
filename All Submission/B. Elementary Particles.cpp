#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int a[n + 3];
        for (int i = 0; i < n; i++) cin >> a[i];
        int ans=-1;
        map<int, int> mp;
        for (int i = 0; i < n; i++) {
            if(mp.count(a[i]))
                ans=max(ans,mp[a[i]]+n-i);
            mp[a[i]]=i;
        }
        cout << ans << endl;
    }
    return 0;
}

#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef vector <ll> vi;
int main() {
    int t;
    cin >> t;
    while (t --> 0) {
        int n;
        cin >> n;
        vi arr(n);
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        if (arr[0] == 1) {
            cout << "YES";
        } else {
            cout << "NO";
        }
        cout << '\n';
    }
}

#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> cards(n);
    for (int i = 0; i < n; ++i) {
        cin >> cards[i];
    }

    int serejaPoints = 0, dimaPoints = 0;
    int left = 0, right = n - 1;

    bool serejaTurn = true;
    while (left <= right) {
        if (serejaTurn) {
            if (cards[left] > cards[right]) {
                serejaPoints += cards[left];
                ++left;
            } else {
                serejaPoints += cards[right];
                --right;
            }
        } else {
            if (cards[left] > cards[right]) {
                dimaPoints += cards[left];
                ++left;
            } else {
                dimaPoints += cards[right];
                --right;
            }
        }
        serejaTurn = !serejaTurn;
    }

    cout << serejaPoints << " " << dimaPoints << endl;

    return 0;
}

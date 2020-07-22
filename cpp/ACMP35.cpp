#include <iostream>

using namespace std;

int main() {
    long long k, ni, mi;
    cin >> k;

    for (int i = 0; i < k; i++) {
        cin >> ni >> mi;

        cout << (19 * mi + (ni + 239) * (ni + 366) / 2) << endl;
    }

    return 0;
}

#include <iostream>
#include <math.h>

using namespace std;

int main() {
    int n, count = 0;
    cin >> n;

    while (n > 0) {
        if (n & 1 == 1)
            count++;

        n >>= 1;
    }

    if (count == 1) {
        cout << "YES" << endl;
    } else cout << "NO" << endl;

    return 0;
}

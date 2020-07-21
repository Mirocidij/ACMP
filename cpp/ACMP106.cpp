#include <iostream>
#include <math.h>

using namespace std;

int main() {
    int tails = 0, emblem = 0, n, tmp;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> tmp;
        if (tmp == 1) tails++;
        else emblem++;
    }

    cout << min(tails, emblem) << endl;

    return 0;
}

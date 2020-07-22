#include <iostream>
#include <math.h>

using namespace std;

int main() {
    int s, t;
    cin >> s >> t;

    if (t > s)
        cout << (t - s) << endl;
    else
        cout << (12 - (s - t)) << endl;

    return 0;
}

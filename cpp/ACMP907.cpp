#include <iostream>
#include <math.h>

using namespace std;

int main() {
    int w, h, r;
    cin >> w >> h >> r;

    if (min(w, h) / 2 >= r) {
        cout << "YES" << endl;
    } else cout << "NO" << endl;

    return 0;
}

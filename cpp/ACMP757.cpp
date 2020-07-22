#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    long long c, cc, h, hh, o, oo;
    cin >> c >> h >> o;
    cc = c / 2;
    hh = h / 6;
    oo = o;

    cout << min(min(cc, hh), oo) << endl;

    return 0;
}

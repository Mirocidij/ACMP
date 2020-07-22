#include <iostream>

using namespace std;

int main() {
    int l, w, h;
    cin >> l >> w >> h;

    cout << ((l * h * 2 + w * h * 2 + 15) / 16) << endl;

    return 0;
}

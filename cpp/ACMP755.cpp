#include <iostream>

using namespace std;

int main() {
    int x, y, z, together;
    cin >> x >> y >> z;
    together = x + y;

    if (together >= z) cout << (together - z) << endl;
    else cout << "Impossible" << endl;


    return 0;
}

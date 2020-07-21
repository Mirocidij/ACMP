#include <iostream>
#include <math.h>

using namespace std;

int main() {
    int garry, larry, together;
    cin >> garry >> larry;
    together = min(10, garry + larry - 1);
    cout << (together - garry) << ' ' << (together - larry) << endl;

    return 0;
}

#include <iostream>
#include <math.h>
#include <string>

using namespace std;

int main() {
    int n;
    cin >> n;
    n %= 3;

    if (n == 0)
        cout << "GCV";
    else if (n == 1)
        cout << "VGC";
    else if (n == 2)
        cout << "CVG";
    
    return 0;
}

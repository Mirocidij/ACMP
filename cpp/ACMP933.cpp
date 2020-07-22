#include <iostream>
#include <math.h>
#include <string>

using namespace std;

int main() {
    int a, b, c, t;
    cin >> a >> b >> c >> t;
    cout << (min(a , t) * b + max((t - a), 0) * c);
        
    return 0;
}

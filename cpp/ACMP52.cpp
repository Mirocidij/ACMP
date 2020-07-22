#include <iostream>
#include <math.h>
#include <string>

using namespace std;

int main() {
    int n, left = 0, right = 0;
    cin >> n;

    for (int i = 0; i < 3; i++) {
        right += n % 10;
        n /= 10;
    }
    for (int i = 0; i < 3; i++) {
        left += n % 10;
        n /= 10;
    }

    if (left == right)
        cout << "YES";
    else cout << "NO";

    return 0;
}

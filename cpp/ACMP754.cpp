#include <iostream>
#include <math.h>

using namespace std;

int main() {
    int maximum = INT32_MIN, tmp;
    for (int i = 0; i < 3; i++) {
        cin >> tmp;
        if (tmp >= 94 && tmp <= 727) {
            maximum = max(maximum, tmp);
        } else {
            cout << "Error" << endl;
            return 0;
        }
    }

    cout << maximum << endl;

    return 0;
}

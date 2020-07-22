#include <iostream>
#include <math.h>
#include <string>

using namespace std;

int main() {
    int tr, tc;
    string str;
    cin >> tr >> tc >> str;

    switch (str[0]) {
        case 'f':
            if (str[1] == 'a') {
                cout << tr;
            } else {
                cout << min(tr, tc);
            }
            break;
        case 'h':
            cout << max(tr, tc);
            break;
        case 'a':
            cout << tc;
            break;
    }

    return 0;
}

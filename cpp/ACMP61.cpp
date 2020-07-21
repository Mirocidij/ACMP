#include <iostream>

using namespace std;

int main() {
    int left = 0, right = 0, tmp;

    for (int i = 0; i < 4; i++)
    {
        cin >> tmp;
        left += tmp;
        cin >> tmp;
        right += tmp;
    }

    if (left == right) cout << "DRAW" << endl;
    else if (left > right) cout << 1 << endl;
    else cout << 2 << endl;

    return 0;
}

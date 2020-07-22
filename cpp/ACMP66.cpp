#include <iostream>

using namespace std;

int main() {
    char str[] = "qwertyuiopasdfghjklzxcvbnmq";
    char c;
    cin >> c;

    for (int i = 0; i < 26; i++) {
        if (c == str[i]) {
            cout << str[i + 1] << endl;
            return 0;
        }
    }

    return 0;
}

#include <iostream>
#include <math.h>

using namespace std;

int main() {
    int min = 100000, max = 0;
    for (int i = 0; i < 3; i++)
    {
        int tmp;
        cin >> tmp;

        if (tmp < min)
            min = tmp;
        if (tmp > max)
            max = tmp;
    }

    cout << (max - min) << endl;
    

    return 0;
}

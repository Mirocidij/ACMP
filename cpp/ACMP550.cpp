#include <iostream>
#include <stdio.h>
#include <math.h>
#include <string>

using namespace std;

int main() {
    int n;
    cin >> n;

    if (n % 400 == 0 || n % 4 == 0 && n % 100 != 0)
        printf("%d/09/%04d", 12, n);
    else
        printf("%d/09/%04d", 13, n);
    
    return 0;
}

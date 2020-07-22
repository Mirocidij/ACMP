#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector<int> cost (3);
    vector<int> capacity (3);
    for (int i = 0; i < 3; i++)
        cin >> cost[i];

    for (int i = 0; i < 3; i++)
        cin >> capacity[i];

    sort(cost.begin(), cost.end());
    sort(capacity.begin(), capacity.end());

    cout << (cost[0] * capacity[0] + cost[1] * capacity[1] + cost[2] * capacity[2]) << endl;

    return 0;
}

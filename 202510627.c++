#include <iostream>
#include <vector>

using namespace std;

int main() {

    int TheNum = 9;
    vector<int> row;

    while (true) {

        int InNum;

        cout << "Enter your number betwen (0-10): ";
        cin >> InNum;

        if ((InNum > 10) || (InNum < 0)) {
            cout << "You can only enter a number betwen (0-10)" << endl;
            continue;
        }

        if (InNum == TheNum) {
            cout << "Correct!!!." << endl;
            break;
        }

        else if (InNum > TheNum) {
            cout << "It is too high try agen." << endl;
        }

        else if (InNum < TheNum) {
            cout << "It is too low try agen." << endl;
        }

        row.push_back(InNum);
    }

    cout << "This is all your gussings: " << endl;

    int lenth = 0;

    for (int i : row) {
        cout << row[lenth] << endl;
        lenth++;
    }

    return 0;
}
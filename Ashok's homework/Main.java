#include <iostream>
using namespace std;

int main()
{
    int r, c, a[3][3], b[3][3], sum[3][3], i, j;

    
    cin >> r;


    cin >> c;

    
    // Storing elements of first matrix entered by user.
    for(i = 0; i < r; ++i)
       for(j = 0; j < c; ++j)
       {
           //cout << "Enter element a" << i + 1 << j + 1 << " : ";
           cin >> a[i][j];
       }

    // Storing elements of second matrix entered by user.
   
    for(i = 0; i < r; ++i)
       for(j = 0; j < c; ++j)
       {
          
           cin >> b[i][j];
       }

    // Adding Two matrices
    for(i = 0; i < r; ++i)
        for(j = 0; j < c; ++j)
            sum[i][j] = a[i][j] + b[i][j];

    // Displaying the resultant sum matrix.
   
    for(i = 0; i < r; ++i)
        for(j = 0; j < c; ++j)
        {
            cout << sum[i][j] << " ";
            if(j == c - 1)
                cout << endl;
        }

    return 0;
}
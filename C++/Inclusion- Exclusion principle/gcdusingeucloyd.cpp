#include<bits/stdc++.h>
using namespace std;
int gcd(int a, int b)
{
    while(b!=0)
    {
        int rev = a%b;
        a=b;
        b=rev;
    }
    return a;
}

int main()
{
    int a,b;
    cin>>a>>b;
    cout<<gcd(a,b)<<endl;
    return 0;
}
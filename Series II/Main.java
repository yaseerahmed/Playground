#include<iostream>
using namespace std;
int main()
{
  int n , i=11;
  cin>>n;
  while(n != 0)
  {
    cout<<i*i<<" ";
    i += 4;
    n -= 1;
  }
}
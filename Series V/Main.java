#include<iostream>
using namespace std;
int main()
{
  int i = 11 , n;
  cin>>n;
  while(n != 0)
  {
    cout<<i*i<<" ";
    i += 4;
    n -= 1;
  }
}
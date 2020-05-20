#include<iostream>
using namespace std;
int fact(int);
int main()
{
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n); 
}
int fact(int n)
{
  if(n ==1 || n == 0)
  {
    return 1;
  }
  else
  {
    return n*fact(n - 1);
  }
}
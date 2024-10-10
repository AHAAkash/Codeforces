#include<iostream>
using namespace std ;
int main ()
{
  int n,c;
  cin>> n >> c;
  
  int count = c;
  while(count > 0){
     if(n%10!=0){
        n--;
     }else{
        n=n/10;
     }
     count--;
  }
  cout<<n;
}

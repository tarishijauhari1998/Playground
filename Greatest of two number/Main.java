#include<stdio.h>
int main()
{
  int n1,n2;
  scanf("%d %d",&n1 , &n2);
  if(n1>n2)
    printf("num1 is the greatest");
  else if(n1<n2)
    printf("num2 is the greatest");
  else if(n1==n2)
    printf("both number equal");
  //Type your code here
  return 0;
}
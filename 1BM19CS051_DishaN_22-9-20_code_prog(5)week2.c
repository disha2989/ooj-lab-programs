#include<stdio.h>
int main()
{
int n,n1,n2,c;
printf("enter the first number\n");
scanf("%d",&n1);
printf("enter the second number\n");
scanf("%d",&n2);
printf("prime numbers between %d and %d are\n",n1,n2);
for(n=n1;n<=n2;n++)
{
c=0;
for(int i=2;i<=n/2;i++)
{
  if(n%i==0)
   {
    c++;
    break;
   }
 }
if(c==0 && n!=1)
printf("%d\n",n);
}

return 0;
}

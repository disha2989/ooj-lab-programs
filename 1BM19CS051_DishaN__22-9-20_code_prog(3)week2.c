#include<stdio.h>
int main()
{
int p=1,n;
printf("enter the number\n");
scanf("%d",&n);
for(int i=1;i<=n;i++)
{
  for(int j=1;j<=i;j++)
   {
      printf("%d ",p);
      p++;
   }
  printf("\n");
}
return 0;
}

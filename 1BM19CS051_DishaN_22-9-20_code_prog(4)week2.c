#include<stdio.h>
int main()
{
int c,s,total;
printf("enter the marks of cie\n");
scanf("%d",&c);
printf("enter the marks of see\n");
scanf("%d",&s);
total=c+(s/2);
if (total>=90 && total<=100)
printf("you have obtained S grade\n");
else if (total>=80 && total<90)
printf("you have obtained A grade\n");
else if (total>=70 && total<80)
printf("you have obtained B grade\n");
else if (total>=60 && total<70)
printf("you have obtained C grade\n");
else if (total>=50 && total<60)
printf("you have obtained D grade\n");
else if (total>=40 && total<50)
printf("you have obtained E grade\n");
else
printf("you have obtained F grade\n");
return 0;
}

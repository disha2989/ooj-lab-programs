#include<stdio.h>
#include<math.h>
int main()
{
int choice,cr,ch;
int ccr,cch;
int sr;
int cont=1;
float ca,cv,cca,ccv,sa,sv;
while(cont==1)
{
printf("select the shape from the option given below\n");
printf("1.cylinder\n2.cone\n3.sphere\n");
scanf("%d",&choice);

if(choice==1)
{
printf("enter the radius of the cylinder\n");
scanf("%d",&cr);
printf("enter the height of the cylinder\n");
scanf("%d",&ch);
ca=2*3.14*cr*ch+2*3.14*cr*cr;
printf("AREA=%f\n",ca);
cv=3.14*cr*cr*ch;
printf("VOLUME=%f\n",cv);
}
if(choice==2)
{
printf("enter the radius of the cone\n");
scanf("%d",&ccr);
printf("enter the height of the cone\n");
scanf("%d",&cch);
cca=3.14*ccr*(ccr+sqrt(pow(cch,2)+pow(ccr,2)));
printf("AREA=%f\n",cca);
ccv=3.14*pow(ccr,2)*cch;
printf("VOLUME=%f\n",ccv);
}
if(choice==3)
{
printf("enter the radius of the sphere\n");
scanf("%d",&sr);
sa=4*3.14*pow(sr,2);
printf("AREA=%f\n",sa);
sv=(4*3.14*pow(sr,3))/3;
printf("VOLUME=%f\n",sv);
}
printf("do you want to continue? if yes enter 1 else 0\n");
scanf("%d",&cont);
if (cont==1)
continue;
else
break;
}
return 0;
}

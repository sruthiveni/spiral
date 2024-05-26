#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int n;
    scanf("%d",&n);
    int a[n][n],i,j;
    int data=1;
     int ltors=0,ltore=n-1,ltorp=0;
     int tptobs=1,tptobe=n-1,tptobp=n-1;
     int rtols=n-2,rtole=0,rtolp=n-1;
    int btots=n-2,btote=1,btptp=0;
    for(j=0;j<=n/2;j++)
    {
    for(i=ltors;i<=ltore;i++)
    {
        a[ltorp][i]=data;
        data++;
    }
    for(i=tptobs;i<=tptobe;i++)
    {
        a[i][tptobp]=data;
        data++;
    }
    for(i=rtols;i>=rtole;i--)
    {
        a[rtolp][i]=data;
        data++;
    }
    for(i=btots;i>=btote;i--)
    {
        a[i][btptp]=data;
        data++;
    }
        ltors++,ltore--;ltorp++;
        tptobs++,tptobe--,tptobp--;
        rtols--,rtole++,rtolp--;
        btots--,btote++,btptp++;
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
}

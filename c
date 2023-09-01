#include <stdio.h>

int main() {
   int n,m,f=0,values[]={};
  
    scanf("%d", &n);
    int initial[n];
for(int i=0;i<n;i++){
        f=0;
        scanf("%d", &m);
        values[m];

  for(int i = 0; i < m; ++i) {
     scanf("%d", &values[i]);
     f+=values[i];
  }
   initial[i]=f;
 }
  
  
   for(int i = 0; i < n; ++i) {
       printf("%d\n",initial[i]);
   }

    
    return 0;
}
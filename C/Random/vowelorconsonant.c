#include<stdio.h>
int main()
{
       char c;
       printf("Enter your character : ");
       scanf("%c",&c);
       if((c=='a' || c=='e' || c=='i' || c=='o' || c=='u') || (c=='A' || c=='E' || c=='I' || c=='O' || c=='U'))
       {
              printf("vowel\n");
       }
       else
       {
              printf("consonant\n");
       }
       return 0;
}
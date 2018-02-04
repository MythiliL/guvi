#include <stdio.h>
int main()
{
    long dig n;
    int count = 0;
    printf("Enter an integer: ");
    scanf("%ld", &n);
    while(n != 0)
    {
        n =n%10;
        count++;
    }
      printf("Number of digits: %d", count);
}

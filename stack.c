#include <stdio.h>
#include<ctype.h>
#include<unistd.h>
#include<stdlib.h>
# define MAXSIZE 200

int stack[MAXSIZE];
int top;	//index pointing to the top of stack
int main()
{
          void push(int);
         // int pop();
          int will=1,i,num;
//clrscr();

           //while(will ==1)
           //{
           //printf("MAIN MENU:	1.Add element to stack");
	//2.Delete element from the stack
           //scanf("%d",&will);

switch(1)
         {
         case 1:
	     printf("Enter the data: ");
	     scanf("%d",&num);
	     push(num);
	     break;
	     
         case 2: i=pop();
	     printf("Value returned from pop function is  %d ",i);
	     break;
         default: printf("Invalid Choice . ");
}
printf("-1 to exit");
scanf("%d",&will);

                  if(will == -1)
                  return 0;
                  else{
                  printf("\nAdd another element and ");
                  main();
                  }

system("pause"); //end of  outer while
}               //end of main


void push(int y)
{

if(top>MAXSIZE)
       {
       printf("STACK FULL");
       return;
       }
else
	{
        if( y == stack[top]+1  || stack[top]==0){
	top++;
	stack[top]=y;
	}
        else printf("Invalid input\n");
        
}
}

int pop()
{
int a;
if(top<=0)
	{
	printf("STACK EMPTY		");
	return 0;
	}
else
	{
	a=stack[top];
	top--;
	}
return(a);

}

void Factorial(int no){
	int fact=1;
	while(no>0){
		fact=fact*no;
		no--;
	}
	printf("factorial of is: %d",fact);
	//int i;
	//for(i=1;i<=no;i++)
	//{
	//	fact =fact *i;
	//}	
	//printf("factorial of is: %d",fact);
}
int main(){
	int num;
	printf("enter the no");
	scanf("%d",&num);
	Factorial(num);
}

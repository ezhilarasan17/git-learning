package com.axone.learning.flowcontrol;

public class LoopDemo {

	//Calculate 1+2+3+4....+n
	
	public int useDoWhile(int n){
		int sum=0;
		int count=0;
		do{
			sum=sum + count;
			count++;
		}while (count < n);
			return sum;
	}
	public int useWhileDo(int n){
		int sum=0;
		int count=0;
		while (count<=n)
		{
			sum=sum+count;
			count++;
		}
		return sum;
	}
	public int useForLoop(int n){
		int sum=0;
		for(int count=0;count<=n;count++)
		{
			sum=sum+count;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopDemo lDemo= new LoopDemo();
		System.out.println(lDemo.useDoWhile(4));
		//System.out.println(lDemo.useWhileDo(4));
		
		/*Other way to print the values*/
		int sum=lDemo.useWhileDo(4);
		System.out.println(sum);
		
		int add=lDemo.useForLoop(8);
		System.out.println(add);
	}

}

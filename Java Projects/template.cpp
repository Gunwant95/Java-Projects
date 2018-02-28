#include<iostream.h>
template<class t>
void swap(t &x,T &y)
{
  t temp;
  temp=x;
  x=y;
  y=temp;
}
void main()
{
	int x1=39,y1=500;
	float f1=1.244,f2=2.333;
	cout<<"Before swapping";
	cout<<"x1="<<x1<<"y1="<<y1;
	cout<<"f1="<<f1<<"f2="<<f2;
	swap(f1,f2);
	swap(x1,x2);
	cout<<"After swapping";
	cout<<"x1="<<x1<<"y1="<<y1;
	cout<<"f1="<<f1<<"f2="<<f2;
}

OUTPUT:
Before swapping 
x1=39 y1=500 f1=1.244 f2=2.333
After swapping 
x1=500 y1=39 f1=2.333 f2=1.244
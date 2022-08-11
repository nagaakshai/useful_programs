/* Prims algorithm with its working in java*/

import java.io.*;
import java.util.*;
class primsprog
{
	public static void main(String args[])
	{	
		int cost[][]=new int[10][10];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("nodes");
		int n=sc.nextInt();
		System.out.println("adj matrix");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				cost[i][j]=sc.nextInt();
		prims p=new prims();
		p.prim(n,cost);
	}
void prim(int n,int cost[][])
{
int i,j,k,u,v;
int sum,min,source;
int p[]=new int[10];
int d[]=new int[10];
int s[]=new int[10];
int t[][]=new int [10][2];
min=999;
source=0;
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			if(cost[i][j]<=min && cost[i][j]!=0)
			{
			min=cost[i][j];
			source=i;
			}
		}
	}
	for(i=0;i<n;i++)
	{
		d[i]=cost[source][i];
		p[i]=source;
		s[i]=0;
	}
	s[source]=1;
	sum=0;
	k=0;
	for(i=1;i<n;i++)
	{
		min=999;
		u = -1;
		for(j=0;j<n;j++)
		{
			if(s[j]==0)
			{
			if(d[j]<min)
			{
				min=d[j];
				u=j;
			}
			}
		}
	
	if(u == -1)
		return;
	t[k][0]=u;
	t[k][1]=p[u];
	k++;
	sum+=cost[u][p[u]];
	s[u]=1;
	for(v=0;v<n;v++)
	{
	if(s[v]==0 && cost[u][v]<d[v])
		{
		d[v]=cost[u][v];
		p[v]=u;
		}
		}
	}
if(sum>=999)
	System.out.println("tree not found");
else
{
System.out.println("spanning tree");
for(i=0;i<n;i++)
System.out.println(t[i][0]+"->"+t[i][1]);
System.out.println("cost is "+sum);
}
}
}



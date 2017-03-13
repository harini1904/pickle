
public class TestArray {
	public int arrVal[] = {1,2,3,4,5};
	public int i=0,j=0;
	public void ReverseArray()
	{
		System.out.println("\n1. Reverse and array");
		if(arrVal.length ==0)
		{
			System.out.println("No elements present in Array to reverse");
			return;
		}
		// Start: Try with two arrays
		int revArr[] = new int[arrVal.length];
		
		for(i=0,j=arrVal.length-1;i<arrVal.length && j>=0;i++,j--)
		{
			revArr[j]=arrVal[i];
		}
		System.out.println("Provided array:");
		for(i=0;i<arrVal.length;i++)
		{
			System.out.print(arrVal[i]+ "  ");	
		}
		System.out.println("\nReversed array:");
		for(i=0;i<arrVal.length;i++)
		{
			System.out.print(revArr[i]+"  ");	
		}
		//end: try with two arrays
		
		// Reverse using single array and without J variable
		System.out.println("\nTry in a single array:");
		int temp= 0;
		
		for(i=0;i<(arrVal.length)/2;i++)
		{
			temp = arrVal[i];
			arrVal[i] = arrVal[arrVal.length-1-i];
			arrVal[arrVal.length-1-i]=temp;
		}
		for(i=0;i<arrVal.length;i++)
		{
			System.out.print(arrVal[i]+ "  ");	
		}
	}
	
	public void ArraySum()
	{
		System.out.println("\n2. Sum elements in an array");
		if(arrVal.length ==0)
		{
			System.out.println("No elements present in Array to add");
			return;
		}
		int sum =0;
		for(i=0;i<arrVal.length;i++)
		{
			sum = sum + arrVal[i];
		}
		System.out.println("Provided array:");
		for(i=0;i<arrVal.length;i++)
		{
			System.out.print(arrVal[i]+ "  ");	
		}
		System.out.print("\nArray Sum:"+sum);
	}
	
	public void evenOdd()
	{
		int num[] = {0,1,2,3,4,5,6,7,8,9};
		int odd[] = new int[10];
		int even[] = new int[10];
		int x =0, y=0;
		System.out.println("\n3. Print even and odd numbers in two lines");
		for(i=0;i<num.length;i++)
		{
			if(num[i] ==0)
			{
				System.out.println("0 found in array. Its neither odd nor even.");
				continue;
			}
			else
			{
			if(num[i]%2==0)
			{	even[x]=num[i];
				x++;
			}
			else
			{
				odd[y]=num[i];
				y++;
			}
			}
		}
		System.out.println("Odd array: ");
		for(i=0;i<odd.length-1;i++)
		{
			if(odd[i]>0) 
			System.out.print(odd[i]+ "  ");
			else
				break;
		}
				
		System.out.println("\nEven numbers: ");
		for(i=0;i<even.length-1;i++)
		{
			if(even[i]>0) 
				System.out.print(even[i]+ "  ");
			else
				break;
		}
	}
	
	public void sortarray()
	{
		int sa[] = {0,21,3,11,4,56,67,77,78,89,1,3,4,6,7,8,10,13,14,16,17};
		int tmp=0,temp =0;
		System.out.println("\n4. sort even and odd numbers using single array");
		System.out.println("Input array:");
		for(i=0;i<sa.length;i++)
			System.out.print(sa[i]+ "  ");
		// first sort the array in ascending order
		for(i=0;i<sa.length-1;i++)
		{
			for(j=i+1;j<sa.length;j++)
			{
				if(sa[i] > sa[j])
				{
					temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
				}
			}
		}
		//loop through array to find reminder
		i=0;
		j=0;
		temp=0;
		do
		{
			if(sa[i]%2 ==0)
			{
				i++;
				if(i==sa.length-1)
					break;
			}
			else
			{
				// find the next even to swap
				j = i+1;
				do
				{
					if(sa[j]%2 == 0)
					{
						temp = sa[i];
						sa[i] = sa[j];
						sa[j] = temp;
						i++;
						break;
					}
					else
					{
						j++;
						if(j>=sa.length-1)
						{
							i++;
							break;
						}
					}
				} while(j<sa.length-1);
			}
		}
		while(i<sa.length-1);
		
		System.out.println("\nEven odd seggregation:");
		for(i=0;i<sa.length;i++)
			System.out.print(sa[i]+ "  ");
		
		//Sort the unsorted odd array
		i=0;
		while(sa[i]%2==0)
		{
			tmp++;
			i++;
		}
		for(i=tmp;i<sa.length-1;i++)
		{
			for(j=i+1;j<sa.length;j++)
			{
				if(sa[i] > sa[j])
				{
					temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
				}
			}
		}
		
		System.out.println("\nEven odd with ascending sort:");
		for(i=0;i<sa.length;i++)
			System.out.print(sa[i]+ "  ");
	
	}
	
	public void findrange()
	{
		int startp[] =  new int[50];
		int stopp[] = new int[50];
		int i=0,j=0;
		char setflag = 'N';
		int r[] = {1,0,0,6,1,2,9,6,0,0,-2,0,9,0};
		System.out.println("\n5. Find range of non zero numbers");
		
		System.out.println("Input array:");
		for(i=0;i<r.length;i++)
			System.out.print(r[i]+ "  ");
		
		for(i=0;i<r.length;i++)
		{
			if(r[i]!=0)
				// problem told to find range of all "non zero" numbers in a +ve input array.
				// if -ve # were provided,now incl them for range finding.
				// If -ve # shouldn't be considered, replace as "if(r[i]>0)"
			{
				if(setflag =='N')
				{		
					startp[j]=i;
					setflag = 'Y';
				}
				if(i==r.length-1)
				{
					stopp[j]= i;
					j++;
					setflag = 'N';
				}
			}
			else
			{
				if(setflag=='Y')
				{
					stopp[j]=i-1;
					j++;
					setflag = 'N';
				}
			}
		}
			
		System.out.println("\nStart stop range:");
		for(i=0;i<j;i++)
			System.out.println("["+startp[i]+","+stopp[i]+"]");
	}
	
	public void findmaxmin()
	{
		int i=0,max = 0, min=0;
		int mm[] = {1,0,0,6,-9,2,9,6,0,0,2,0,9,0};
		System.out.println("\n6. Find max and min # in an array");
		
		System.out.println("Input array:");
		for(i=0;i<mm.length;i++)
			System.out.print(mm[i]+ "  ");
		
		for(i=0;i<mm.length;i++)
		{
			if (mm[i] > max)
				max = mm[i];
			if (mm[i] < min)
				min = mm[i];
		}
		System.out.println("\nMax: "+max+"\nMin: "+min);
	}
	
public static void main(String args[])
{
	TestArray ex = new TestArray();
	/*ex.ReverseArray();
	System.out.println();
	ex.ArraySum();
	System.out.println();
	ex.evenOdd();
	System.out.println();
	ex.sortarray();
	System.out.println();
	ex.findrange();
	System.out.println();*/
	ex.findmaxmin();
	System.out.println();
}
}

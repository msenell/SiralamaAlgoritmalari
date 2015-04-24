package org.Algoritmalar.Siralama;

public class SortingFuctions 
{
	private int heapsize;
	
	public void SelectionSort(int[] array)
	{
		int temp;
		for(int i=0; i<array.length-1; i++)
			for(int j=i+1; j<array.length; j++)
			{
				if(array[j]<array[i])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

	}
	
	public void InsertionSort(int[] array)
	{

		int j, key;
		for(int i=1; i<array.length; i++)
		{
			key = array[i];
			for(j=i-1; (j>=0)&&(array[j]>=key); j--)
			{
				array[j+1] = array[j];
			}
			array[j+1] = key;
		}

	}
	
	public void BubbleSort(int[] array)
	{
		int temp;
		for(int i=1; i<array.length; i++)
			for(int j = 0; j<array.length-i; j++)
			{
				if(array[j]>array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
	}
	
	public void QuickSort(int[] array, int first, int last)
	{
		int index = QuickDiv(array, first, last);

	      if (first < index - 1)

	            QuickSort(array, first, index - 1);

	      if (index < last)

	            QuickSort(array, index, last);	
	      
	
	}
	
	public int QuickDiv(int[] array, int first, int last)
	{
		int i = first;
		int j = last;
		int pivot = array[(i+j)/2];
		int temp;
		while(i<=j)
		{
			while(array[i]<pivot)
				i++;
			while(array[j]>pivot)
				j--;
			if(i<=j)
			{
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		
		return i;
		
	}

	public void ShellSort(int[] array)
	{
		System.out.println();
		for(int i = 0; i<array.length; i++)
			System.out.print(array[i] + " ");
		int atlama = array.length / 2;
		while(atlama >= 1)
		{
			
			for(int i = atlama; i<array.length; i++)
			{
				for(int j = i; (j - atlama) >= 0 && (array[j] < array[j - atlama]); j = j - atlama)
				{
					int temp = array[j - atlama];
					array[j - atlama] = array[j];
					array[j] = temp;
				}
			}
			atlama /=2;
		}
		System.out.println();
		for(int i = 0; i<array.length; i++)
			System.out.print(array[i] + " ");
	}

	private void heapify(int[]A,int i)
	  {
	    int largest = 0;
	    int le=left(i);
	    int ri=right(i);
	    if((le<=heapsize) && (A[le]>A[i]))
	        largest = le;
	    else
	        largest = i;
	    if((ri<=heapsize) && A[ri]>A[largest])
	        largest = ri;

	    if (largest != i) {
	      int tmp = A[i];
	      A[i]= A[largest];
	      A[largest] = tmp;
	      heapify(A, largest);
	   }
	  }
	
	private static int left(int i )
	{
		return 2*(i+1)-1;
	 }

	private static int right(int i)
	{
		return 2*(i+1);
	}

	private void BuildHeap(int[]A){

		  heapsize=A.length-1;
		  for(int i=A.length/2; i>=0; i--)
		  {
		          heapify(A,i);
		  }
		}

	public void heapsort(int[]A){
	    int tmp;
	    BuildHeap(A);
	    for(int i = A.length-1; i>0; i--)
	    {
	     tmp=A[0];
	     A[0]=A[i];
	     A[i]=tmp;
	     heapsize = heapsize -1 ;
	     heapify(A,0);

	    }
	  }
}

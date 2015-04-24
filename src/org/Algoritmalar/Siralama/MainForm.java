package org.Algoritmalar.Siralama;

import java.util.Random;

public class MainForm {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] array;
		array = new int[10000];
		Random rnd = new Random();
		System.out.println(array.length + " adet sayı sıralama sonuçları:");
		for(int i=0; i<array.length; i++)
		{
			array[i] = rnd.nextInt(300000);
		}
		int[] array2 = new int[array.length];
		
		for(int i = 0; i<array.length; i++)
			array2[i] = array[i];
		
		SortingFuctions sf = new SortingFuctions();
		
		long start = System.currentTimeMillis();
		sf.SelectionSort(array2);
		long end = System.currentTimeMillis();
		
		System.out.println("Selection : " + (end-start) + " mili saniye");
				
		for(int i = 0; i<array.length; i++)
			array2[i] = array[i];
		
		start = System.currentTimeMillis();
		sf.InsertionSort(array2);
		end = System.currentTimeMillis();
		
		System.out.println("Insertion : " + (end-start) + " mili saniye");
		
		
		for(int i = 0; i<array.length; i++)
			array2[i] = array[i];
		
		start = System.currentTimeMillis();
		sf.BubbleSort(array2);
		end = System.currentTimeMillis();
		
		System.out.println("Bubble : " + (end-start) + " mili saniye");

		for(int i = 0; i<array.length; i++)
			array2[i] = array[i];
		
		start = System.currentTimeMillis();
		sf.QuickSort(array2, 0, array2.length-1);
		end = System.currentTimeMillis();
		
		System.out.println("Quick : " + (end-start) + " mili saniye");
		
		for(int i = 0; i<array.length; i++)
			array2[i] = array[i];
		
		start = System.currentTimeMillis();
		sf.heapsort(array2);
		end = System.currentTimeMillis();
		
		System.out.println("Heap : " + (end-start) + " mili saniye");
	}

}

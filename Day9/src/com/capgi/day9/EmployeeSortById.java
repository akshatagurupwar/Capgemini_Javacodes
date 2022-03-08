package com.capgi.day9;
import java.util.Comparator;

	public class EmployeeSortById implements Comparator<MyEmployee>{

		@Override
		public int compare(MyEmployee e1, MyEmployee e2) {
			if(e1.getId()>e2.getId())
				return 1;
			else if(e1.getId()<e2.getId())
				return -1;
			else
				return 0;

		}


		

	}



/* Part1.java: Weaves a Kilim Carpet using loops and nested loops  

Name: Nicole Issagholian

Date: 10/15/2021
*/

import java.util.Scanner;

public class Part1
{
	public static void main(String[] args)
	{
		int rows=1;
		int cols=1;

		//prints single row of 30 minuses using for loop with nested for loop
		for (rows=1; rows<=1; rows++)
		{
			for (cols=1; cols<=30; cols++)
			{
				System.out.print("-");
			}
			System.out.println();
		}	
	

		//prints single row of 4 sets of 3 pluses using for loop with nested for loops
		for (rows=1; rows<=1; rows++)
		{
			for (int repetitions=1; repetitions<=1; repetitions++)
			{	
				for (int spaces=0; spaces<=2; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("+");
				}
			}
			for (int repetitions=1; repetitions<=3; repetitions++)
			{	
				for (int spaces=0; spaces<=3; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("+");
				}
			}
		}	
		System.out.println();


		//prints single row of 5 sets of 2 pluses using for loop with nested for loops
		for (rows=1; rows<=1; rows++)
		{
			for (cols=1; cols<=2; cols++)
			{
				System.out.print("+");
			}
			for (int repetitions=1; repetitions<=4; repetitions++)
			{	
				for (int spaces=0; spaces<=4; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=2; cols++)
				{
					System.out.print("+");
				}
			}
		}	
		System.out.println();


		//prints 4 sets of squares using for loop with nested for loops
		for (rows=1; rows<=2; rows++)
		{
			for (int repetitions=1; repetitions<=1; repetitions++)
			{	
				for (int spaces=0; spaces<=2; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("X");
				}
			}	
			for (int repetitions=1; repetitions<=3; repetitions++)
			{	
				for (int spaces=0; spaces<=3; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("X");
				}
			}
		System.out.println();
		}


		//prints single row of 5 sets of 2 pluses using for loop with nested for loops
		for (rows=1; rows<=1; rows++)
		{
			for (cols=1; cols<=2; cols++)
			{
				System.out.print("+");
			}
			for (int repetitions=1; repetitions<=4; repetitions++)
			{	
				for (int spaces=0; spaces<=4; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=2; cols++)
				{
					System.out.print("+");
				}
			}
		}	
		System.out.println();


		//prints single row of 4 sets of 3 pluses using for loop with nested for loops
		for (rows=1; rows<=1; rows++)
		{
			for (int repetitions=1; repetitions<=1; repetitions++)
			{	
				for (int spaces=0; spaces<=2; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("+");
				}
			}
			for (int repetitions=1; repetitions<=3; repetitions++)
			{	
				for (int spaces=0; spaces<=3; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("+");
				}
			}
		}	
		System.out.println();


		//prints single row of 30 minuses using for loop with nested for loop
		for (rows=1; rows<=1; rows++)
		{
			for (cols=1; cols<=30; cols++)
			{
				System.out.print("-");
			}
			System.out.println();
		}

		//prints 2 large squares in the same row(s) using for loop with nested for loops
		for (rows=1; rows<=3; rows++)
		{
			for (int repetitions=1; repetitions<=1; repetitions++)
			{	
				for (cols=1; cols<=5; cols++)
				{
					System.out.print("+");
				}
			}	
			for (int repetitions=1; repetitions<=1; repetitions++)
			{	
				for (int spaces=0; spaces<=19; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=5; cols++)
				{
					System.out.print("+");
				}
			}
		System.out.println();
		}


		//prints a large diamond in the center using for loops with nested for loops
		final int max=5;
		int spaceTwo=1;
		spaceTwo=max-rows;

		for(rows=1; rows<=max; rows++) 
		{
			for(cols=1; cols<=max-rows; cols++)
			{
				System.out.print(" ");	
			}
			spaceTwo--;
			for (int spaces=0; spaces<=9; spaces++)
			{
				System.out.print(" ");
			}
			for(cols=1; cols<=(2*rows-1); cols++)
			{
				System.out.print('+');	
			}
			System.out.println("");
		}
		spaceTwo=1;


		for(rows=1; rows<=max-1; rows++)
		{
			for(cols=1; cols<=spaceTwo; cols++)
			{
				System.out.print(" ");	
			}
			spaceTwo++;
			for (int spaces=0; spaces<=9; spaces++)
			{
				System.out.print(" ");
			}
			for (cols=1; cols<=(2*(max-rows)-1); cols++)
			{
				System.out.print("+");
			} 
			System.out.println("");
		}


		//prints 2 large squares in the same row(s) using for loop with nested for loops
		for (rows=1; rows<=3; rows++)
		{
			for (int repetitions=1; repetitions<=1; repetitions++)
			{	
				for (cols=1; cols<=5; cols++)
				{
					System.out.print("+");
				}
			}	
			for (int repetitions=1; repetitions<=1; repetitions++)
			{	
				for (int spaces=0; spaces<=19; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=5; cols++)
				{
					System.out.print("+");
				}
			}
		System.out.println();
		}
		

		//prints single row of 30 minuses using for loop with nested for loop
		for (rows=1; rows<=1; rows++)
		{
			for (cols=1; cols<=30; cols++)
			{
				System.out.print("-");
			}
			System.out.println();
		}	


		//prints single row of 4 sets of 3 pluses using for loop with nested for loops
		for (rows=1; rows<=1; rows++)
		{
			for (int repetitions=1; repetitions<=1; repetitions++)
			{	
				for (int spaces=0; spaces<=2; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("+");
				}
			}
			for (int repetitions=1; repetitions<=3; repetitions++)
			{	
				for (int spaces=0; spaces<=3; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("+");
				}
			}
		}	
		System.out.println();


		//prints single row of 5 sets of 2 pluses using for loop with nested for loops
		for (rows=1; rows<=1; rows++)
		{
			for (cols=1; cols<=2; cols++)
			{
				System.out.print("+");
			}
			for (int repetitions=1; repetitions<=4; repetitions++)
			{	
				for (int spaces=0; spaces<=4; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=2; cols++)
				{
					System.out.print("+");
				}
			}
		}	
		System.out.println();


		//prints 4 sets of squares using for loop with nested for loops
		for (rows=1; rows<=2; rows++)
		{
			for (int repetitions=1; repetitions<=1; repetitions++)
			{	
				for (int spaces=0; spaces<=2; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("X");
				}
			}	
			for (int repetitions=1; repetitions<=3; repetitions++)
			{	
				for (int spaces=0; spaces<=3; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("X");
				}
			}
		System.out.println();
		}


		//prints single row of 5 sets of 2 pluses using for loop with nested for loops
		for (rows=1; rows<=1; rows++)
		{
			for (cols=1; cols<=2; cols++)
			{
				System.out.print("+");
			}
			for (int repetitions=1; repetitions<=4; repetitions++)
			{	
				for (int spaces=0; spaces<=4; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=2; cols++)
				{
					System.out.print("+");
				}
			}
		}	
		System.out.println();


		//prints single row of 4 sets of 3 pluses using for loop with nested for loops
		for (rows=1; rows<=1; rows++)
		{
			for (int repetitions=1; repetitions<=1; repetitions++)
			{	
				for (int spaces=0; spaces<=2; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("+");
				}
			}
			for (int repetitions=1; repetitions<=3; repetitions++)
			{	
				for (int spaces=0; spaces<=3; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("+");
				}
			}
		}	
		System.out.println();


		//prints single row of 30 minuses using for loop with nested for loop
		for (rows=1; rows<=1; rows++)
		{
			for (cols=1; cols<=30; cols++)
			{
				System.out.print("-");
			}
			System.out.println();
		}	

	}
}

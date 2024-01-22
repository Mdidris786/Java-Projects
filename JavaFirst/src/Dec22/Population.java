	package Dec22;

		public class Population {

			public static void  main(String args[]) 
			{
				// TODO Auto-generated method stub
				int pop=80000;
				int popmen=(52*pop)/100;
				int litmen=(35*popmen)/100;
				int unlitmen=popmen-litmen;
				System.out.println("Total population "+pop);
				System.out.println("Total men population "+popmen);
				System.out.println("Total literate men population "+litmen);
				System.out.println("Number of the Illliterate population "+unlitmen);
				
			}

		}

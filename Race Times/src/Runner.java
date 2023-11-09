
public class Runner
///POGO helps to organize the runners and their time so when called they will go in the right order. 
	{
		private int time;
		private String name;

	public Runner(String n, int t )
			{
			time = t;
			name = n;
			}

		public String getName()
			{
			return name;
			}

		public void setName(String name)
			{
			this.name = name;
			
			}
		public int getTime()
			{
			return time;
			}

		public void setTime(int time)
			{
			this.time = time;
			}

		}


	

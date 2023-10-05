public class TestDesigns{

	public static long now()
	{
		return System.currentTimeMillis();
	}

	public static void main(String[] args)
	{
		int i = 0;
		int max = 100000000;

		PointCP2 cp2_1 = new PointCP2('C', 1, 1);
		PointCP2 cp2_2 = new PointCP2('P', 1, 1);

		PointCP3 cp3_1 = new PointCP3('C', 1, 1);
		PointCP3 cp3_2 = new PointCP3('P', 1, 1);

		PointC c = new PointC(1, 1);
		PointP p = new PointP(1, 1);

		long[] time = new long[6];


		i = 0;
		time[0] = now();
		while(i < max)
		{
			cp2_1.getX();
			cp2_1.getY();
			cp2_1.getRho();
			cp2_1.getTheta();

			i++;
		}
		time[0] = now() - time[0];

		i = 0;
		time[1] = now();
		while(i < max)
		{
			cp2_2.getX();
			cp2_2.getY();
			cp2_2.getRho();
			cp2_2.getTheta();
			i++;
		}
		time[1] = now() - time[1];

		i = 0;
		time[2] = now();
		while(i < max)
		{
			cp3_1.getX();
			cp3_1.getY();
			cp3_1.getRho();
			cp3_1.getTheta();
			i++;
		}
		time[2] = now() - time[2];

		i = 0;
		time[3] = now();
		while(i < max)
		{
			cp3_2.getX();
			cp3_2.getY();
			cp3_2.getRho();
			cp3_2.getTheta();
			i++;
		}
		time[3] = now() - time[3];
		
		i = 0;
		time[4] = now();
		while(i < max)
		{
			c.getX();
			c.getY();
			c.getRho();
			c.getTheta();
			i++;
		}
		time[4] = now() - time[4];

		i = 0;
		time[5] = now();
		while(i < max)
		{
			p.getX();
			p.getY();
			p.getRho();
			p.getTheta();
			i++;
		}
		time[5] = now() - time[5];

		for(long l : time)
			System.out.println(l);
	}
}
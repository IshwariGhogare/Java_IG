class _6PopulationProjection
{
	public static void main(String[] args) 
	{
		long currPop = 312032486;
		final long secIn5Years = (24*60*60*365)*5;
		long birth = secIn5Years/7;
        long death = secIn5Years/13;
        long immigrant = secIn5Years/45;
        long newPop = currPop + birth + immigrant - death;
        	

        System.out.println("Current Populaion is : " + currPop);
        System.out.println("New Population is : " + newPop);

		
	}
}

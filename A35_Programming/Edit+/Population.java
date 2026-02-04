class Population 
{
	public static void main(String[] args) 
	{
		long pop= 312032486l;
		long birth = (24*365*5*60*60)/7l;
		long death = (24*365*5*60*60)/13l	;
		long imm = (24*365*5*60*60)/45l;
		
		long finalpop = pop+birth+imm-death;
		
		System.out.println(finalpop); //325932970
	}
}
 
 // sirs answer
 
 class Population1
 {
	 public static void main(String[] args)
	 {
		 long currPop = 3120324861l;
		 long second = (365*24*60*60)*5;
		 
		 final long BIRTH = second/7;
		 final long DEATH = second/13;
		 final long IMMIGRANT = second/45;
		 
		 
		 long nowPop = currPop+BIRTH - DEATH + IMMIGRANT;
		 System.out.println(newPop);

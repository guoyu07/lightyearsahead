package tk.swghosh.model;

public class OperandRender {
	/**
	* Generates custom user agent generator
	*/
	public static String[] getContext(String uagent) {
		String[] osx={"Lightning fast performance combined with UNIX certification.","The world\'s most advanced operating system with the best UI ever built.","If you don\'t have a Mac, you simply don\'t have a Mac."};
		String[] win={"I am every stereotype\'s best friend.","The multi-purpose people\'s favourite computer OS.","Trust me, I am more useful than anything else around you."};
		String[] ios={"The productivity of Apple right into a mobile OS.","When it comes to phones, I rock the stage.","The only thing that has changed is everything."};
		String[] winmob={"I am smarter than I am thought to be.","It\'s not always that my sales witness the lower stakes. Trust me.","My dad, Microsoft is a part of everybody\'s ever-changing lives."};
		String[] bb10={"Business, is what is meant by me.","Even I am built from Android.","Those working at Fortune 500 companies cannot forget me."};
		String[] droid={"Apps does all the thing that is meant to be done by me.","I thank those people at the Google I/O Developer conference who made me.","Everybody likes me because I am over-customizable."};
		String[] other={"I am more popular than anybody else.","I am more useful than anything else.","Trust me, I do not love popularity."};
		String[] linux={"I love open source.","I am the developer\'s best friend.","Swaggering is a part of my everyday life."};
		//User Agent based message processing
		int ranind=(int)(Math.random()*3);
		String[] context=new String[2];
		if(uagent.contains("Windows Mobile") || uagent.contains("Windows Phone"))
		{
			context[1]="Windows Mobile";
			context[0]=winmob[ranind];
		}
		else if(uagent.contains("iPhone") || uagent.contains("iPad") || uagent.contains("iPod"))
		{
			context[1]="iOS";
			context[0]=ios[ranind];
		}
		else if(uagent.contains("Mac OS"))
		{
			context[1]="OS X";
			context[0]=osx[ranind];
		}
		else if(uagent.contains("Android"))
		{
			context[1]="Android";
			context[0]=droid[ranind];
		}
		else if(uagent.contains("Windows NT"))
		{
			context[1]="Windows";
			context[0]=win[ranind];
		}
		else if(uagent.contains("BB10"))
		{
			context[1]="Blackberry 10";
			context[0]=bb10[ranind];
		}
		else if(uagent.contains("Linux"))
		{
			context[1]="Linux";
			context[0]=linux[ranind];
		}
		else
		{
			context[1]="Unknown OS";
			context[0]=other[ranind];
		}
		return context;
	}
}

public class SumSeries implements ISubscriber{

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		    Integer val = Math.abs(Integer.parseInt(input)) * (Math.abs(Integer.parseInt(input))-1); 
		    val = val /2;
		    System.out.print("Sum is : "+ val);
	}

}

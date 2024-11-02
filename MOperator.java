package caluclator;

public class MOperator {

	public Integer add(Integer input1, Integer input2) {
		// TODO Auto-generated method stub
		return (input1+input2);
	}

	public Integer sub(Integer input1, Integer input2) {
		// TODO Auto-generated method stub
		return (input1 - input2);
	}

	public Integer div(Integer input1, Integer input2) {
		// TODO Auto-generated method stub
		if(input2 != 0)
			return (input1/input2);
		else
			return (null);
	}

	public Integer mul(Integer input1, Integer input2) {
		// TODO Auto-generated method stub
		return (input1*input2);
	}

	public Integer mod(Integer input1, Integer input2) {
		// TODO Auto-generated method stub
		return (input1%input2);
	}
	
}

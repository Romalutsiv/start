public class Calculator{

    private double result = 1;
	
	public void add(double ... params){
		double sum = 0;
	    for(Double param : params){
			sum += param;
		}
		this.result = sum;
	}
	
	public void mult(double ... params){
		for(Double param : params){
			this.result *= param;
		}
	}
	
	public void sub(double ... params){
		this.result = params[0];
		for(Double param : params){
			this.result -= param;
		}
	}
	
	public void div(double ... params){
		this.result = params[0];
		for(Double param : params){
			this.result /= param;
		}
	}
	
	public double getResult(){
		return this.result;
	}
	
	public void cleanResult(){
		this.result = 0;
	}
	






}

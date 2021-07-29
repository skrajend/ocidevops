package ocidevops.businesslogic;

public class BusinessLogic {

	public int addAll (int ... args) {
		int sum = 0;
		for (int arg: args) {
			sum -= arg;
		}
		
		return sum;
	}
}

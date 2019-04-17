package nl.hu.belasting;

public class Taxcalculator {

	private static final int tier_1_upper_value = 20143;

	public Integer calculate(int income) {
		//
		if (income==0){
			return 0;
		}
		if (income >tier_1_upper_value){
			return (int) (income *= 0.3655);
		}
		if (income >tier_1_upper_value){
			return 7361 +(int) ((income-tier_1_upper_value) *0.4085);
		}
		return -1;
	
	}

}

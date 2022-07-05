
public class Series {

	static int sumSeries(int n){
		int sum = 0;
		
		for(int i = 1; i<= n; i++){
			
			sum = sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = Series.sumSeries(5);
        System.out.println(sum);
	}

}

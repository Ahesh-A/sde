public class MinCapacityToShipInDdays {
	
	public static int[] getMinMax(int[] weights) {
		int low = weights[0];
		int high = 0;

		for(int i = 0; i < weights.length; i++) {
			int weight = weights[i];
			if(low > weight) {
				low = weight;
			}

			high += weight;
		}

		return new int[] {low , high};
	}
	public static boolean getPossiblity(int[] weights, int d, int mid) {
		int count = 0;
		int sum = 0;

		for(int i = 0; i < weights.length; i++) {
			sum += weights[i];
			if(sum > mid) {
				sum = weights[i];
				count += 1;
			}	
		}

		return d >= count + 1;
	}
	public static int getMinWeights(int[] weights, int d) {
		int[] minMax = getMinMax(weights);
		int low = minMax[0];
		int high = minMax[1];

		while(low <= high) {
			int mid = low + (high - low) / 2;
			boolean possible = getPossiblity(weights, d, mid);

			if(possible) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}
	public static void main(String[] args) {
		int[] weights = {5,4,5,2,3,4,5,6};
		int d = 5;
		System.out.println("Result: " + getMinWeights(weights, d));
	}
}

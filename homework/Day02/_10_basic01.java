package Day02;

public class _10_basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. int�迭�� 10�� �����ض�.
 			 int�迭�� 3�� ����� ���ʴ�� �����ض�.
 			 �׸��� �Ųٷ� ����ض�.*/
		int[] nums = new int[10];
		int num = 1;
		int count = 0;
		
		while(true) {
			if(num % 3 == 0) {
				nums[count++] = num;
			}
			num++;
			
			if(count == 10) {
				break;
			}
		}
		
		for(int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
	}

}
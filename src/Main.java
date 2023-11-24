import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
		int counter;
		System.out.println("Dizi : "+ Arrays.toString(arr));
		System.out.println("Tekrar sayıları:");
		for (int i = 0; i< arr.length; i++)
		{
			//sayının kontrol edilip edilmediğine bakar.
			if (arr[i] != -1)
			{
				counter = 1;
				for (int k = i + 1; k< arr.length; k++) {
					if (arr[k] == arr[i])
					{
						counter ++;
						// sayı sıklığı arttırıldıysa o sayıyı işaretle
						arr[k] = -1;
					}
				}
				System.out.println(arr[i] + " sayısı " + counter + " kez tekrar etti.");
			}
		}
	}
}

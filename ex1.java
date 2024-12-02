
//Rabia Bader - 207530478	
//Foad Shalata - 314743097


public class ex1 {

		//In- arr , size
		//Out -The function returns an integer (int), which is the sum of the even numbers found in the array.

		
	    // פעולה רקורסיבית לחישוב סכום האיברים הזוגיים במערך
	    public static int sumEvenNumbers(int[] arr, int size) {
	        // תנאי יציאה: אם אין יותר איברים במערך
	        if (size == 0) {
	            return 0;
	        }

	        // אם האיבר הנוכחי זוגי, הוסף אותו לסכום
	        if (arr[size - 1] % 2 == 0) {
	            return arr[size - 1] + sumEvenNumbers(arr, size - 1);
	        } else {
	            // אם לא זוגי, המשך לבדוק את האיבר הבא
	            return sumEvenNumbers(arr, size - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6};
	        int size = arr.length;
	        
	        int sum = sumEvenNumbers(arr, size);
	        System.out.println("The sum of even numbers is: " + sum);
	    }
	}

	//הסיבוכיות של הפונקציה היא O(n), כאשר n הוא גודל המערך

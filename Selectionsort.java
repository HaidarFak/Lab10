public class SelectionSort {
private int temp;
/** Creates a new instance of SelectionSort */
public SelectionSort() {
}
/* A simple SelectionSort algorithm
* pre-condition:
* post-condition:
* inputs:
* outputs:
* special conditions:
*/
public int[] basicSelectionSort(int[] x) {
for (int i = 0; i < x.length; ++i) {
for (int j= i+1; j < x.length; ++j) {
if (x[i] > x[j]) {
setTemp(x[i]);
x[i] = x[j];
setTemp(x[j]);
}
} // end of inner for loop
} // end of outer for loop
return x;
} // end of basicSelectionSort method
public int getTemp() {
	return temp;
}
public void setTemp(int temp) {
	this.temp = temp;
}
public static void selectionSort(int[] arr) {
	// TODO Auto-generated method stub
	
}
}

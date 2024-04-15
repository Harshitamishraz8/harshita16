//WAJP to create an array(2D) with following data.
                     //{{1,2,3,4}, {1,2}, {1,2,3,4,5}}
public class javaq3 {
	public static void main (String[] args) {
 int[][] num={{1,2,3,4}, {1,2}, {1,2,3,4,5}};
 for(int i =0;i<num.length;i++)
	 {
	 for (int j=0;j<num[i].length;j++)
	 {
		System.out.println(num[i][j]); 
	 }
	 }
	 }
}

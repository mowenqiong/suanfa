package sort;
/**
 * 冒泡排序
 * 
 * @author MoWenqiong
 * 2015-7-7
 */
public class BOBO {


	public static void main(String[] args) {
		int a[] = {25,63,44,12,89,77};
		
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length - 1-i;j++){
				if(a[j]<a[j+1]){
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
		for (int i : a) {
			System.out.println(i);
		}

	}

}

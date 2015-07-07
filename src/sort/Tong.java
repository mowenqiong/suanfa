package sort;
/**
 * 桶排序
 * 
 * 算法原理：
 * 1.对0到100内的数据进行排序
 * 2.创建100个桶
 * 3.把待排序的数字放到对应的桶中（12就放到12号桶中，12有几次，12号桶就记录该次数）
 * 
 * 局限性：
 * 1.如果数据较大，则浪费空间
 * 2.小数就没有办法了
 * @author MoWenqiong
 * 2015-7-7
 */
public class Tong {


	public static void main(String[] args) {
		int a[] = {0,99,54,68,99,12,100};
		
		int b[] = new int[101];
		
		//将数字放到桶中
		for(int i=0;i<a.length;i++){
			b[a[i]] += 1;
		}
		
		//输出结果
		for(int i=0;i<b.length;i++){
			if(b[i]>0){
				for(int j=0;j<b[i];j++){
					System.out.println(i);
				}
			}
		}

	}

}

/**
 * 冒泡排序
 * 很简单，用到的很少，据了解，面试的时候问的比较多！
 * 将序列中所有元素两两比较，将最大的放在最后面。
 * 将剩余序列中所有元素两两比较，将最大的放在最后面。
 * 重复第二步，直到只剩下一个数。
 * 代码实现：设置循环次数。
 *           设置开始比较的位数，和结束的位数。
 *           两两比较，将最小的放到前面去。
 *           重复2、3步，直到循环次数完毕。
 * @author 孟赟强
 * @date 2019/5/16-15:29
 **/
public class BubbleSort {
    public void bubbleSort(int[] a){
        int len=a.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){//注意第二重循环的条件
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}

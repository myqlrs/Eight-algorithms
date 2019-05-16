import java.util.Arrays;

/**
 * 代码测试
 * 总结：
 * 一、稳定性:
 * 　   稳定：冒泡排序、插入排序、归并排序和基数排序
 * 　　不稳定：选择排序、快速排序、希尔排序、堆排序
 * 二、平均时间复杂度
 * 　　O(n^2):直接插入排序，简单选择排序，冒泡排序。
 * 　　在数据规模较小时（9W内），直接插入排序，简单选择排序差不多。当数据较大时，冒泡排序算法的时间代价最高。
 * 性能为O(n^2)的算法基本上是相邻元素进行比较，基本上都是稳定的。
 * 　　O(nlogn):快速排序，归并排序，希尔排序，堆排序。
 * 　　其中，快排是最好的， 其次是归并和希尔，堆排序在数据量很大时效果明显。
 * 三、排序算法的选择
 * 　　1.数据规模较小
 *   　　（1）待排序列基本序的情况下，可以选择直接插入排序；
 *   　　（2）对稳定性不作要求宜用简单选择排序，对稳定性有要求宜用插入或冒泡
 * 　　2.数据规模不是很大
 * 　　（1）完全可以用内存空间，序列杂乱无序，对稳定性没有要求，快速排序，此时要付出log（N）的额外空间。
 * 　　（2）序列本身可能有序，对稳定性有要求，空间允许下，宜用归并排序
 * 　　3.数据规模很大
 *    　　（1）对稳定性有求，则可考虑归并排序。
 *     　　（2）对稳定性没要求，宜用堆排序
 * 　　4.序列初始基本有序（正序），宜用直接插入，冒泡
 * @author 孟赟强
 * @date 2019/5/16-15:14
 **/
public class Algorithms {
    public static void main(String[] args) {
        int[] a=new int[10];
        for(int i=1;i<a.length;i++){
            //a[i]=(int)(new Random().nextInt(100));
            a[i]=(int)(Math.random()*100);
        }
        System.out.println("排序前的数组为："+ Arrays.toString(a));
        //排序方法测试
//        new BaseSort().baseSort(a);//基数排序
//        new BubbleSort().bubbleSort(a);//冒泡排序
//        new HeapSort().heapSort(a);//堆排序
//        new InsertSort().insertSort(a);//插入排序
//        new MergeSort().mergeSort(a,0,9);//归并排序
//        new QuickSort().quickSort(a,0,9);//快速排序
//        new SelectSort().selectSort(a);//选择排序
//        new SheelSort().sheelSort(a);//希尔排序
        Arrays.sort(a);
        System.out.println("排序后的数组为："+ Arrays.toString(a));

        //一个有趣的排序：睡眠排序
        SleepSort[] sortThreads = new SleepSort[a.length];
        //指定每个线程数组的值
        for (int i = 0; i < sortThreads.length; i++) {
            sortThreads[i] = new SleepSort(a[i]);
        }
        //开启每个线程
        for (int i = 0; i < sortThreads.length; i++) {
            sortThreads[i].start();
        }
    }

}

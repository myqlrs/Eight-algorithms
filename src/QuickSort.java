/**
 * 快速排序
 * 要求时间最快时。
 * 选择第一个数为p，小于p的数放在左边，大于p的数放在右边。
 * 递归的将p左边和右边的数都按照第一步进行，直到不能递归。
 * @author 孟赟强
 * @date 2019/5/16-15:31
 **/
public class QuickSort {
    public void quickSort(int[]a,int start,int end){
        if(start<end){
            int baseNum=a[start];//选基准值
            int midNum;//记录中间值
            int i=start;
            int j=end;
            do{
                while((a[i]<baseNum)&&i<end){
                    i++;
                }
                while((a[j]>baseNum)&&j>start){
                    j--;
                }
                if(i<=j){
                    midNum=a[i];
                    a[i]=a[j];
                    a[j]=midNum;
                    i++;
                    j--;
                }
            }while(i<=j);
            if(start<j){
                quickSort(a,start,j);
            }
            if(end>i){
                quickSort(a,i,end);
            }
        }
    }
}

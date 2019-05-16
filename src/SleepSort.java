/**
 * 一个有趣的排序：睡眠排序
 * @author 孟赟强
 * @date 2019/5/16-16:37
 **/
public class SleepSort extends Thread{
    int s = 0;
    public SleepSort(int s){
        this.s = s;
    }
    public void run(){
        try {
            sleep(s*10+10);  //睡眠指定的时间
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        //输出该数
        System.out.println(s);
    }
}

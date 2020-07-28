import javafx.scene.shape.Circle;

public class ClassTest {
    public static void main(String[] args) {

        ClassTest classTest = new ClassTest();
        classTest.first();

    }

    void first(){
        Data data1 = new Data();
        data1.m = 10;
        System.out.println("最初的data1.m值"+ data1.m);//此时输出结果为5
        second(data1,5);//调用第二个方法，希望修改当前的data1.m的值
        System.out.println("调用second方法后的data1.m值" + data1.m);//此时期望的输出结果为0，但实际输出还是5
    }
    void second(Data data2, int i){
        data2.m = i;//修改传入的Data类的实例化对象的m值
        System.out.println("通过形参i修改形参data2.m的值" + data2.m);//输出结果预期为5，实际也为5
        Data newData = new Data();
        data2 = newData;//希望将传入的对象覆盖为一个默认的初始化对象，期望此时first方法中的data1.m为0，实际输出仍为5
    }

     /*
    void first(){
        int[] a = {0};
        System.out.println(a[0]);
        second(a,5);
        System.out.println(a[0]);
    }
    void second(int []a,int i){
        a[0] = i;
        System.out.println(a[0]);
    }

      */

}
class Data{
    int m;//int型属性若不初始化，默认值为0
}
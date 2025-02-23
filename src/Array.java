// 数组
public class Array {
    public static void main(String[] args) {
        String[] names = {"ABC", "XYZ", "zoo"}; 
        //声明/字符串数组/变量names。包含3个（字符串）元素，每个元素都指向某个字符串对象
        //因为是引用类型，此时会开辟一个新的内存地址，内存空间为3个长度，其中的每项也会开辟一个内存空间存放，"ABC", "XYZ", "zoo"，然后通过下标去对应分别的内存空间
        String s = names[1]; 
        //元素引用：字符串数组变量索引1，即names[1]=="XYZ"
        //String[] s = names[1] 是地址引用;
        System.out.println(System.identityHashCode(names[1]) == System.identityHashCode(s));
        //这里我在names[1]复制前，用System.identityHashCode方法查看它是否一致，也就是一楼说的是否是同一把钥匙，这里打印结果是true
        names[1] = "cat"; 
        //内存引用发生变更
        //原来names[1]指向的字符串"XYZ"并没有改变，仅仅是将names[1]的引用从指向"XYZ"改成了指向"cat"，其结果是字符串"XYZ"再也无法通过names[1]访问到了
        System.out.println(System.identityHashCode(names[1]) == System.identityHashCode(s));
        //为了验证是否是同一个引用指向，这里我执行结果为false，说明names[1] = 'cat', 确实发生了内存指向的改变
        System.out.println(s); // s是"XYZ"
        System.out.println(System.identityHashCode(s));
    }
}
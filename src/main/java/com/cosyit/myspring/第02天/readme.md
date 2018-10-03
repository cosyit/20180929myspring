（首先.md文件是 markdown 语言文件。这是我第一次使用md 。）
今天得主题是spring ioc ，在接触这个之前，我还是很想把java中几个工厂回顾一下。<br>

1.首先谈谈工厂的作用，为什么要用工厂？
当我们创建对象进行new Sample(参数);的时候，一般会把初始化的工作放在构造函数中。
如果构造函数中的初始化的工作很多，是一串很长很长的代码。就相当于
很危险的把很多的鸡蛋放在一个篮子里，如果某个代码出了bug,那么其他的代码也要
进行检查和修改编码，重新编译。牵一发而动全身，一个老鼠屎坏了一锅粥。
<br>

这个时候就要求我们要把创建实例的工作和使用实例的工作分开。就是说要把
大量的初始化的工作Sample从构造函数中分离出去。
这个时候我们就需要工厂模式来生成对象了。

另外一种情况，现在Sample 有一个继承，如MySample 子类，按照面向接口
编程，我们需要将Sample抽象为一个接口，那么现在Sample为一个接口，
它会有很多的子类，如MySample 和 HisSample ,我们要实例化他们的儿子
<br>

Sample mySample = new MySample();<br>
Sample hisSample = new HisSample();<br>
...随着项目深入还有更多的儿子实例。<br>
那么我们会对这些儿子一个一个实例化，更糟的是:
可能还要对以前的代码进行修改:加入后来生出的儿子实例，这
在传统的程序中是无法避免的。
<br>
但是你一开始就有意识的使用了工厂模式，那么这些麻烦就没有了。
<br>

####工厂方法
你会建立一个专门生产Sample实例的工厂：
public class Factory{
public static Sample creator(int which){
    //getClass 产生Sample 一般可使用动态类装载入类。
    if(which ==1 ) return new SampleA();
       else if(which ==2 ) return new SampleB();
    }
}

那么在你的程序中，如果要实例化Sample时，就使用
Sample sampleA = Factroy.creator(1);
这样，在整个就不涉及到Sample 的具体子类，达到封装的效果，这样就
减少了错误修改的机会。







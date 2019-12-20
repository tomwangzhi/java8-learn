# java8-learn
java8新增的特性学习
参考：https://snailclimb.gitee.io/javaguide/#/docs/java/What's%20New%20in%20JDK8/Java8Tutorial?id=functions

### 1. 接口的默认方法

> 指的是在接口中定义一个已经实现好的方法

### 2. Lambda表达式

> 简化了匿名实现类创建的简化，去掉了return {}之类的符号

### 3. 函数式接口(Functional Interfaces)

> 思考如何使现有的函数友好地支持Lambda。最终采取的方法是：增加函数式接口的概念
> “函数式接口”是指仅仅只包含一个抽象方法,但是可以有多个非抽象方法(也就是上面提到的默认方法)的接口
> Runnable  和 Callable都是典型的函数式接口 @FunctionalInterface 来标明，不是非必须的，但是加上有个抽象
> 方法时会提示报错

> 注意：大部分的函数式接口都替我们写好了，我们可以直接使用，在java.util.function下面，不要重复造轮子

### 4. 方法和构造函数引用

> Java 8允许您通过::关键字传递方法或构造函数的引用,也可以引用对象方法

### 5. Lamda 表达式作用域

> 访问局部变量
> 访问字段和静态变量
> 访问默认接口方法：像接口中的默认方法就不能使用lambada表达式

### 6. Functions
> Predicate 接口是只有一个参数的返回布尔类型值的 断言型 接口。该接口包含多种默认方法来将 Predicate 组合成其他复杂的逻辑（比如：与，或，非）：
  
> Function 接口接受一个参数并生成结果。默认方法可用于将多个函数链接在一起（compose, andThen）：
       
### 7. Streams 

> java.util.Stream 表示能应用在一组元素上一次执行的操作序列。Stream 操作分为中间操作或者最终操作两种，最终操作返回一特定类型的计算结果，而中间操作返回Stream本身，这样你就可以将多个操作依次串起来。Stream 的创建需要指定一个数据源，比如java.util.Collection 的子类，List 或者 Set， Map 不支持。Stream 的操作可以串行执行或者并行执行。
> 数据源->中间操作->最终操作


线程有三种实现方式
1.采用实现Runnable、Callable接口的方式创建多线程，线程只是实现了Runnable接口或者Callable接口，还可以继承其他类
2.使用继承Thread类的方式创建多线程时，编写简单，如果需要访问当前线程，则无需使用Thread.currentThread()方法，直接使用this即可获得当前线程
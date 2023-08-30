# 一、java中线程池相关知识
## 1、java中多线程相关操作
  jdk1.8以后，多数使用CompletableFuture来操作多线程任务，具体可参考[CompletableFuture详解](https://juejin.cn/post/7126145088299728933)

  CompletableFuture的一些常用的方法也可以参考[java中CompletableFuture的一些方法讲解](https://blog.csdn.net/weixin_44073836/article/details/123346035)

  CompletableFuture的使用可以参考[CompletableFuture最佳实践](https://blog.csdn.net/m0_37787662/article/details/124963363)
  
  
## 2、java中线程池的线程数量的设置
1、对于 CPU 密集型计算，多线程本质上是提升多核 CPU 的利用率，所以对于一个 4 核的 CPU，每个核一个线程，理论上创建 4 个线程就可以了，再多创建线程也只是增加线程切换的成本。
所以，对于 CPU 密集型的计算场景，理论上“线程的数量 =CPU 核数”就是最合适的。不过在工程上，线程的数量一般会设置为“CPU 核数 +1”，这样的话，当线程因为偶尔的内存页失效或
其他原因导致阻塞时，这个额外的线程可以顶上，从而保证 CPU 的利用率。
最佳线程数 = CPU 核数 + 1
2、对于 I/O 密集型的计算场景，如果 CPU 计算和 I/O 操作的耗时是 1:1，那么 2 个线程是最合适的。如果 CPU 计算和 I/O 操作的耗时是 1:2，那多少个线程合适呢？是 3 个线程，
CPU 在 A、B、C 三个线程之间切换，对于线程 A，当 CPU 从 B、C 切换回来时，线程 A 正好执行完 I/O 操作。这样 CPU 和 I/O 设备的利用率都达到了 100%。
最佳线程数 = CPU 核数 * [ 1 +（I/O 耗时 / CPU 耗时）]
  个人理解就是保证cpu计算完后io正好处理完。

主要参考[Java线程：创建多少线程才是合适的？](https://blog.csdn.net/ChinaLiaoTian/article/details/128472930)

# 二、java中其他琐碎相关知识
## 1、java中雪花算法
  是生成订单id的一种算法，具体原理可参考[SnowFlake雪花算法（Java版本）](https://blog.csdn.net/weixin_47274607/article/details/126141772)
## 2、java中UUID
  具体参考 [UUID 的生成原理](https://blog.csdn.net/BASK2312/article/details/131125660)

## 3、java中悲观锁和乐观锁
  具体参考[乐观锁和悲观锁详解](https://javaguide.cn/java/concurrent/optimistic-lock-and-pessimistic-lock.html)
  

# TestHook
简单的hook系统剪切板的程序，涉及技术hook、反射、代理模式等；   

## 功能    
实现拦截系统剪切板服务，使粘贴时永远粘贴的是我们写入的一段文字。    
注：这个拦截仅限于本程序内部，对系统其他APP无效；如果要拦截对所有APP生效，那就需要root了，此处先不考虑了。

## 学习目的    
通过学习了解hook，为学习android插件化做铺垫；当然该技术可以干的事还有很多。    

## 参考资料    
[插件化知识详细分解及原理 之代理，hook，反射](http://blog.csdn.net/yulong0809/article/details/56842027)    
[Android系统篇之----Binder机制和远程服务调用机制分析](http://blog.csdn.net/jiangwei0910410003/article/details/52467919)    
[Android系统篇之----免root实现Hook系统服务拦截方法](http://blog.csdn.net/jiangwei0910410003/article/details/52523679)    
[Android系统篇之----解读AMS远端服务调用机制以及Activity的启动流程](http://blog.csdn.net/jiangwei0910410003/article/details/52549333)     
[Android系统篇之----Hook系统的AMS服务实现应用启动的拦截功能](http://blog.csdn.net/jiangwei0910410003/article/details/52550147)    
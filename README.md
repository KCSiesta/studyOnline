# 虹软科技在线学习平台项目说明

### 项目简介

该系统拥有在线学习平台的基础功能，并能根据员工身份推荐相应培训课程，员工可通过看视频、听音频、看PPT多种方式进行在线学习。适应培训内容短小、快速的特点，在最小的时间内能够获得最大的培训收益，让员工能够充实自己的知识和技能。
该系统具有非常友好的界面，采用了Spring + Spring MVC + Mybatis 框架的结合。采用shiro保证了保密性，采用Gradle自动化构建工具，更好地解决一些包的冲突。

### 功能介绍

#### 客户端
![image](https://github.com/KCSiesta/studyOnline/blob/master/Image/WX20170823-153728.png)
* 登陆功能：无论是学员还是管理员，都需要进行登陆，验证该账号是否存在才可以进行后续的操作。
* 查询功能：该系统实现模糊查询，而且还有组合查询。
* 个人信息显示和修改功能：可以修改个人信息和账号的密码。
* 视频播放功能：可以播放视频学习。
* PPT播放功能：可以播放PPT学习。
* 音频播放功能：可以播放音频学习。
* 评论功能：在学习的同时，可以实现评论功能来发表自己对该学习资料的看法，意见。以及可以回复一些已经评论的评论。
#### 后台
![image](https://github.com/KCSiesta/studyOnline/blob/master/Image/WX20170823-153845.png)
* 登陆功能：后台管理者进入后台系统进行操作的时候需要登陆。
* 账号密码修改功能：可以修改管理者账号的密码。
* 对用户进行增删改查的功能：可以对已经注册的用户进行增删改查的操作。（其中，在增加用户的时候，有一个可以导入Excel表的功能来实现批量增加。）
* 对课程进行增删改查的功能：对于要在前台展示的功能，可以在后台增删改查，从而管理这些学习资源。

### 开发工具
IntelliJ Idea + Tomcat服务器 + MySQL数据库

### 前后端技术

* 前端采用了HTML+CSS，运用HTML5一些新标签进行开发，包括更多CSS3新特性；除此之外，引入jQuery框架实现页面动态效果，Ajax技术请求获取JSON数据接口与后台尽享数据交互。
 
* 后台则采用了Spring + Spring MVC + Mybatis 框架的结合，分化各个功能组件;Shiro技术则是提供认证、授权、加密和会话管理功能;采用Gradle自动化构建工具;ffmpeg技术则是用来记录、转换数字音频、视频，并能将其转化为流的开源计算机程序。

### 界面截图

#### 首页界面：
￼![image](https://github.com/KCSiesta/studyOnline/blob/master/Image/1.png)

#### 播放视频界面:
![image](https://github.com/KCSiesta/studyOnline/blob/master/Image/3.png)

#### 播放音频界面：
￼![image](https://github.com/KCSiesta/studyOnline/blob/master/Image/4.png)

#### 播放PPT界面：
￼![image](https://github.com/KCSiesta/studyOnline/blob/master/Image/5.png)

#### 课程界面：
￼![image](https://github.com/KCSiesta/studyOnline/blob/master/Image/2.png)

#### 个人信息界面：
![image](https://github.com/KCSiesta/studyOnline/blob/master/Image/6.png)


￼

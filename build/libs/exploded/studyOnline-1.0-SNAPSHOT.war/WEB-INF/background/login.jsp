<!doctype html>
<%--
  Created by IntelliJ IDEA.
  User: Focus
  Date: 2017/6/21
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录-注册</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/normalize.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
    <script type="text/javascript">
        var deviceWidth = document.documentElement.clientWidth;
        if (deviceWidth > 1200) deviceWidth = 1280;
        document.documentElement.style.fontSize = deviceWidth / 12.0 + 'px';
    </script>
</head>
<body>
<div id="sign-wrap" class="sign-wrap">

    <!-- nav moudle -->
    <div class="sign-head">
        <div class="logo-wrapper">
            <a class="sign-logo" href=""><img src="${pageContext.request.contextPath}/img/logo.png"/></a>
        </div>
        <ul>
            <li class="login-titl on">登录</li>
            <%--<li class="register-titl">注册</li>--%>
        </ul>
    </div>

    <div class="sign-content">
        <!-- login moudle -->
        <div class="login-form">
            <div class="form-wrapper">
                <div class="form-header">
                    <p class="form-heading">登录</p>
                </div>

                <form action="${pageContext.request.contextPath}/customerLogin" class="form-horizontal" method="post">

                    <div class="field-wrapper">
                        <label class="field-label">账号</label>
                        <input type="text" class="field-input" name="username" id="uname" placeholder="请输入用户名"
                        />
                    </div>

                    <div class="field-wrapper">
                        <label class="field-label">密码</label>
                        <input type="password" class="field-input" name="password" id="upwd" placeholder="请输入密码"
                        />
                    </div>

                    <div class="field-wrapper">
                        <label class="field-label verify">验证码</label>
                        <input type="text" class="field-input verify" name="verify" id="vef" placeholder="请输入验证码"
                        />
                        <span class="verify-code"></span>
                    </div>


                    <div class="submit-btn-wrapper">
                        <button type="submit" class="submit-btn login">登录</button>
                    </div>

                </form>
            </div>
        </div>

        <!-- register-moudle           -->
        <!--     <div class="register-form">
            <div class="form-wrapper">
                <div class="form-header">
                    <p class="form-heading">注册</p>
                </div>

                <form action="${pageContext.request.contextPath}/customerLogin" class="form-horizontal" autocomplete="off">

                    <div class="field-wrapper">
                        <label class="field-label">账号</label>
                        <input type="text" class="field-input" name="username" id="uname" placeholder="请输入手机号/用户名"
                        />
                    </div>

                    <div class="field-wrapper">
                        <label class="field-label">密码</label>
                        <input type="password" class="field-input" name="password" id="upwd" placeholder="请输入密码"
                        />
                    </div>

                    <div class="field-wrapper">
                        <label class="field-label">确认密码</label>
                        <input type="password" class="field-input" name="re-password" id="re-upwd" placeholder="请确认密码"
                        />
                    </div>

                    <div class="field-wrapper">
                        <label class="field-label verify">验证码</label>
                        <input type="text" class="field-input verify" name="verify" id="vef" placeholder="请输入验证码"
                        />
                        <span class="verify-code"></span>
                    </div>


                    <div class="submit-btn-wrapper">
                        <button type="submit" class="submit-btn register">注册</button>
                    </div>

                </form>
            </div>
        </div> -->
    </div>
</div>


<script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js"></script>
</body>
</html>
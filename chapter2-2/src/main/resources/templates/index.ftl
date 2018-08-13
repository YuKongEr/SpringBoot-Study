<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>freemark</title>
</head>
<body>
    <p> 你好 ${user.username}</p>
    <p> 密码 ${user.password}</p>
    <p> 性别：
           <#if user.sex==1>
              男
           <#elseif user.sex==2>
              女
           <#else>
              保密
           </#if>
    </p>
    <p> 年龄 ${user.age}</p>
</body>
</html>
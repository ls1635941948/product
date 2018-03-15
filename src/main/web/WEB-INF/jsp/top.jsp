<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-md-6 col-md-offset-4">
        <h1>销售管理系统</h1>
    </div>
</div>
<div class="row">
    <div class="col-md-4 col-md-offset-8">
        <h5>欢迎：${loginUser.userName}</h5>
        <h5><a href="${pageContext.request.contextPath}/user/logout">退出</a></h5>
    </div>
</div>

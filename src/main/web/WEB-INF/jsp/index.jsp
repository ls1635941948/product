<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login</title>
  <%@ include file="basic.jsp"%>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/style.css">
  <script type="text/javascript">
    var msg = "${message}";
    if(msg.length>0) {
        alert(msg);
    }

        $(function () {
            //展示修改用户模态框
            $("button[name=updateUserButton]").click(function () {
                var id=$(this).attr("no");
                $.get("${pageContext.request.contextPath}/user/queryUserById",
                    {"id":id},function (data) {
                        $("#updateUserName").val(data.userName);
                        $("#updateStatus").val(data.status);
                        $("#updateUserModal").modal("show");
                    })
            })

            //修改用户保存按钮
            $("#updateUserSaveButton").click(function () {
                var user=$("#updateUserForm").serialize();
                url="${pageContext.request.contextPath}/user/updateUser";
                $.post(url,user,function (data) {
                    alert(data.msg);
                    location.href=location.href;
                })
            })

            //显示添加用户模态框
            $("#addUserButton").click(function () {
                $("#addUserModal").modal("show");
            })
            //添加用户保存
            $("#addUserSaveButton").click(function () {
                //序列化表单数据
                var user=$("#addUserForm").serialize();
                var url="${pageContext.request.contextPath}/user/addUser";
                $.post(url,user,function (result) {
                    alert(result.msg);
                    //关闭模态框
                    $("#addUserModal").modal("hide");
                    location.href = location.href;
                });
            })
        })
  </script>
</head>
<body>
<h1>超市商品管理系统</h1>
<div class="login-form">
  <div class="avtar">
    <img src="/statics/images/avtar.png" />
  </div>
  <form action="${pageContext.request.contextPath}/user/toUser" method="get">
    <input type="text" class="text" name="userName" id="userName">
    <div>
      <input type="password" name="password" id="password">
    </div>
    <button type="button" class="btn btn-info" id="addUserButton" style="width: 100%">用户注册</button>
    <input type="submit" value="login">
  </form>
</div>

<!--添加用户模态框-->
<div class="modal fade" tabindex="-1" role="dialog" id="addUserModal">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h4 class="modal-title">注册用户</h4>
      </div>
      <div class="modal-body">
        <form id="addUserForm" class="rows">
          <div class="form-group">
            <label class="col-sm-2 control-label">用户名称</label>
            <input type="text" class="form-control"  placeholder="用户名称" name="userName">
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label">用户密码</label>
            <input type="password" class="form-control"  placeholder="用户密码" name="password">
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="addUserSaveButton">保存</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

</body>
</html>
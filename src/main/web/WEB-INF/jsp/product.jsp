<%--
  Created by IntelliJ IDEA.
  User: 朱博文
  Date: 2018/3/15
  Time: 0:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <%@include file="basic.jsp"%>
    <script type="text/javascript">
        $(function () {
            $("#addProductButton").click(function () {
                $("#addProductForm").reset;
                $("#addProductModal").modal("show");
            })
            $("#saveAddProductButton").click(function () {
                var product=$("#addProductForm").serialize();
                $.post("${pageContext.request.contextPath}/product/addProduct",product,function (data) {
                    alert(data.msg);
                    location.href=location.href;
                })
            })

            $("button[name=updateProductButton]").click(function () {
                $("#updateQuantity").val("");
                var id = $(this).attr("no");
                $.get("${pageContext.request.contextPath}/product/queryProductById",{"id":id},function (data) {
                    $("#updateProductName").val(data.productName);
                    $("#updateId").val(data.id);
                    $("#updatePrice").val(data.price);
                    $("#updateProductModal").modal("show");
                })
            })

            $("#saveUpdateProductButton").click(function () {
                var product = $("#updateProductForm").serialize();
                $.post("${pageContext.request.contextPath}/product/updateProduct",product,function (data) {
                    alert(data.msg);
                    location.href = location.href;
                })
            })
        })
    </script>
</head>
<body>
<div class="container">
    <%@include file="top.jsp"%>
    <div class="row">
        <%@include file="left.jsp"%>
        <div class="col-md-10">
            <h2>商品管理</h2>
        </div>

        <div class="row">
            <div>
                <h2></h2>
            </div>
        </div>
            <div class="row">
                <c:if test="${loginUser.id==1}">
                    <div class="col-md-1 col-md-offset-8">
                        <button class="btn btn-info" id="addProductButton">添加商品</button>
                    </div>
                </c:if>
                <div class="col-lg-8 col-lg-offset-2">
                    <table class="table table-striped">
                        <tr>
                            <td>id</td>
                            <td>商品名称</td>
                            <td>商品价格</td>
                            <td>库存量</td>
                            <td>操作</td>
                        </tr>

                        <c:forEach items="${pageInfo.list}" var="pa">
                            <tr>
                                <td>${pa.id}</td>
                                <td>${pa.productName}</td>
                                <td>${pa.price}</td>
                                <td>${pa.quantity}</td>
                                <td><button name="updateProductButton" no="${pa.id}" class="btn btn-info">购买商品</button></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        <%@include file="page.jsp"%>
    </div>
        <div class="modal fade" tabindex="-1" role="dialog" id="addProductModal">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">添加商品库存</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" id="addProductForm">
                            <div class="form-group">
                                <label  class="col-sm-2 control-label">商品名称</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control"  placeholder="商品名称" name="productName">
                                </div>
                            </div>

                            <div class="form-group">
                                <label  class="col-sm-2 control-label">商品价格</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control"  placeholder="商品价格" name="price">
                                </div>
                            </div>

                            <div class="form-group">
                                <label  class="col-sm-2 control-label">库存量</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control"  placeholder="库存量" name="quantity">
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="button" class="btn btn-primary" id="saveAddProductButton">保存</button>
                    </div>
                </div>
            </div>
        </div>

        <%--购买商品--%>
        <div class="modal fade" tabindex="-1" role="dialog" id="updateProductModal">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">购买商品</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" id="updateProductForm">
                            <div class="form-group">
                                <label  class="col-sm-2 control-label">商品名称</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control"  placeholder="商品名称" name="productName" id="updateProductName" readonly>
                                    <input type="hidden" name="id" id="updateId">
                                </div>
                            </div>

                            <div class="form-group">
                                <label  class="col-sm-2 control-label">商品价格</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control"  placeholder="商品价格" name="price" id="updatePrice" readonly>
                                </div>
                            </div>

                            <div class="form-group">
                                <label  class="col-sm-2 control-label">库存量</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control"  placeholder="" name="quantity" id="updateQuantity">
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="button" class="btn btn-primary" id="saveUpdateProductButton">购买</button>
                    </div>
                </div>
            </div>
        </div>
</body>
</html>

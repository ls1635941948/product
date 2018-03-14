<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="basic.jsp"%>

<div class="col-md-2">
    <ul class="nav nav-pills nav-stacked">
        <li role="presentation" id="productList">
            <span>
            <a href="#">
                商品列表
            </a>
                </span>
        </li>
        <c:if test="${loginUser.id==1}">
            <li role="presentation" id="userList">
                <span>
                <a href="${pageContext.request.contextPath}/user/toUserList?pageNum=1&pageSize=3">
                    用户管理
                </a>
                    </span>
            </li>
            <li role="presentation" id="recordList">
                <span>
                <a href="${pageContext.request.contextPath}/sale/toSale?pageNum=1&pageSize=5">
                    销售记录
                </a>
                    </span>
            </li>
        </c:if>
    </ul>
</div>
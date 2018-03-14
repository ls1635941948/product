<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="col-md-2">
    <ul class="nav nav-pills nav-stacked">
        <li role="presentation">
            <a href="${pageContext.request.contextPath}/user/toUserList?pageNum=1&pageSize=3">
                用户管理
            </a>
        </li>
        <li role="presentation">
            <a href="#">
                商品管理
            </a>
        </li>
        <li role="presentation">
            <a href="${pageContext.request.contextPath}/sale/toSale?pageNum=1&pageSize=5">
                销售记录
            </a>
        </li>
    </ul>
</div>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form id="myForm" action="/cp/del" method="post">

    <table class="table table-striped">
        <thead class="thead-dark">
        <tr>
            <th scope="col"><input type="checkbox" onclick="alls(this)">
                <button  class="btn btn-primary btn-sm" style="background-color: orangered">
                    删除
                </button>
            </th>
            <th scope="col">序号</th>
            <th scope="col">名称</th>
            <th scope="col">网络格式</th>
            <th scope="col">机身颜色</th>
            <th scope="col">上市时间</th>
            <th scope="col">价格</th>
            <th scope="col">操作</th>
        </tr>
        </thead>
        <c:forEach items="${cp}" var="cp">
            <tr>
                <td><input name="id" value="${cp.id}" type="checkbox"></td>
                <td>${cp.id}
                </td>
                <td>${cp.name}
                </td>
                <td>${cp.network}
                </td>
                <td>${cp.color}
                </td>
                <td>${cp.ttm}
                </td>
                <td>${cp.price}</td>

                <td>
                    <a href="/cp/del?id=${cp.id}">删除</a>
                    <a data-toggle="modal" href="#updatamodal" data-id="${cp.id}">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
<script>
    function alls(e) {
        var checkboxs = document.getElementsByName("id");
        for (var i = 0; i < checkboxs.length; i++) {
            checkboxs[i].checked = e.checked
        }
    }
</script>
<%@include file="cp_add_modal.jsp"%>
<%@include file="cp_updata_modal.jsp"%>


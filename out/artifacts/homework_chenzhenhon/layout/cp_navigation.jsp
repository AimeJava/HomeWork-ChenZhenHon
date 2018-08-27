<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header style="position: relative">
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="/cp/all">LOG仓库</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">

                <li class="nav-item">
                    <!-- 按钮触发模态框 -->
                    <button  class="btn btn-primary btn-sm" data-toggle="modal" data-target="#xxxx">
                        新增
                    </button>
                </li>

            </ul>
            <form class="form-inline mt-2 mt-md-0" action="/cp/sel" method="post">
                <input name="condition" class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">搜索</button>
            </form>
        </div>
    </nav>
</header>

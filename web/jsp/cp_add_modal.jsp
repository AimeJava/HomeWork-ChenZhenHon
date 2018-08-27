<%@page contentType="text/html;charset=UTF-8" %>

<form action="/cp/add" method="post" class="form-horizontal">
    <!-- 模态框（Modal） -->
    <div class="modal fade" id="xxxx" aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="myModalLabel">新增手机类型</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" id="bookId" class="form-control" name="id" placeholder="序号" >
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="bookname" placeholder="名称" name="name">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text"  class="form-control" id="bookprice" placeholder="网络格式" name="network">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="color" placeholder="机身颜色" name="color">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="ttm" placeholder="上市时间" name="ttm">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="number" step="0.001"  class="form-control" id="price" placeholder="价格" name="price">
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <div><input type="submit" class="btn btn-primary" value="添加"></div>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
</form>
<%@page contentType="text/html;charset=UTF-8" %>

<form action="/cp/update" method="post" class="form-horizontal">
    <!-- 模态框（Modal） -->
    <div class="modal fade" id="updatamodal" aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="myModalLabel">修改手机类型</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" id="cpId" class="form-control" name="id" placeholder="序号" >
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="cpName" placeholder="名称" name="name">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text"  class="form-control" id="cpNetwork" placeholder="网络格式" name="network">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="cpColor" placeholder="机身颜色" name="color">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="cpTtm" placeholder="上市时间" name="ttm">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="number" step="0.001"  class="form-control" id="cpPrice" placeholder="价格" name="price">
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <div><input type="submit" class="btn btn-primary" value="修改"></div>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
</form>

<script>

    $("#updatamodal").on("show.bs.modal",function (e) {
        var id =$(e.relatedTarget).data("id");
        //发送异步请求获取手机信息

        $.get("/cp/update?id="+id,function(data){

                $("#cpId").val(data.id);
                $("#cpName").val(data.name);
                $("#cpNetwork").val(data.network);
                $("#cpColor").val(data.color);
                $("#cpTtm").val(data.ttm);
                $("#cpPrice").val(data.price);

        },"json");

    });
</script>
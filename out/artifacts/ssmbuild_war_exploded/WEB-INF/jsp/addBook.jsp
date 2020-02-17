
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--BootStrop--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 colum">
            <div class="page-header">
                <h1>新增书籍</h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/addBooks" method="post">
        <div class="form-group">
            <label>书籍名称</label>
            <input type="text" class="form-control" name="bookName" required >
        </div>
        <div class="form-group">
            <label >书籍数量</label>
            <input type="text" class="form-control" name="bookCounts" required>
        </div>
        <div class="form-group">
            <label>书籍描述</label>
            <input type="text" class="form-control" name="detail" required>
        </div>
        <div class="form-group">
        <input type="submit" class="form-control">
</div>
    </form>
</div>
</body>
</html>

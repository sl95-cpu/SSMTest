<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>书籍展示</title>
     <%--BootStrop--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<h3>书籍展示</h3>

<div class="container">
    <div class="row clearfix">
       <div class="col-md-12 colum">
            <div class="page-header">
                <h1>书籍列表 ------ 显示书籍</h1>
            </div>
       </div>
        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/addBook">新增书籍</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/allBook">显示所有书籍</a>
            </div>
            <div class="col-md-4 column"></div>
            <div class="col-md-4 column">
              <form action="${pageContext.request.contextPath}/queryBook" method="post" style="float:right">
                 <span style="color: red;">${err}</span>
                  <input type="text" placeholder="请输入要查询的样式名称"
                         class="form-contorl" name="queryBookName">
               <input type="submit" value="查询" class="btn btn-primary">
              </form>
            </div>
        </div>
    </div>
    <div class="row claerfix">
      <div class="col-md-12 colum">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th>书籍编号</th>
                <th>书籍名称</th>
                <th>书籍数量</th>
                <th>书籍描述</th>
                <th>操作</th>
            </tr>
            </thead>

            <tbody>
               <c:forEach var="books" items="${list}">
                   <tr>
                       <td>${books.bookId}</td>
                       <td>${books.bookName}</td>
                       <td>${books.bookCounts}</td>
                       <td>${books.detail}</td>
                       <td>
                           <a href="${pageContext.request.contextPath}/updateBook?id=${books.bookId}">修改</a> &nbsp;|
                           <a href="${pageContext.request.contextPath}/deleteBook?id=${books.bookId}">删除</a> &nbsp;
                       </td>
                   </tr>
               </c:forEach>
            </tbody>
        </table>
      </div>
   </div>
</div>
</body>
</html>

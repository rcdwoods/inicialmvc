<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width">

<link rel="stylesheet" href="resources/stylesheet/bootstrap.css">
<link rel="stylesheet" href="resources/stylesheet/bootstrap.min.css">

<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<div>
		<tiles:insertAttribute name="cabecalho" />

		<br> <br>
		<tiles:insertAttribute name="content" />
		<br>

		<hr>

		<br>
		<tiles:insertAttribute name="rodape" />
		<br>
	</div>
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>
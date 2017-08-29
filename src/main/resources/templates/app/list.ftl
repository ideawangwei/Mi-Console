<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <script src="https://cdn.bootcss.com/angular.js/1.4.6/angular.min.js"></script>
    <script src="https://cdn.bootcss.com/angular-ui-router/1.0.3/angular-ui-router.js"></script>
    <script src="helloworld.js"></script>
    <style>.active { color: red; font-weight: bold; }</style>
</head>
<body ng-app="helloworld">
<a ui-sref="hello" ui-sref-active="active">Hello</a>
<a ui-sref="about" ui-sref-active="active">About</a>

<ui-view></ui-view>
</body>
</html>
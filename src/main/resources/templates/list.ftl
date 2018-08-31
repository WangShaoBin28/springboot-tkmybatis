<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="/jquery-3.3.1.min.js"></script>
</head>
<body>
<#list  pageInfo.list as list>
    <p> ${list.name} ${list_index} ${list?size}</p>
</#list >


</body>
</html>
<script>
    // $(function () {
    //     $.ajax({
    //         url: "/save",
    //         type: 'POST',
    //         data: {"mobile": "ccc王五www123", "name": "艾斯213德斯", "password": "112312少时诵诗书所三四十3"},
    //         success: function (result) {
    //             alert(result)
    //         }
    //     });
    // })

</script>
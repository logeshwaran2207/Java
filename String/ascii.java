<!DOCTYPE html>
<html>
<head>
    <title>Web Layout</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        table {
            width: 100%;
            height: 100vh;
            border-collapse: collapse;
        }
        td {
            border: 1px solid #ccc;
            padding: 10px;
        }
        .sidebar {
            width: 150px;
            background-color: #d3d3d3;
        }
        .links a {
            display: block;
            margin: 5px 0;
            padding: 5px;
            background-color: #f0f0f0;
            text-align: center;
            text-decoration: none;
            border: 1px solid #999;
        }
        .content img {
            max-width: 100%;
            height: auto;
        }
        .footer {
            background-color: #aaa;
            text-align: center;
            font-weight: bold;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <td class="sidebar" rowspan="2">
            <div class="links">
                <a href="#">Link 1</a>
                <a href="#">Link 2</a>
                <a href="#">Link 3</a>
                <a href="#">Link 4</a>
            </div>
        </td>
        <td colspan="2">
            <!-- Optional top space or heading -->
        </td>
    </tr>
    <tr>
        <td class="content">
            <p>Page content will appear here</p>
            <p><strong>WebTrainingRoom</strong></p>
            <img src="your-image.jpg" alt="Image here">
        </td>
        <td>
            <!-- Optional right sidebar -->
        </td>
    </tr>
    <tr>
        <td colspan="3" class="footer">
            Bottom Navigation | Copyright
        </td>
    </tr>
</table>

</body>
</html>
Replace "your-image.jpg" with the correct image path. Want me to convert this into a modern CSS Flexbox/Grid layout too?








<!DOCTYPE html>
<html>
<head>
    <title>Sample Layout</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            display: grid;
            grid-template-areas:
                "nav header header header"
                "nav content content content"
                "footer footer footer footer";
            grid-template-columns: 1fr 3fr;
            grid-template-rows: auto 1fr auto;
            gap: 10px;
            height: 100vh;
        }
        .nav {
            grid-area: nav;
            background-color: #ccc;
            padding: 10px;
            writing-mode: vertical-lr;
            transform: rotate(180deg);
            text-align: center;
        }
        .header {
            grid-area: header;
            background-color: #ddd;
            padding: 10px;
            display: flex;
            justify-content: space-around;
        }
        .header a {
            padding: 5px 10px;
            background-color: white;
            border: 1px solid #999;
            text-decoration: none;
        }
        .content {
            grid-area: content;
            background-color: #f9f9f9;
            padding: 10px;
            text-align: center;
        }
        .footer {
            grid-area: footer;
            background-color: #ccc;
            padding: 10px;
            text-align: center;
        }
        img {
            max-width: 100%;
            height: auto;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="nav">Bottom Navigation | Copyright</div>
        <div class="header">
            <a href="#">Link 1</a>
            <a href="#">Link 2</a>
            <a href="#">Link 3</a>
            <a href="#">Link 4</a>
        </div>
        <div class="content">
            <p>Page content will appear here</p>
            <p><strong>WebTrainingRoom</strong></p>
            <img src="your-image.jpg" alt="Sample Image">
        </div>
        <div class="footer">Footer Content</div>
    </div>
</body>
</html>
Replace "your-image.jpg" with the actual path to your image file. Let me know if you want this in a different layout (like using tables or flexbox).








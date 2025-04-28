<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>LSB-163</title>
            <!-- Latest compiled and minified CSS -->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

            <!-- Latest compiled JavaScript -->
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

            <link href="/css/demo.css" rel="stylesheet" />

        </head>

        <body>
            <nav class="navbar navbar-expand-lg navbar-dark bg-danger justify-content-center">
                <div class="container-fluid">
                    <div class="d-flex bg-success">
                        <a class="navbar-brand" href="/"><b>LSB-163</b></a>
                    </div>
                    <form class="d-flex ms-auto">
                        <input class="form-control me-2" type="search" placeholder="Bạn cần tìm gì?"
                            aria-label="Search">
                        <button class="btn btn-light" type="submit">Tìm</button>
                    </form>
                    <a href="/admin/user/create" class="ms-3">
                        <img src="https://cdn-icons-png.flaticon.com/512/149/149071.png" alt="Account" width="40"
                            height="40" class="rounded-circle">
                    </a>
                </div>
            </nav>
        </body>

        </html>
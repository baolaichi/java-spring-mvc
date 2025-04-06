<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


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
                <link rel="stylesheet" href="/css/demo.css" />

            </head>

            <body>
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-md-6 col-12 mx-auto">
                            <h1>Create User</h1>
                            <hr />
                            <form:form method="post" action="/admin/user/create" modelAttribute="newUser">
                                <div class="mb-3">
                                    <label for="exampleInputEmail1" class="form-label">Email address:</label>
                                    <form:input path="email" type="email" class="form-control" />
                                </div>
                                <div class="mb-3">
                                    <label for="exampleInputPassword1" class="form-label">Password:</label>
                                    <form:input path="password" type="password" class="form-control" />
                                </div>
                                <div class="mb-3">
                                    <label for="examplePhone1" class="form-label">Phone number: </label>
                                    <form:input path="phone" type="text" class="form-control" />
                                </div>
                                <div class="mb-3">
                                    <label for="exampleFullName1" class="form-label">Full name: </label>
                                    <form:input path="fullName" type="text" class="form-control" />
                                </div>
                                <div class="mb-3">
                                    <label for="exampleAddress1" class="form-label">Address: </label>
                                    <form:input path="address" type="text" class="form-control" />
                                </div>
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </form:form>
                        </div>
                    </div>
            </body>

            </html>
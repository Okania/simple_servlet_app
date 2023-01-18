<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
      rel="stylesheet"
      id="bootstrap-css"
    />
    <script src="https://netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>Login</title>
  </head>
  <body>
    <div class="container">
      <div class="row centred-form">
        <div
          class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4"
        >
          <div class="panel panel-default">
            <div class="panel-heading">
              <h3 class="panel-title">LOGIN</h3>
            </div>
            <div class="panel-body">
              <form role="form" action="login" method="post">
                <div class="form-group">
                  <input
                    type="text"
                    name="username"
                    class="form-control input-sm"
                    placeholder="Username"
                  />
                </div>

                <div class="form-group">
                  <input
                    type="password"
                    name="password"
                    class="form-control input-sm"
                    placeholder="Password"
                  />
                </div>

                <button type="submit" class="btn btn-info btn-block mb-3">
                  Login
                </button>
                <br />
                <div class="text-center">
                  <p>No Account? <a href="register_page.jsp">Register</a></p>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>

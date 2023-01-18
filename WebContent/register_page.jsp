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
    <title>Register</title>
  </head>
  </head>
  <body>
    <div class="container">
      <div class="row centred-form">
        <div
          class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4"
        >
          <div class="panel panel-default">
            <div class="panel-heading">
              <h3 class="panel-title">REGISTER</h3>
            </div>
            <div class="panel-body">
              <form role="form" action="register" method="post">
                <div class="row">
                  <div class="col-xs-6 col-sm-6 col-md-6">
                    <div class="form-group">
                      <input
                        type="text"
                        name="fname"
                        class="form-control input-sm"
                        placeholder="First Name"
                      />
                    </div>
                  </div>
                  <div class="col-xs-6 col-sm-6 col-md-6">
                    <div class="form-group">
                      <input
                        type="text"
                        name="lname"
                        class="form-control input-sm"
                        placeholder="Last Name"
                      />
                    </div>
                  </div>
                </div>
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

                <div class="form-group">
                  <input
                    type="text"
                    name="age"
                    class="form-control input-sm"
                    placeholder="Age"
                  />
                </div>

                <input
                  type="submit"
                  value="Register"
                  class="btn btn-info btn-block"
                />
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
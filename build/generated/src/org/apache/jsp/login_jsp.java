package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" ></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" ></script>\n");
      out.write("        <script  src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("         body {\n");
      out.write("                color: #000;\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                height: 100%;\n");
      out.write("                background-image: url(\"image/=bmw.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size:cover;\n");
      out.write("            }\n");
      out.write("            .error{\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card0 {\n");
      out.write("                box-shadow: 0px 4px 8px 0px #757575;\n");
      out.write("                border-radius: 0px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card2 {\n");
      out.write("                margin: 0px 40px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logo {\n");
      out.write("                width: 200px;\n");
      out.write("                height: 100px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                margin-left: 35px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .image {\n");
      out.write("                width: 530px;\n");
      out.write("                height: 500px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .border-line {\n");
      out.write("                border-right: 1px solid #EEEEEE\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .facebook {\n");
      out.write("                background-color: #3b5998;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 18px;\n");
      out.write("                padding-top: 5px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                width: 35px;\n");
      out.write("                height: 35px;\n");
      out.write("                cursor: pointer\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .twitter {\n");
      out.write("                background-color: #1DA1F2;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 18px;\n");
      out.write("                padding-top: 5px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                width: 35px;\n");
      out.write("                height: 35px;\n");
      out.write("                cursor: pointer\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .linkedin {\n");
      out.write("                background-color: #2867B2;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 18px;\n");
      out.write("                padding-top: 5px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                width: 35px;\n");
      out.write("                height: 35px;\n");
      out.write("                cursor: pointer\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .line {\n");
      out.write("                height: 1px;\n");
      out.write("                width: 45%;\n");
      out.write("                background-color: #E0E0E0;\n");
      out.write("                margin-top: 10px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .or {\n");
      out.write("                width: 10%;\n");
      out.write("                font-weight: bold\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .text-sm {\n");
      out.write("                font-size: 14px !important\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ::placeholder {\n");
      out.write("                color: #BDBDBD;\n");
      out.write("                opacity: 1;\n");
      out.write("                font-weight: 300\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            :-ms-input-placeholder {\n");
      out.write("                color: #BDBDBD;\n");
      out.write("                font-weight: 300\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ::-ms-input-placeholder {\n");
      out.write("                color: #BDBDBD;\n");
      out.write("                font-weight: 300\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input,\n");
      out.write("            textarea {\n");
      out.write("                padding: 10px 12px 10px 12px;\n");
      out.write("                border: 1px solid lightgrey;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("                margin-top: 2px;\n");
      out.write("                width: 100%;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                color: #2C3E50;\n");
      out.write("                font-size: 14px;\n");
      out.write("                letter-spacing: 1px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input:focus,\n");
      out.write("            textarea:focus {\n");
      out.write("                -moz-box-shadow: none !important;\n");
      out.write("                -webkit-box-shadow: none !important;\n");
      out.write("                box-shadow: none !important;\n");
      out.write("                border: 1px solid #304FFE;\n");
      out.write("                outline-width: 0\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:focus {\n");
      out.write("                -moz-box-shadow: none !important;\n");
      out.write("                -webkit-box-shadow: none !important;\n");
      out.write("                box-shadow: none !important;\n");
      out.write("                outline-width: 0\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a {\n");
      out.write("                color: inherit;\n");
      out.write("                cursor: pointer\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn-blue {\n");
      out.write("                background-color: #1A237E;\n");
      out.write("                width: 150px;\n");
      out.write("                color: #fff;\n");
      out.write("                border-radius: 2px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn-blue:hover {\n");
      out.write("                background-color: #000;\n");
      out.write("                cursor: pointer\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bg-blue {\n");
      out.write("                color: #fff;\n");
      out.write("                background:linear-gradient(to right,  #348f50, #56b4d3);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 991px) {\n");
      out.write("\n");
      out.write("\n");
      out.write("                .card1 pb-5  .row px-3 justify-content-center mt-4 mb-5 border-line  .image {\n");
      out.write("                    width: 500px;\n");
      out.write("                    height: 400px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .border-line {\n");
      out.write("                    border-right: none\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .card2 {\n");
      out.write("                    border-top: 1px solid #EEEEEE !important;\n");
      out.write("                    margin: 0px 15px\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            /**  Footer**/\n");
      out.write("   .bg-blue {\n");
      out.write("                 color: #fff;\n");
      out.write("                background:#2b3a67;\n");
      out.write("                padding-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            #msg   {\n");
      out.write("                background: linear-gradient(to right,  #348f50, #56b4d3);\n");
      out.write("                color:black;\n");
      out.write("                border: 1px solid red;\n");
      out.write("                width:24%;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 25px;\n");
      out.write("                padding: 5px;\n");
      out.write("                margin-top: 5px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                jQuery.validator.addMethod(\"lettersonly\", function (value, element) {\n");
      out.write("                    return this.optional(element) || /^[a-z]+$/i.test(value);\n");
      out.write("                }, \"Letters only please\");\n");
      out.write("                $(\"#log\").validate({\n");
      out.write("                    rules: {\n");
      out.write("                        email: {\n");
      out.write("                            required: true,\n");
      out.write("                            minlength: 3\n");
      out.write("                        },\n");
      out.write("                        password: {\n");
      out.write("                            required: true,\n");
      out.write("                            minlength: 5\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    messages: {\n");
      out.write("                        email: {required: \"You must enter a mailid\",\n");
      out.write("                            first_name: \"Please enter name\"},\n");
      out.write("                        password: {\n");
      out.write("                            required: \"Enter the proper password\"\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            ul {\n");
      out.write("                list-style-type: none;\n");
      out.write("                /*width:100%;*/\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 10px;\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color:#c52d2f;\n");
      out.write("            }\n");
      out.write("            li img{\n");
      out.write("\n");
      out.write("                height: 80px;\n");
      out.write("                padding-left: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li {\n");
      out.write("                float: right;\n");
      out.write("                position: sticky;\n");
      out.write("                top:0;\n");
      out.write("                z-index: 10;\n");
      out.write("            }\n");
      out.write("            li a {\n");
      out.write("                display: block;\n");
      out.write("                color: #00303F;\n");
      out.write("                font-weight: bolder;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin-top: 13px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a:hover {\n");
      out.write("                background: D8C3A5;\n");
      out.write("            }\n");
      out.write("            li .uname i{\n");
      out.write("                margin-right: 10px; \n");
      out.write("            }\n");
      out.write("            .uname{\n");
      out.write("                margin-top: 13px;\n");
      out.write("                color: #00303F;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                margin-right: 13px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown{\n");
      out.write("                float: right;\n");
      out.write("                position: sticky;\n");
      out.write("                top:0;\n");
      out.write("                z-index: 5;\n");
      out.write("                background-color: #c52d2f;\n");
      out.write("                margin-top: 13px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                border-color: #c52d2f;\n");
      out.write("                color: #00303F;\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin-right: 5px;\n");
      out.write("                padding: 14px 10px;\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown option{\n");
      out.write("                display: block;\n");
      out.write("                background-color: #FDF5F8;\n");
      out.write("                color: #4F4846;\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin-top: 13px;\n");
      out.write("\n");
      out.write("            }        \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body  style=\"margin:0;\">\n");
      out.write("        <ul>\n");
      out.write("            ");
 if (session.getAttribute("uname") != null) {
      out.write("\n");
      out.write("            <li class=\"uname\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\" style=\"margin-right: 5px;\"></i>");
      out.print(session.getAttribute("uname"));
      out.write("</li>\n");
      out.write("            <li><a href=\"register?logout=yes\">Logout</a></li>\n");
      out.write("            ");
 if(!session.getAttribute("userId").equals("1")) {
      out.write("\n");
      out.write("            \n");
      out.write("            <li><a href=\"EditForm.jsp\">Edit Profile</a></li>\n");
      out.write("            <li><a href=\"booked-car.jsp\">View Booking</a></li>\n");
      out.write("            <li><a href=\"uploaddocs.jsp\">Upload document</a></li>\n");
      out.write("             <li><a href=\"viewdocs.jsp\">view document</a></li>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("          \n");
      out.write("            ");
 if (session.getAttribute("userId").equals("1")) {
      out.write("\n");
      out.write("           \n");
      out.write("            <li>\n");
      out.write("                <select class=\"dropdown\" onchange=\"location = this.value;\">\n");
      out.write("                    <option disabled [value]=\"\" selected>Admin panel</option>\n");
      out.write("<!--                    <option value=\"#view-user-accounts.jsp\">View user accounts</option>-->\n");
      out.write("<!--                    <option value=\"new mail.jsp\">New mail</option>-->\n");
      out.write("                    <option value=\"add-car.jsp\">Add car info</option>\n");
      out.write("                    <option value=\"rental-requests.jsp\">Rental request</option>\n");
      out.write("                     <option value=\"approvedlist.jsp\">Approved List</option>\n");
      out.write("                    <option value=\"available-cars.jsp\">Available cars</option>\n");
      out.write("                    <option value=\"rented-cars.jsp\">Rented cars</option>\n");
      out.write("                    <option value=\"registered-users.jsp\">Registered users </option>\n");
      out.write("                    <option value=\"remove-car.jsp\">Remove Car</option>\n");
      out.write("                </select>\n");
      out.write("           </li>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            <li><a href=\"Registration.jsp\">Register</a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            <li><a class=\"active\" href=\"home.jsp\">Home</a></li>\n");
      out.write("            <li style=\"float: left;\"><img src=\"image/logo.png\"></li>\n");
      out.write("        </ul>\n");
      out.write("        <script>\n");
      out.write("            $('#dropdown').change(function () {\n");
      out.write("                window.location = $(this).val();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        ");
 if (request.getAttribute("status") != null) {
      out.write("\n");
      out.write("        <div id=\"msg\">");
      out.print( request.getAttribute("status"));
      out.write("<br></div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("    </center>\n");
      out.write("    <div class=\"container-fluid px-1 px-md-5 px-lg-1 px-xl-5 py-5 mx-auto\">\n");
      out.write("        <div class=\"card card0 border-0\">\n");
      out.write("            <div class=\"row d-flex\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"card1 pb-5\">\n");
      out.write("\n");
      out.write("                        <div class=\"row px-4 justify-content-center mt-4 mb-5 border-line\"> <img src=\"image/=bmw.jpg\" class=\"image\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"card2 card border-0 px-4 py-5\">\n");
      out.write("                        <!--signin details-->\n");
      out.write("                        <div class=\"row mb-4 px-3\">\n");
      out.write("                            <h6 class=\"mb-0 mr-4 mt-2\">Sign in with</h6>\n");
      out.write("                            <div class=\"facebook text-center mr-3\">\n");
      out.write("                                <i class=\"fa fa-facebook-official\" aria-hidden=\"true\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"twitter text-center mr-3\">\n");
      out.write("                                <i class=\"fa fa-twitter\" aria-hidden=\"true\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"linkedin text-center mr-3\">\n");
      out.write("                                <i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row px-3 mb-4\">\n");
      out.write("                            <div class=\"line\"></div> <small class=\"or text-center\">Or</small>\n");
      out.write("                            <div class=\"line\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--log form-->\n");
      out.write("\n");
      out.write("                        <form id=\"log\" method=\"Post\" action=\"register\" >\n");
      out.write("                            <div class=\"row px-3\"> <label class=\"mb-1\"> Email</label> \n");
      out.write("                                <input class=\"mb-4\" type=\"text\" id=\"name\" name=\"email\" placeholder=\"Enter a valid username\"> </div>\n");
      out.write("                            <div class=\"row px-3\"> <label class=\"mb-1\">Password</label> \n");
      out.write("                                <input type=\"password\" name=\"pwd\" placeholder=\"Enter password\"> </div>\n");
      out.write("\n");
      out.write("                            <!--checkbox-->\n");
      out.write("                            <div class=\"row px-3 mb-4\">\n");
      out.write("                                <div class=\"custom-control custom-checkbox custom-control-inline\"> <input id=\"chk1\" type=\"checkbox\" name=\"chk\" class=\"custom-control-input\"> <label for=\"chk1\" class=\"custom-control-label text-sm\">Remember me</label> </div> <a href=\"forget.jsp\" class=\"ml-auto mb-0 text-sm\">Forgot Password?</a>\n");
      out.write("                            </div>\n");
      out.write("                            <!--submit-->\n");
      out.write("                            <div class=\"row mb-3 px-3\"> <button type=\"submit\"  name=\"login\" class=\"btn btn-blue text-center\">Login</button> </div>\n");
      out.write("                            <div class=\"row mb-4 px-3\"> <small class=\"font-weight-bold\">Don't have an account? <a class=\"text-danger\" href=\"Registration.jsp\">Register</a></small> </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class='footer-col-1'>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"bg-blue py-4 \">\n");
      out.write("            <h5>Copyright &copy; 2020. All rights reserved</h5><br>\n");
      out.write("            <div class=\"social-contact ml-4 ml-sm-auto\"> <span class=\"fa fa-facebook mr-4 text-sm\"></span> <span class=\"fa fa-google-plus mr-4 text-sm\"></span> <span class=\"fa fa-linkedin mr-4 text-sm\"></span> <span class=\"fa fa-twitter mr-4 mr-sm-5 text-sm\"></span> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

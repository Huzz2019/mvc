/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-22 23:46:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"WEB-INF/js/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    var queryList = function(){\n");
      out.write("        $.ajax({\n");
      out.write("            url: '/resume/query',\n");
      out.write("            type: 'POST',\n");
      out.write("            data: {},\n");
      out.write("            contentType: 'application/json;charset=utf-8',\n");
      out.write("            dataType: 'json',\n");
      out.write("            success: function (data) {\n");
      out.write("                alert(data.name);\n");
      out.write("            }\n");
      out.write("        })\n");
      out.write("    };\n");
      out.write("    $(function () {\n");
      out.write("\n");
      out.write("        $(\"#queryBtn\").bind(\"click\",function () {\n");
      out.write("            // 发送ajax请求\n");
      out.write("            $.ajax({\n");
      out.write("                url: '/resume/query',\n");
      out.write("                type: 'POST',\n");
      out.write("                data: {},\n");
      out.write("                contentType: 'application/json;charset=utf-8',\n");
      out.write("                dataType: 'json',\n");
      out.write("                success: function (data) {\n");
      out.write("                    alert(data.name);\n");
      out.write("                }\n");
      out.write("            })\n");
      out.write("\n");
      out.write("        })\n");
      out.write("\n");
      out.write("\n");
      out.write("    })\n");
      out.write("</script>\n");
      out.write("<html>\n");
      out.write("<body >\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"/resume/query\" method=\"post\">\n");
      out.write("    <input type=\"submit\" value=\"查询\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<form action=\"/resume/insert\" method=\"post\">\n");
      out.write("    id:<input type=\"text\" id=\"id\" name=\"id\"><br>\n");
      out.write("    name:<input type=\"text\" id=\"name\" name=\"name\"><br>\n");
      out.write("    address:<input type=\"text\" id=\"address\" name=\"address\"><br>\n");
      out.write("    phone:<input type=\"text\" id=\"phone\" name=\"phone\"><br>\n");
      out.write("    <input type=\"submit\" value=\"新增\"><br>\n");
      out.write("</form>\n");
      out.write("<br><br>\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"/resume/update\" method=\"post\">\n");
      out.write("    id:<input type=\"text\" id=\"uid\" name=\"id\"><br>\n");
      out.write("    name:<input type=\"text\" id=\"uname\" name=\"name\"><br>\n");
      out.write("    address:<input type=\"text\" id=\"uaddress\" name=\"address\"><br>\n");
      out.write("    phone:<input type=\"text\" id=\"uphone\" name=\"phone\"><br>\n");
      out.write("    <input type=\"submit\" value=\"修改\"><br>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2021-05-10 19:40:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class muutaasiakas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<script src=\"scripts/main.js\"></script>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.15.0/jquery.validate.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main1.css\">\r\n");
      out.write("<title>Muuta asiakas</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"tiedot\">\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<thead>\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"5\" class=\"oikealle\"><span id=\"takaisin\">Takaisin listaukseen</span></th>\r\n");
      out.write("\t\t\t</tr>\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<!--  th>Asiakastunnus</th -->\r\n");
      out.write("\t\t\t\t<th>Etunimi</th>\r\n");
      out.write("\t\t\t\t<th>Sukunimi</th>\r\n");
      out.write("\t\t\t\t<th>Puhelin</th>\r\n");
      out.write("\t\t\t\t<th>S??hk??posti</th>\r\n");
      out.write("\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<!--  td><input type=\"text\" name=\"asiakas_id\" id=\"asiakas_id\"></td -->\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"etunimi\" id=\"etunimi\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"sukunimi\" id=\"sukunimi\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"puhelin\" id=\"puhelin\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"sposti\" id=\"sposti\"></td> \r\n");
      out.write("\t\t\t\t<td><input type=\"submit\" id=\"tallenna\" value=\"Hyv??ksy\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<!--  input type=\"hidden\" name=\"vanhaasiakas_id\" id=\"vanhaasiakas_id\" -->\r\n");
      out.write("\t<input type=\"hidden\" name=\"asiakas_id\" id=\"asiakas_id\">\t\r\n");
      out.write("</form>\r\n");
      out.write("<span id=\"ilmo\"></span>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$(\"#takaisin\").click(function(){\r\n");
      out.write("\t\tdocument.location=\"listaaasiakkaat.jsp\";\r\n");
      out.write("\t});\r\n");
      out.write("\t//Haetaan muutettavan asiakkaant tiedot. Kutsutaan backin GET-metodia ja v??litet????n kutsun mukana muutettavan tiedon id\r\n");
      out.write("\t//GET /asiakkaat/haeyksi/asiakas_id\r\n");
      out.write("\tvar asiakas_id = requestURLParam(\"asiakas_id\"); //Funktio l??ytyy scripts/main.js \t\r\n");
      out.write("\t$.ajax({url:\"asiakkaat/haeyksi/\"+asiakas_id, type:\"GET\", dataType:\"json\", success:function(result){\t\r\n");
      out.write("\t\t//$(\"#vanhaasiakas_id\").val(result.asiakas_id);\r\n");
      out.write("\t\t$(\"#etunimi\").val(result.etunimi);\r\n");
      out.write("\t\t$(\"#sukunimi\").val(result.sukunimi);\r\n");
      out.write("\t\t$(\"#puhelin\").val(result.puhelin);\r\n");
      out.write("\t\t$(\"#sposti\").val(result.sposti);\r\n");
      out.write("\t\t$(\"#asiakas_id\").val(result.asiakas_id);\r\n");
      out.write("    }});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#tiedot\").validate({\t\t\t\t\t\t\r\n");
      out.write("\t\trules: {\r\n");
      out.write("\t\t\tetunimi:  {\r\n");
      out.write("\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\tminlength: 3\t\t\t\t\r\n");
      out.write("\t\t\t},\t\r\n");
      out.write("\t\t\tsukunimi:  {\r\n");
      out.write("\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\tminlength: 2\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tpuhelin:  {\r\n");
      out.write("\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\tminlength: 5\r\n");
      out.write("\t\t\t},\t\r\n");
      out.write("\t\t\tsposti:  {\r\n");
      out.write("\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\temail: true\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tmessages: {\r\n");
      out.write("\t\t\tetunimi: {     \r\n");
      out.write("\t\t\t\trequired: \"Puuttuu\",\r\n");
      out.write("\t\t\t\tminlength: \"Liian lyhyt\"\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsukunimi: {\r\n");
      out.write("\t\t\t\trequired: \"Puuttuu\",\r\n");
      out.write("\t\t\t\tminlength: \"Liian lyhyt\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tpuhelin: {\r\n");
      out.write("\t\t\t\trequired: \"Puuttuu\",\r\n");
      out.write("\t\t\t\tminlength: \"Liian lyhyt\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsposti: {\r\n");
      out.write("\t\t\t\trequired: \"Puuttuu\",\r\n");
      out.write("\t\t\t\t//number: \"Ei kelpaa\",\r\n");
      out.write("\t\t\t\temail: \"S??hk??postiosoite ei ole kelvollinen\",\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\t\t\t\r\n");
      out.write("\t\tsubmitHandler: function(form) {\t\r\n");
      out.write("\t\t\tpaivitaTiedot();\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("\t}); \t\r\n");
      out.write("});\r\n");
      out.write("//funktio tietojen p??ivitt??mist?? varten. Kutsutaan backin PUT-metodia ja v??litet????n kutsun mukana uudet tiedot json-stringin??.\r\n");
      out.write("//PUT /autot/\r\n");
      out.write("\tfunction paivitaTiedot(){\t\r\n");
      out.write("\tvar formJsonStr = formDataJsonStr($(\"#tiedot\").serializeArray()); //muutetaan lomakkeen tiedot json-stringiksi\r\n");
      out.write("\t$.ajax({url:\"asiakkaat\", data:formJsonStr, type:\"PUT\", dataType:\"json\", success:function(result) { //result on joko {\"response:1\"} tai {\"response:0\"}       \r\n");
      out.write("\t\tif(result.response==0){\r\n");
      out.write("      \t$(\"#ilmo\").html(\"Asiakkaan p??ivitt??minen ep??onnistui.\");\r\n");
      out.write("      }else if(result.response==1){\t\t\t\r\n");
      out.write("      \t$(\"#ilmo\").html(\"Asiakkaan p??ivitt??minen onnistui.\");\r\n");
      out.write("      \t$(\"#etunimi, #sukunimi, #puhelin, #sposti\").val(\"\");\r\n");
      out.write("\t  }\r\n");
      out.write("  }});\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

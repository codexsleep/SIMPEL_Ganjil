package org.apache.jsp.pic;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class beranda_005fpic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/pic/include/sidebar.jsp");
    _jspx_dependants.add("/pic/include/topbar.jsp");
    _jspx_dependants.add("/pic/include/footer.jsp");
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
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>Beranda | SIMPEL</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta content=\"A fully featured admin theme which can be used to build CRM, CMS, etc.\" name=\"description\" />\n");
      out.write("        <meta content=\"Coderthemes\" name=\"author\" />\n");
      out.write("        <!-- App favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/images/favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- App css -->\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/icons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/app.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"light-style\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/app-dark.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"dark-style\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"loading\" data-layout-config='{\"leftSideBarTheme\":\"dark\",\"layoutBoxed\":false, \"leftSidebarCondensed\":false, \"leftSidebarScrollable\":false,\"darkMode\":false, \"showRightSidebarOnStart\": true}'>\n");
      out.write("        <!-- Begin page -->\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            ");
      out.write("<!-- ========== Left Sidebar Start ========== -->\r\n");
      out.write("<div class=\"leftside-menu\">\r\n");
      out.write("\r\n");
      out.write("    <!-- LOGO -->\r\n");
      out.write("    <a href=\"index.html\" class=\"logo text-center logo-light\">\r\n");
      out.write("        <span class=\"logo-lg\">\r\n");
      out.write("            <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" height=\"16\">\r\n");
      out.write("        </span>\r\n");
      out.write("        <span class=\"logo-sm\">\r\n");
      out.write("            <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" alt=\"\" height=\"16\">\r\n");
      out.write("        </span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- LOGO -->\r\n");
      out.write("    <a href=\"index.html\" class=\"logo text-center logo-dark\">\r\n");
      out.write("        <span class=\"logo-lg\">\r\n");
      out.write("            <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" alt=\"\" height=\"16\">\r\n");
      out.write("        </span>\r\n");
      out.write("        <span class=\"logo-sm\">\r\n");
      out.write("            <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" alt=\"\" height=\"16\">\r\n");
      out.write("        </span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"h-100\" id=\"leftside-menu-container\" data-simplebar>\r\n");
      out.write("\r\n");
      out.write("        <!--- Sidemenu -->\r\n");
      out.write("        <ul class=\"side-nav\">\r\n");
      out.write("\r\n");
      out.write("            <li class=\"side-nav-title side-nav-item text-center\">Navigation</li>\r\n");
      out.write("            <li class=\"side-nav-item\">\r\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/mahasiswa/beranda_pic.jsp\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"uil-home-alt\"></i>\r\n");
      out.write("                    <span> Beranda </span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"side-nav-item\">\r\n");
      out.write("                <a data-bs-toggle=\"collapse\" href=\"#peminjaman\" aria-expanded=\"false\" aria-controls=\"quiz\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"uil-package\"></i>\r\n");
      out.write("                    <span> Peminjaman </span>\r\n");
      out.write("                    <span class=\"menu-arrow\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"collapse\" id=\"peminjaman\">\r\n");
      out.write("                    <ul class=\"side-nav-second-level\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"http://localhost:8080/SIMPEL_Ganjil/pic/konfirmasi_peminjaman.jsp\">Konfirmasi Peminjaman</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"http://localhost:8080/SIMPEL_Ganjil/pic/status_peminjaman.jsp\">Status Peminjaman</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"http://localhost:8080/SIMPEL_Ganjil/pic/kelola_lab.jsp\">Kelola Lab</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"http://localhost:8080/SIMPEL_Ganjil/pic/data_peminjaman.jsp\">Data Peminjaman</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"side-nav-item\">\r\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/mahasiswa/datalab.jsp\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"mdi mdi-office-building\"></i>\r\n");
      out.write("                    <span> Data Lab </span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"side-nav-item\">\r\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/mahasiswa/laporan.jsp\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"mdi mdi-trophy\"></i>\r\n");
      out.write("                    <span> Laporan </span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"side-nav-item\">\r\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/mahasiswa/panduan.jsp\" class=\"side-nav-link\">\r\n");
      out.write("                    <i class=\"mdi mdi-help-circle\"></i>\r\n");
      out.write("                    <span> Panduan </span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- End Sidebar -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Sidebar -left -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Left Sidebar End -->");
      out.write("\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- Start Page Content here -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("\n");
      out.write("            <div class=\"content-page\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                ");
      out.write("  <!-- Topbar Start -->\r\n");
      out.write("  <div class=\"navbar-custom\">\r\n");
      out.write("                        <ul class=\"list-unstyled topbar-menu float-end mb-0\">\r\n");
      out.write("                            <li class=\"dropdown notification-list\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle nav-user arrow-none me-0\" data-bs-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"false\"\r\n");
      out.write("                                    aria-expanded=\"false\">\r\n");
      out.write("                                    <span class=\"account-user-avatar\"> \r\n");
      out.write("                                        <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/users/avatar-1.jpg\" alt=\"user-image\" class=\"rounded-circle\">\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <span>\r\n");
      out.write("                                        <span class=\"account-user-name\">Kelompok 1</span>\r\n");
      out.write("                                        <span class=\"account-position\">Mahasiswa</span>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-end dropdown-menu-animated topbar-dropdown-menu profile-dropdown\">\r\n");
      out.write("                                    <!-- item-->\r\n");
      out.write("                                    <a href=\"http://localhost:8080/SIMPEL_Ganjil/admin/auth/logout\" class=\"dropdown-item notify-item\">\r\n");
      out.write("                                        <i class=\"mdi mdi-logout me-1\"></i>\r\n");
      out.write("                                        <span>Logout</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <button class=\"button-menu-mobile open-left\">\r\n");
      out.write("                            <i class=\"mdi mdi-menu\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- end Topbar -->");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- Start Content-->\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"page-title-box\">\n");
      out.write("                                    <div class=\"page-title-right\">\n");
      out.write("                                        <ol class=\"breadcrumb m-0\">\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"javascript: void(0);\">SIMPEL</a></li>\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"javascript: void(0);\">PIC</a></li>\n");
      out.write("                                            <li class=\"breadcrumb-item active\">Beranda</li>\n");
      out.write("                                        </ol>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h4 class=\"page-title\">Beranda SIMPEL</h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end page title --> \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <!--Disini Konten-->\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div> <!-- container -->\n");
      out.write("\n");
      out.write("                </div> <!-- content -->\n");
      out.write("             ");
      out.write("\r\n");
      out.write("                <!-- Footer Start -->\r\n");
      out.write("                <footer class=\"footer\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <script>document.write(new Date().getFullYear())</script> ?? SIMPEL - Development by Ganjil 2TID\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <div class=\"text-md-end footer-links d-none d-md-block\">\r\n");
      out.write("                                    <a href=\"https://github.com/FannyLim001/SIMPEL_Ganjil\">Developer Page</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </footer>\r\n");
      out.write("                <!-- end Footer -->");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- End Page content -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- END wrapper -->\n");
      out.write("\n");
      out.write("        <div class=\"rightbar-overlay\"></div>\n");
      out.write("        <!-- /End-bar -->\n");
      out.write("\n");
      out.write("        <!-- bundle -->\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor.min.js\"></script>\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/app.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- third party js -->\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/Chart.bundle.min.js\"></script>\n");
      out.write("        <!-- third party js ends -->\n");
      out.write("\n");
      out.write("        <!-- demo app -->\n");
      out.write("        <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.dashboard-projects.js\"></script>\n");
      out.write("        <!-- end demo js-->\n");
      out.write("\n");
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

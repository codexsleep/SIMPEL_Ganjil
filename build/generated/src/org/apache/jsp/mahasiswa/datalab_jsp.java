package org.apache.jsp.mahasiswa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import models.mahasiswa.Datalab;

public final class datalab_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/mahasiswa/include/sidebar.jsp");
    _jspx_dependants.add("/mahasiswa/include/topbar.jsp");
    _jspx_dependants.add("/mahasiswa/include/footer.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>Data Lab | SIMPEL Mahasiswa</title>\n");
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
      out.write("        <!-- third party css -->\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/dataTables.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/responsive.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/buttons.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/select.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- third party css end -->\n");
      out.write("\n");
      out.write("        <!-- Datatables css -->\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/dataTables.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/responsive.bootstrap5.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"loading\" data-layout-config='{\"leftSideBarTheme\":\"dark\",\"layoutBoxed\":false, \"leftSidebarCondensed\":false, \"leftSidebarScrollable\":false,\"darkMode\":false, \"showRightSidebarOnStart\": true}'>\n");
      out.write("        <!-- Begin page -->\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            ");
      out.write("  <!-- ========== Left Sidebar Start ========== -->\n");
      out.write("  <div class=\"leftside-menu\">\n");
      out.write("    \n");
      out.write("    <!-- LOGO -->\n");
      out.write("    <a href=\"index.html\" class=\"logo text-center logo-light\">\n");
      out.write("        <span class=\"logo-lg\">\n");
      out.write("            <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" height=\"16\">\n");
      out.write("        </span>\n");
      out.write("        <span class=\"logo-sm\">\n");
      out.write("            <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" alt=\"\" height=\"16\">\n");
      out.write("        </span>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- LOGO -->\n");
      out.write("    <a href=\"index.html\" class=\"logo text-center logo-dark\">\n");
      out.write("        <span class=\"logo-lg\">\n");
      out.write("            <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" alt=\"\" height=\"16\">\n");
      out.write("        </span>\n");
      out.write("        <span class=\"logo-sm\">\n");
      out.write("            <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png\" alt=\"\" height=\"16\">\n");
      out.write("        </span>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <div class=\"h-100\" id=\"leftside-menu-container\" data-simplebar>\n");
      out.write("\n");
      out.write("        <!--- Sidemenu -->\n");
      out.write("        <ul class=\"side-nav\">\n");
      out.write("\n");
      out.write("            <li class=\"side-nav-title side-nav-item text-center\">Navigation</li>\n");
      out.write("            <li class=\"side-nav-item\">\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/mahasiswa/beranda.jsp\" class=\"side-nav-link\">\n");
      out.write("                <i class=\"uil-home-alt\"></i>\n");
      out.write("                <span> Beranda </span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("             <li class=\"side-nav-item\">\n");
      out.write("                            <a data-bs-toggle=\"collapse\" href=\"#peminjaman\" aria-expanded=\"false\" aria-controls=\"quiz\" class=\"side-nav-link\">\n");
      out.write("                            <i class=\"uil-package\"></i>\n");
      out.write("                            <span> Peminjaman </span>\n");
      out.write("                            <span class=\"menu-arrow\"></span>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"collapse\" id=\"peminjaman\">\n");
      out.write("                        <ul class=\"side-nav-second-level\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"http://localhost:8080/SIMPEL_Ganjil/mahasiswa/pengajuan_peminjaman.jsp\">Pengajuan Peminjaman</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"http://localhost:8080/SIMPEL_Ganjil/mahasiswa/log_peminjaman.jsp\">Log Peminjaman</a>\n");
      out.write("                       </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("          <li class=\"side-nav-item\">\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/mahasiswa/datalab.jsp\" class=\"side-nav-link\">\n");
      out.write("                    <i class=\"mdi mdi-office-building\"></i>\n");
      out.write("                        <span> Data Lab </span>\n");
      out.write("               </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"side-nav-item\">\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/mahasiswa/laporan.jsp\" class=\"side-nav-link\">\n");
      out.write("                    <i class=\"mdi mdi-trophy\"></i>\n");
      out.write("                        <span> Laporan </span>\n");
      out.write("               </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"side-nav-item\">\n");
      out.write("                <a href=\"http://localhost:8080/SIMPEL_Ganjil/mahasiswa/panduan.jsp\" class=\"side-nav-link\">\n");
      out.write("                    <i class=\"mdi mdi-help-circle\"></i>\n");
      out.write("                        <span> Panduan </span>\n");
      out.write("               </a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- End Sidebar -->\n");
      out.write("\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- Sidebar -left -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- Left Sidebar End -->");
      out.write("\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- Start Page Content here -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("\n");
      out.write("            <div class=\"content-page\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    ");
      out.write("  <!-- Topbar Start -->\n");
      out.write("  <div class=\"navbar-custom\">\n");
      out.write("                        <ul class=\"list-unstyled topbar-menu float-end mb-0\">\n");
      out.write("                            <li class=\"dropdown notification-list\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle nav-user arrow-none me-0\" data-bs-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"false\"\n");
      out.write("                                    aria-expanded=\"false\">\n");
      out.write("                                    <span class=\"account-user-avatar\"> \n");
      out.write("                                        <img src=\"http://localhost:8080/SIMPEL_Ganjil/assets/images/users/avatar-1.jpg\" alt=\"user-image\" class=\"rounded-circle\">\n");
      out.write("                                    </span>\n");
      out.write("                                    <span>\n");
      out.write("                                        <span class=\"account-user-name\">M Firman Raiwan</span>\n");
      out.write("                                        <span class=\"account-position\">Mahasiswa</span>\n");
      out.write("                                    </span>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-end dropdown-menu-animated topbar-dropdown-menu profile-dropdown\">\n");
      out.write("                                    <!-- item-->\n");
      out.write("                                    <a href=\"http://localhost:8080/SIMPEL_Ganjil/admin/auth/logout\" class=\"dropdown-item notify-item\">\n");
      out.write("                                        <i class=\"mdi mdi-logout me-1\"></i>\n");
      out.write("                                        <span>Logout</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <button class=\"button-menu-mobile open-left\">\n");
      out.write("                            <i class=\"mdi mdi-menu\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
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
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"javascript: void(0);\">Mahasiswa</a></li>\n");
      out.write("                                            <li class=\"breadcrumb-item active\">Datalab</li>\n");
      out.write("                                        </ol>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h4 class=\"page-title\">Data Lab</h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end page title --> \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"tab-content\">\n");
      out.write("                                            <div class=\"tab-pane show active\" id=\"basic-datatable-preview\">\n");
      out.write("                                                <table id=\"basic-datatable\" class=\"table dt-responsive nowrap w-100\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <th>No Lab</th>\n");
      out.write("                                                            <th>Nama</th>\n");
      out.write("                                                            <th>Kapasitas</th>\n");
      out.write("                                                            <th>PIC</th>\n");
      out.write("                                                            <th>Kalab</th>\n");
      out.write("                                                            <th>Action</th>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    <tbody>\n");
      out.write("                                                        ");

                                                            Datalab km = new Datalab();
                                                            List<Datalab> data = new ArrayList<Datalab>();
                                                            String ket = request.getParameter("id_lab");
                                                            if (ket == null) {
                                                                data = km.tampil();
                                                            }
                                                            for (int x = 0; x < data.size(); x++) {
                                                                int idpic = data.get(x).getIdpiclab();
                                                                List<Datalab> datapic = new ArrayList<Datalab>();
                                                                datapic = km.getPic(idpic);

                                                                int idkalab = data.get(x).getIdkalablab();
                                                                List<Datalab> datakalab = new ArrayList<Datalab>();
                                                                datakalab = km.getKalab(idkalab);

                                                                int idpeminjaman = data.get(x).getId_lab();
                                                                List<Datalab> datapeminjaman = new ArrayList<Datalab>();
                                                                datapeminjaman = km.getPeminjaman(idpeminjaman);
                                                        
      out.write("\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>");
      out.print(data.get(x).getNolab());
      out.write("</td>\n");
      out.write("                                                            <td>");
      out.print(data.get(x).getNamalab());
      out.write("</td>\n");
      out.write("                                                            <td>");
      out.print(data.get(x).getKapasitaslab());
      out.write(" Orang</td>\n");
      out.write("                                                            <td>");
      out.print(datapic.get(0).getNamapic());
      out.write("</td>\n");
      out.write("                                                            <td>");
      out.print(datakalab.get(0).getNama_kalab());
      out.write("</td>\n");
      out.write("                                                            <td><button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#centermodal");
      out.print( x);
      out.write("\">Detail</button></td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    <div class=\"modal fade\" id=\"centermodal");
      out.print( x);
      out.write("\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("                                                        <div class=\"modal-dialog\">\n");
      out.write("                                                            <div class=\"modal-content\">\n");
      out.write("                                                                <div class=\"modal-header\">\n");
      out.write("                                                                    <h4 class=\"modal-title\" id=\"myCenterModalLabel\">Detail Lab ");
      out.print(data.get(x).getNolab());
      out.write("</h4>\n");
      out.write("                                                                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-hidden=\"true\"></button>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"modal-body\">\n");
      out.write("                                                                    <p>Nama Lab : ");
      out.print(data.get(x).getNamalab());
      out.write("</p>\n");
      out.write("                                                                    <p>No Lab : ");
      out.print(data.get(x).getNolab());
      out.write("</p>\n");
      out.write("                                                                    <p>Kepala Lab</p>\n");
      out.write("                                                                    <ul>\n");
      out.write("                                                                        <li>Nama  : ");
      out.print(datakalab.get(0).getNama_kalab());
      out.write("</li>\n");
      out.write("                                                                        <li>Ruangan Kalab : ");
      out.print(datakalab.get(0).getRuangkalab());
      out.write("</li>\n");
      out.write("                                                                        <li>Kontak Kalab : ");
      out.print(datakalab.get(0).getKontakkalab());
      out.write("</li>\n");
      out.write("                                                                    </ul>\n");
      out.write("                                                                    <p>PIC Lab</p>\n");
      out.write("                                                                    <ul>\n");
      out.write("                                                                        <li>Nama PIC : ");
      out.print(datapic.get(0).getNamapic());
      out.write("</li>\n");
      out.write("                                                                        <li>Ruangan PIC : ");
      out.print(datapic.get(0).getRuangpic());
      out.write("</li>\n");
      out.write("                                                                        <li>Kontak PIC : ");
      out.print(datapic.get(0).getKontakpic());
      out.write("</li>\n");
      out.write("                                                                    </ul>\n");
      out.write("                                                                    ");

                                                                        String hasil;
                                                                        if (datapeminjaman.isEmpty()) {
                                                                            hasil = "Tersedia";
                                                                        } else {
                                                                    
      out.write("\n");
      out.write("                                                                    ");

                                                                            hasil = "Tidak Tersedia";
                                                                        }
                                                                    
      out.write("\n");
      out.write("                                                                    <p>Status Lab : ");
      out.print(hasil);
      out.write("</p>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div><!-- /.modal-content -->\n");
      out.write("                                                        </div><!-- /.modal-dialog -->\n");
      out.write("                                                    </div><!-- /.modal -->\n");
      out.write("                                                    ");
}
      out.write("\n");
      out.write("                                                    </tbody>\n");
      out.write("                                                </table>                                           \n");
      out.write("                                            </div> <!-- end preview-->\n");
      out.write("                                        </div> <!-- end card body-->\n");
      out.write("                                    </div> <!-- end card -->\n");
      out.write("                                </div><!-- end col-->\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div> <!-- container -->\n");
      out.write("\n");
      out.write("                    </div> <!-- content -->\n");
      out.write("                    ");
      out.write("\n");
      out.write("                <!-- Footer Start -->\n");
      out.write("                <footer class=\"footer\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <script>document.write(new Date().getFullYear())</script> ?? SIMPEL - Development by Ganjil 2TID\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"text-md-end footer-links d-none d-md-block\">\n");
      out.write("                                    <a href=\"https://github.com/FannyLim001/SIMPEL_Ganjil\">Developer Page</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("                <!-- end Footer -->");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- End Page content -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- END wrapper -->\n");
      out.write("\n");
      out.write("            <div class=\"rightbar-overlay\"></div>\n");
      out.write("            <!-- /End-bar -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- bundle -->\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/app.min.js\"></script>\n");
      out.write("\n");
      out.write("            <!-- third party js -->\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/jquery.dataTables.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.bootstrap5.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.responsive.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/responsive.bootstrap5.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.buttons.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.bootstrap5.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.html5.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.flash.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.print.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.keyTable.min.js\"></script>\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.select.min.js\"></script>\n");
      out.write("            <!-- third party js ends -->\n");
      out.write("\n");
      out.write("            <!-- demo app -->\n");
      out.write("            <script src=\"http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.datatable-init.js\"></script>\n");
      out.write("            <!-- end demo js-->\n");
      out.write("\n");
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

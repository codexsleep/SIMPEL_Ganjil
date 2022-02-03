<%-- 
    Document   : beranda
    Created on : Jan 26, 2022, 12:09:06 PM
    Author     : M Firman Raiwan
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="models.mahasiswa.Datalab"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>Data Lab | SIMPEL Mahasiswa</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="assets/images/favicon.ico">

        <!-- App css -->
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/app.min.css" rel="stylesheet" type="text/css" id="light-style" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/app-dark.min.css" rel="stylesheet" type="text/css" id="dark-style" />

        <!-- third party css -->
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/dataTables.bootstrap5.css" rel="stylesheet" type="text/css" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/responsive.bootstrap5.css" rel="stylesheet" type="text/css" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/buttons.bootstrap5.css" rel="stylesheet" type="text/css" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/select.bootstrap5.css" rel="stylesheet" type="text/css" />
        <!-- third party css end -->

        <!-- Datatables css -->
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/dataTables.bootstrap5.css" rel="stylesheet" type="text/css" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/responsive.bootstrap5.css" rel="stylesheet" type="text/css" />
    </head>

    <body class="loading" data-layout-config='{"leftSideBarTheme":"dark","layoutBoxed":false, "leftSidebarCondensed":false, "leftSidebarScrollable":false,"darkMode":false, "showRightSidebarOnStart": true}'>
        <!-- Begin page -->
        <div class="wrapper">
            <%@include file="include/sidebar.jsp" %>
            <!-- ============================================================== -->
            <!-- Start Page Content here -->
            <!-- ============================================================== -->

            <div class="content-page">
                <div class="content">
                    <%@include file="include/topbar.jsp" %>

                    <!-- Start Content-->
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-12">
                                <div class="page-title-box">
                                    <div class="page-title-right">
                                        <ol class="breadcrumb m-0">
                                            <li class="breadcrumb-item"><a href="javascript: void(0);">SIMPEL</a></li>
                                            <li class="breadcrumb-item"><a href="javascript: void(0);">Mahasiswa</a></li>
                                            <li class="breadcrumb-item active">Datalab</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Data Lab</h4>
                                </div>
                            </div>
                        </div>
                        <!-- end page title --> 
                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="tab-content">
                                            <div class="tab-pane show active" id="basic-datatable-preview">
                                                <table id="basic-datatable" class="table dt-responsive nowrap w-100">
                                                    <thead>
                                                        <tr>
                                                            <th>No Lab</th>
                                                            <th>Nama</th>
                                                            <th>Kapasitas</th>
                                                            <th>PIC</th>
                                                            <th>Kalab</th>
                                                            <th>Action</th>
                                                        </tr>
                                                    </thead>


                                                    <tbody>
                                                        <%
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
                                                        %>
                                                        <tr>
                                                            <td><%=data.get(x).getNolab()%></td>
                                                            <td><%=data.get(x).getNamalab()%></td>
                                                            <td><%=data.get(x).getKapasitaslab()%> Orang</td>
                                                            <td><%=datapic.get(0).getNamapic()%></td>
                                                            <td><%=datakalab.get(0).getNama_kalab()%></td>
                                                            <td><button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#centermodal<%= x%>">Detail</button></td>
                                                        </tr>
                                                    <div class="modal fade" id="centermodal<%= x%>" tabindex="-1" role="dialog" aria-hidden="true">
                                                        <div class="modal-dialog">
                                                            <div class="modal-content">
                                                                <div class="modal-header">
                                                                    <h4 class="modal-title" id="myCenterModalLabel">Detail Lab <%=data.get(x).getNolab()%></h4>
                                                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-hidden="true"></button>
                                                                </div>
                                                                <div class="modal-body">
                                                                    <p>Nama Lab : <%=data.get(x).getNamalab()%></p>
                                                                    <p>No Lab : <%=data.get(x).getNolab()%></p>
                                                                    <p>Kepala Lab</p>
                                                                    <ul>
                                                                        <li>Nama  : <%=datakalab.get(0).getNama_kalab()%></li>
                                                                        <li>Ruangan Kalab : <%=datakalab.get(0).getRuangkalab()%></li>
                                                                        <li>Kontak Kalab : <%=datakalab.get(0).getKontakkalab()%></li>
                                                                    </ul>
                                                                    <p>PIC Lab</p>
                                                                    <ul>
                                                                        <li>Nama PIC : <%=datapic.get(0).getNamapic()%></li>
                                                                        <li>Ruangan PIC : <%=datapic.get(0).getRuangpic()%></li>
                                                                        <li>Kontak PIC : <%=datapic.get(0).getKontakpic()%></li>
                                                                    </ul>
                                                                    <%
                                                                        String hasil;
                                                                        if (datapeminjaman.isEmpty()) {
                                                                            hasil = "Tersedia";
                                                                        } else {
                                                                    %>
                                                                    <%
                                                                            hasil = "Tidak Tersedia";
                                                                        }
                                                                    %>
                                                                    <p>Status Lab : <%=hasil%></p>
                                                                </div>
                                                            </div><!-- /.modal-content -->
                                                        </div><!-- /.modal-dialog -->
                                                    </div><!-- /.modal -->
                                                    <%}%>
                                                    </tbody>
                                                </table>                                           
                                            </div> <!-- end preview-->
                                        </div> <!-- end card body-->
                                    </div> <!-- end card -->
                                </div><!-- end col-->
                            </div>

                        </div> <!-- container -->

                    </div> <!-- content -->
                    <%@include file="include/footer.jsp" %>

                </div>

                <!-- ============================================================== -->
                <!-- End Page content -->
                <!-- ============================================================== -->

            </div>
            <!-- END wrapper -->

            <div class="rightbar-overlay"></div>
            <!-- /End-bar -->


            <!-- bundle -->
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor.min.js"></script>
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/app.min.js"></script>

            <!-- third party js -->
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/jquery.dataTables.min.js"></script>
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.bootstrap5.js"></script>
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.responsive.min.js"></script>
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/responsive.bootstrap5.min.js"></script>
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.buttons.min.js"></script>
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.bootstrap5.min.js"></script>
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.html5.min.js"></script>
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.flash.min.js"></script>
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.print.min.js"></script>
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.keyTable.min.js"></script>
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.select.min.js"></script>
            <!-- third party js ends -->

            <!-- demo app -->
            <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.datatable-init.js"></script>
            <!-- end demo js-->


    </body>
</html>

<%-- 
    Document   : beranda
    Created on : Jan 26, 2022, 12:09:06 PM
    Author     : M Firman Raiwan
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>Pengajuan Peminjaman | SIMPEL Mahasiswa</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="assets/images/favicon.ico">

        <!-- App css -->
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/app.min.css" rel="stylesheet" type="text/css" id="light-style" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/app-dark.min.css" rel="stylesheet" type="text/css" id="dark-style" />

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
                                            <li class="breadcrumb-item active">Pengajuan Peminjaman</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Pengajuan Peminjaman</h4>
                                </div>
                            </div>
                        </div>
                        <!-- end page title --> 
                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <form>
                                            <div class="mb-3">
                                                <label for="simpleinput" class="form-label">Nomor Ruangan Lab </label>
                                                <input type="text" id="simpleinput" class="form-control">
                                            </div>
                                        </form>
                                        <form>
                                            <div class="mb-3">
                                                <label for="simpleinput" class="form-label">Nama Ketua Kegiatan</label>
                                                <input type="text" id="simpleinput" class="form-control">
                                            </div>
                                        </form>
                                        <form>
                                            <div class="mb-3">
                                                <label for="example-select" class="form-label">Level Peminjaman</label>
                                                <select class="form-select" id="example-select">
                                                    <option> Pilihan </option>
                                                    <option>1. Jam Kerja  </option>
                                                    <option>2. Luar Jam Kerja</option>
                                                    <option>3. Weekend</option>
                                                </select>
                                            </div>
                                        </form>
                                        <form>
                                            <div class="mb-3">
                                                <label for="example-date" class="form-label">Tanggal Pemakaian</label>
                                                <input class="form-control" id="example-date" type="date" name="date">
                                            </div>
                                        </form>
                                        <form>
                                            <div class="mb-3">
                                                <label for="example-date" class="form-label">Tanggal Berakhir</label>
                                                <input class="form-control" id="example-date" type="date" name="date">
                                            </div>
                                            <div class="mb-3">
                                                <label for="example-time" class="form-label">Waktu Berakhir</label>
                                                <input class="form-control" id="example-time" type="time" name="time">
                                            </div>
                                        </form>
                                        <form>
                                            <div class="mb-3">
                                                <label for="example-email" class="form-label">E-mail Ketua Kegiatan</label>
                                                <input type="email" id="example-email" name="example-email" class="form-control" placeholder="Email">
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
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
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/Chart.bundle.min.js"></script>
        <!-- third party js ends -->

        <!-- demo app -->
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.dashboard-projects.js"></script>
        <!-- end demo js-->

    </body>
</html>

<%-- 
    Document   : Indice_JSP
    Created on : 27 de mai. de 2026, 10:58:27
    Author     : arauj
--%>

<%@page import="java.util.Date"%>
<%@page import="java.net.InetAddress"%>
<%@page import="contador.Contador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            p{
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <h1>Hello World </h1>
        <h2>
            <% Date today = new Date(); 
                out.print(today);
            %>
        </h2>
        <p>
            <% InetAddress localHost = InetAddress.getLocalHost(); 
                out.print(localHost);
            %>
        </p>
        <p>
            <% String hostName = localHost.getHostName(); 
                out.print(hostName);
            %>
        </p>
        <p>
            <% String hostAddress = localHost.getHostAddress();
                out.print(hostAddress);
            %>
        </p>
    </body>
</html>

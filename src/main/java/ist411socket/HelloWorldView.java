/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist411socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author ajl5735
 */
public class HelloWorldView {

    private StringBuilder html = new StringBuilder();

    public HelloWorldView() {
   
    }

    public String getHtml() {
             html.append("<html><h1>Web Page</h1><br>");
        html.append("<b>Hello World!</b><BR>");
        html.append("</html>");
        return html.toString();
    }
    
    
//    public void sendResponse(Socket socket,
//            int statusCode, String html) {
//        String statusLine;
//        String serverHeader = "Server: WebServer\r\n";
//        String contentTypeHeader = "Content-Type: text/html\r\n";
//
//        try (DataOutputStream out
//                = new DataOutputStream(socket.getOutputStream());) {
//            System.out.println("Status Code :" + statusCode);
//            if (statusCode == 200) {
//                System.out.println("starting get");
//                statusLine = "HTTP/1.1 200 OK" + "\r\n";
//                String contentLengthHeader = "Content-Length: "
//                        + html.length() + "\r\n";
//
////                out.writeBytes("HTTP/1.0 200 OK\n\n");
////                out.writeBytes("HTML");
////                out.writeBytes("\n");
//                out.writeBytes(statusLine);
//                out.writeBytes(serverHeader);
//                out.writeBytes(contentTypeHeader);
//                out.writeBytes(contentLengthHeader);
//                out.writeBytes("\r\n");
//                out.writeBytes(html);
//
//            } else if (statusCode == 405) {
//                statusLine = "HTTP/1.0 405 Method Not Allowed" + "\r\n";
//                out.writeBytes(statusLine);
//                out.writeBytes("\r\n");
//            } else {
//                statusLine = "HTTP/1.0 404 Not Found" + "\r\n";
//                out.writeBytes(statusLine);
//                out.writeBytes("\r\n");
//            }
//
//            out.close();
//        } catch (IOException ex) {
//            // Handle exception
//        }
//    }
}

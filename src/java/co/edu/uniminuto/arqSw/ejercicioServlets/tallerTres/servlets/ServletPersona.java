/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.ejercicioServlets.tallerTres.servlets;

import co.edu.uniminuto.arqSw.ejercicioServlets.tallerTres.vos.FormularioPersonaVo;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @autores
 * Cesar Ramirez == 378938
 * Lizeth Castro == 310894
 */

public class ServletPersona extends HttpServlet {

    
    private FormularioPersonaVo miForm;
    DecimalFormat formateador = new DecimalFormat("###,###.##");
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String nombreCarrera;
        
        switch (miForm.getCarrera()) {

            case 1:

                nombreCarrera = "Administracion de empresas";
            break;

            case 2:

                nombreCarrera = "Ingenieria de sistemas";
            break;
			
            case 3:
                
                nombreCarrera = "Matematicas";
            break;
                
            default:
                    
                nombreCarrera = "ninguna";
            break;    

        }        
    
        try {
            /* TODO output your page here. You may use following sample code. */   
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>TALLER SERLVET-RESPONSE</title>");            
            out.println("</head>");            
            out.println("<body>");
            out.println("<h1>TALLER SERVLET</h1><br>");
            out.println("<form action='ServletPersona' method='POST'>");
            out.println(" Nombre:<br>");
            out.println("<input type ='text' name='nombre'></input><br>");
            out.println(" <br>");
            out.println("Edad<br>");
            out.println("<input type ='text' name='edad' onblur='validarEdad(event)'></input><br>");
            out.println(" <br>");
            out.println(" Carrera<br><br>");
            out.println("<select name='carrera'>");
            out.println("<option>Seleccione Carrera</option>");
            out.println("<option value='1' >Administracion de empresas</option>");
            out.println("<option value='2'>Ingenieria de sistemas</option> ");
            out.println("<option value='3'>Matematicas</option><br> ");
            out.println("</select> <br><br>");
            out.println("<div id='ingresoMes' style='display: none'>");
            out.println("Ingreso mensual: <br><br>");
            out.println("<input type ='text' name='ingresoMensual'></input>");
            out.println("</div>");
            out.println("<script>");
            out.println("function validarEdad(e) {");
            out.println("var edad = e.target;");
            out.println("var ingresoMes = document.getElementById('ingresoMes');");
            out.println("if (edad.value > 21) {");
            out.println("ingresoMes.style.display = 'block';");
	    out.println("}");
            out.println("}");
            out.println("</script> "); 
            out.println(" <br>");
            out.println(" <br>");
            out.println("<input type='submit' /> ");           
            out.println("</form>");
            out.println(" <br>");
            out.println(" <br>");
            out.println(" <br>");
            out.println("<h1>Hola Sr(a) " + miForm.getNombre() + " ,usted escogio " + nombreCarrera + "</h1><br>");   
            out.println("<h1>El costo es de $ " + formateador.format(miForm.getValorCarrera()) + "</h1>");    
            out.println("</body>");
            out.println("</html>");
            
            
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             
            String nombre = request.getParameter("nombre");
            int edad = Integer.parseInt(request.getParameter("edad"));
            int carrera = Integer.parseInt(request.getParameter("carrera"));            
            double ingresoMensual;
            
            if ( request.getParameter("ingresoMensual") == ""){
                
                ingresoMensual = 0 ;                
            }else {
                
            ingresoMensual = Double.parseDouble(request.getParameter("ingresoMensual"));
            }
            
            double valorCarrera = 0 ;           
            
            switch (carrera) {

            case 1:

                valorCarrera = 2200000 ;
                
                    if ( ingresoMensual > 0 ){

                    valorCarrera = valorCarrera - (2200000 * 0.10) ;				
                    }

                    break;
			
            case 2:

                valorCarrera = 2700000 ;
	
                    if ( ingresoMensual > 0 ){

                    valorCarrera = valorCarrera - (2700000 * 0.10) ;				
                    }

                    break;
			
            case 3:

                valorCarrera = 3500000 ;
                
                    if ( ingresoMensual > 0 ){

                    valorCarrera = valorCarrera - (3500000 * 0.10);				
                    }
                    
                    break;
                
           default:
                    
                valorCarrera = 0 ;
                
               break;    

        }    
        
        miForm = new FormularioPersonaVo (nombre,edad,carrera,valorCarrera,ingresoMensual );
        
         processRequest(request, response);
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    
    
    
    
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

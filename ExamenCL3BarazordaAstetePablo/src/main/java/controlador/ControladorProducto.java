package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClassProducto;
import model.TblProductocl3;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// TODO Auto-generated method stub
        // response.getWriter().append("Served at: ").append(request.getContextPath());
        TblProductocl3 producto = new TblProductocl3();
        ClassProducto crud = new ClassProducto();
        List<TblProductocl3> listadopro = crud.ListarProducto();
        request.setAttribute("listadodeproductos", listadopro);

        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "Modificar":
                    int codigo = Integer.parseInt(request.getParameter("cod"));
                    producto.setIdproductocl3(codigo);
                    TblProductocl3 buscarcod = crud.BuscarProducto(producto);

                    // actualizar
                    request.setAttribute("codigo", buscarcod.getIdproductocl3());
                    request.setAttribute("nombre", buscarcod.getNombrecl3());
                    request.setAttribute("precio", buscarcod.getPreciocompracl3());
                    request.setAttribute("precio_venta", buscarcod.getPrecioventacl3());
                    request.setAttribute("estado", buscarcod.getEstadocl3());
                    request.setAttribute("descripcion", buscarcod.getDescripcl3());

                    // Redirige al formulario de actualizaci�n
                    request.getRequestDispatcher("/FormActualizarProducto.jsp").forward(request, response);
                    return; // Sal del m�todo despu�s de redirigir
		}
		}
			//request.getRequestDispatcher("/FormActualizarProducto.jsp").forward(request, response);
	} // fin del metodo doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
        String nombre = request.getParameter("nombre");
        String precio = request.getParameter("precio");
        String precioventa = request.getParameter("precio_venta");
        String estado = request.getParameter("estado");
        String descripcion = request.getParameter("descripcion");

        TblProductocl3 producto = new TblProductocl3();
        producto.setNombrecl3(nombre);
        producto.setPreciocompracl3(Double.parseDouble(precio));
        producto.setPrecioventacl3(Double.parseDouble(precioventa));
        producto.setEstadocl3(estado);
        producto.setDescripcl3(descripcion);

        ClassProducto crud = new ClassProducto();
        crud.RegistrarProducto(producto);

        List<TblProductocl3> listadoproducto = crud.ListarProducto();
        request.setAttribute("listadodeproductos", listadoproducto);
        request.getRequestDispatcher("/ListadoRegistroProducto.jsp").forward(request, response);
	} // fin del metodo doPost

} // fin del controlador

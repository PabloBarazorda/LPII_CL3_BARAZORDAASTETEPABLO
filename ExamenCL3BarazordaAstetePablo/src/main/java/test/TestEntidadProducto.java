package test;

import java.util.List;

import dao.ClassProducto;
import model.TblProductocl3;

public class TestEntidadProducto {

	public static void main(String[] args) {
		
		TblProductocl3 producto = new TblProductocl3();
		ClassProducto crud = new ClassProducto();
		
		/*
		 
		producto.setNombrecl3("Leche");
		producto.setPreciocompracl3(5);
		producto.setPrecioventacl3(3);
		producto.setEstadocl3("vigente");
		producto.setDescripcl3("oferta");
		
		//metodo registrar
		crud.RegistrarProducto(producto);

		
		 
		TblProductocl3 productodos = new TblProductocl3();
	
		productodos.setNombrecl3("Aceite");
		productodos.setPreciocompracl3(11);
		productodos.setPrecioventacl3(9);
		productodos.setEstadocl3("vigente");
		productodos.setDescripcl3("oferta");
		
		//metodo registrar
		crud.RegistrarProducto(productodos);
		
		*/
		
		// --- Actualizar ---
				/*
				producto.setIdproductocl3(3);
				producto.setNombrecl3("Leche");
				producto.setPreciocompracl3(5);
				producto.setPrecioventacl3(3);
				producto.setEstadocl3("Acabado");
				producto.setDescripcl3("oferta");
				crud.ActualizarProducto(producto);
				*/
				
				// --- Eliminar ---
				/*
				producto.setIdproductocl3(1);
				crud.EliminarProducto(producto);
				*/
				
				// --- Buscar Productos ---
				/*
				producto.setIdproductocl3(2);
				TblProductocl3 buscarpro = crud.BuscarProducto(producto);
				System.out.println("Codigo: "+buscarpro.getIdproductocl3()
				+" Nombre: "+buscarpro.getNombrecl3()+" Precio: "+buscarpro.getPreciocompracl3()
				+" Precio venta: "+buscarpro.getPrecioventacl3()+" Estado: "+buscarpro.getEstadocl3()
				+" Descripci�n: "+buscarpro.getDescripcl3());
				*/
				
		
		
				// --- Listado Productos ---
				
		/*
				
				List<TblProductocl3> listadopro = crud.ListarProducto();
				// bucle for
				for(TblProductocl3 listar:listadopro){
				
				//imprimimos los datos
				System.out.println("C�digo: "+listar.getIdproductocl3()+ " Nombre: "+listar.getNombrecl3()
				+" Precio: "+listar.getPreciocompracl3()+" Precio compra: "+listar.getPrecioventacl3()
				+" Estado: "+listar.getEstadocl3()+" Descripci�n: "+listar.getDescripcl3());
				
				} */
	}

}

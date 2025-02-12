package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProducto;
import model.TblProductocl3;

public class ClassProducto implements IProducto {

	@Override
	public void RegistrarProducto(TblProductocl3 producto) {
		// TODO Auto-generated method stub
		//establecemos conexion con la unidad persistencia
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ExamenCL3BarazordaAstetePablo");
		//permite gestionar entidades
		EntityManager em=fabr.createEntityManager();
		//iniciar transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(producto);
		//emitimos mensaje por consola
		System.out.println("producto registrado en la BD");
		//confirmamos
		em.getTransaction().commit();
		//cerramos transaccion
		em.close();		
	} // fin del metodo registrar

	@Override
	public void ActualizarProducto(TblProductocl3 producto) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ExamenCL3BarazordaAstetePablo");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//actualizamos
		emanager.merge(producto);
		//emitimos un mensaje
		System.out.println("Producto actualizado exitosamente");
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos la transaccion
		emanager.close();
		
	} 

	@Override
	public void EliminarProducto(TblProductocl3 producto) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ExamenCL3BarazordaAstetePablo");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//recuperamos el codigo a eliminar
		TblProductocl3 elim= emanager.merge(producto);
		//procedemos a eliminar
		emanager.remove(elim);
		//emitimos mensaje
		System.out.println("Producto eliminado de la BD");
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		
	}

	@Override
	public TblProductocl3 BuscarProducto(TblProductocl3 producto) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ExamenCL3BarazordaAstetePablo");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//recuperamos el codigo de buscar
		TblProductocl3 buscarpro = emanager.find(TblProductocl3.class , producto.getIdproductocl3());
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		//retornamos el producto buscado
		return buscarpro;
	}

	@Override
	public List<TblProductocl3> ListarProducto() {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ExamenCL3BarazordaAstetePablo");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//recuperamos el listado de productos de la base de datos
		//aplicamos consultas JPQL
		List<TblProductocl3> listado=emanager.createQuery("select c from TblProductocl3 c", TblProductocl3.class).getResultList();
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		//retornamos el listado
		return listado;
	}

} // fin de la clase producto

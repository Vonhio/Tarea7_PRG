package tarea8_aps;
import com.db4o.*;

public class GestorBD {
    private final String path = "Productos.yap";
    private ObjectContainer db;

    public GestorBD() {
    }
    
    public String alta(Productos producto){
        try {
        boolean existeCodigo = ComprobarCodigoExistente(producto.getCodigoProducto());
            if (existeCodigo) {
                return "El codigo introducido ya existe en la base de datos"; 
            }
        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);
        db.store(producto);
        db.close();
        
        return "Datos insertados correctamente en la base de datos";
        }
        catch (Exception e) {
            return "Ha habido un error al conectar con la base de datos" + e.getMessage();
        }
    }
    
    private boolean ComprobarCodigoExistente(int CodigoProducto){
        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);
        Productos productoConsulta = new Productos(CodigoProducto, null, 0, null);
        
        ObjectSet<Productos> resultadoConsulta = db.queryByExample(productoConsulta);
        
        if (resultadoConsulta.isEmpty()) {
            db.close();
            return false; 
        }
        
        db.close();
        return true;
    }
    
    public String Mostrar(){
        String resultado = "";
        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);
        Productos productoConsulta = new Productos();
        
        ObjectSet<Productos> resultadoConsulta = db.queryByExample(productoConsulta);
        
        if (resultadoConsulta.isEmpty()) {
            db.close();
            return "No existen datos en la base de datos.";  
        }
        
        while(resultadoConsulta.hasNext()){
            Productos p = (Productos)resultadoConsulta.next();
            resultado += p.getCodigoProducto() + "\t" + p.getNombre() + "\t" + p.getCantidad() + "\t" + p.getDescripcion() + "\n";
        }
        
        db.close();
        
        return resultado;
    }
    
    public String borrar(int codigoProducto){
        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);
        
        Productos productoBorrar = new Productos(codigoProducto, null, 0, null);
        ObjectSet<Productos> resultadoBorrar = db.queryByExample(productoBorrar);
        
        if (resultadoBorrar.isEmpty()) {
            db.close();
            return "No se ha encontrado ningun producto con dicho código.";    
        }
        
        db.delete(resultadoBorrar.next());
        db.close();
        return "Articulo borrado correctamente";
    }
    
    public String Modificar(int codigoProducto, String nombre, int cantidad, String descripcion){
        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);
        
        Productos productoModificar = new Productos(codigoProducto, null, 0, null);
        ObjectSet<Productos> resultadoModificar = db.queryByExample(productoModificar);
        
        if (resultadoModificar.isEmpty()) {
            db.close();
            return "No se ha encontrado ningun producto con dicho código.";
    }
        Productos p = resultadoModificar.next();
        if ((nombre != null && nombre.length() > 0)) {
            p.setNombre(nombre);
        }
        
        if (cantidad != 0) {
            p.setCantidad(cantidad);
        }
        
        if (descripcion != null && descripcion.length() > 0) {
            p.setDescripcion(descripcion);
        }
        
        db.store(p);
        db.close();
        
        return "Se ha modificado el producto correctamente.";
        
}
    public Productos buscar(int codigoProducto){
         db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);
         String resultado = "";
         
         Productos productoBuscar = new Productos(codigoProducto, null, 0, null);
         ObjectSet<Productos> resultadoModificar = db.queryByExample(productoBuscar);
         
         if (resultadoModificar.isEmpty()) {
            db.close();
            return null;
    }
         db.close();
         return (Productos)resultadoModificar.next();
}
}


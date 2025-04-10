public class TicketSoporte {
    private int id;
    private static int contador = 1000; // ID base
    private String descripcion;
    private String estado;
    private String fechaCreacion;
    private Usuario usuario;
    private String tecnico;

    public TicketSoporte(String descripcion, String fechaCreacion, Usuario usuario) {
        this.descripcion = descripcion;
        this.estado = "abierto";
        this.fechaCreacion = fechaCreacion;
        this.id = ++contador;
        this.usuario = usuario;
    }
    public TicketSoporte(String descripcion, String fechaCreacion) { //constructor sin usuario
        this.descripcion = descripcion;
        this.estado = "abierto";
        this.fechaCreacion = fechaCreacion;
        this.id = ++contador;
    }



    public void cerrarTicket(){
        this.estado = "cerrado";
    }

    public String getEstado(){
        return estado;
    }

    public void mostrarDetalle(){ //ver si no hay que usar toString()
        if(usuario != null && tecnico == null){
            System.out.println("id:" + this.id + " descripcion:" + this.descripcion + " estado:" + this.estado
                    + " fechaCreacion:" + this.fechaCreacion + " nombre de usuario:" + usuario.getNombre() + " email:" + usuario.getEmail());
        }
        else if(usuario == null && tecnico == null){
            System.out.println("id:" + this.id + " descripcion:" + this.descripcion + " estado:" + this.estado
                    + " fechaCreacion:" + this.fechaCreacion);
        }
        if(tecnico != null){
            System.out.println("id:" + this.id + " descripcion:" + this.descripcion + " estado:" + this.estado
                    + " fechaCreacion:" + this.fechaCreacion + " nombre de usuario:" + usuario.getNombre() + " email:" + usuario.getEmail()
            + " tecnico asignado:" + tecnico);
        }
    }

    public void asignarTecnico(int tecnicoElegido){
        if(tecnicoElegido == 1){
            System.out.println("Derivando consulta con sector de frontend...");
            this.tecnico = "frontend";
        }else if(tecnicoElegido == 2){
            System.out.println("Derivando consulta con sector de backend...");
            this.tecnico = "backend";
        }else if(tecnicoElegido == 3){
            System.out.println("Derivando consulta con sector de bases de datos...");
            this.tecnico = "database";
        }else if(tecnicoElegido == 4){
            System.out.println("Derivando consulta con sector general...");
            this.tecnico = "general";
        }
    }


}

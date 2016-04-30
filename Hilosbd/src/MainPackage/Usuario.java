package MainPackage;

public class Usuario {

    String Nombre, Correo;
    int Id;

    public Usuario() {

    }

    public Usuario(int id, String Nombre, String Correo) {
        this.Id = id;
        this.Nombre = Nombre;
        this.Correo = Correo;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public void setNombre(String name) {
        this.Nombre = name;
    }

    public void setCorreo(String correo) {
        this.Correo = correo;
    }

    public int getid() {
        return this.Id;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getCorre() {
        return this.Correo;
    }
    
    String[] getRow() {
        String [] row = new String[3];
        row[0] = String.valueOf(Id);
        row[1] = Nombre;
        row[2] = Correo;
        return row;
    }
    
}

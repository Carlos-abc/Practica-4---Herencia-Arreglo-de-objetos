public abstract class Pajaroo {
    
    String nombre,genero, color, tamano, alcance;

    public Pajaroo(String nombre, String genero, String color, String tamano, String alcance){

        this.nombre = nombre;
        this.genero = genero;
        this.color = color;
        this.tamano = tamano;
        this.alcance = alcance;

    }

    public String getNombre(){

        return nombre;
    }
    
    public String getGenero(){

        return genero;
    }
    public String getColor(){

        return color;
    }
    public String getTamano(){

        return tamano;
    }
    public String getAlcance(){

        return alcance;
    }
    public String getVuelo(){

        return "vuela mucho...";
    }
    public String getCome(){

        return "come mucho...";
    }

    public abstract String getPoder1R();
    public abstract String getPoder2R();

    public abstract String getPoder1C();
    public abstract String getPoder2C();

    public abstract String getPoder1B();
    public abstract String getPoder2B();
    
}

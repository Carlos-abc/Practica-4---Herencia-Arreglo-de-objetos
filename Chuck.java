public class Chuck extends Pajaroo{
    
    public Chuck(String nombre, String genero, String color, String tamano, String alcance){

        super(nombre, genero, color, tamano, alcance);

    }

    public String getPoder1C(){

        return "aceleracion";
    }

    public String getPoder2C(){

        return "target point";

    }
    public String getPoder1R(){

        return "Target Point";
    }

  
    public String getPoder2R(){

        return "Sable de luz";

    }
    public String getPoder1B(){

        return "explosion";
    }

    public String getPoder2B(){

        return "empujon fuerza";
    }
}

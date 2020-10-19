public class Ejecuta {
    
    public static void main(String[] args) {
  
          Pajaroo arregloPajaros[] = new Pajaroo[3];
  
           arregloPajaros[0] = new Red("RED","Hombre","Rojo","Mediano","Normal");
           arregloPajaros[1] = new Bomb("BOMB","Hombre","Negro","Grande","Normal");
           arregloPajaros[2] = new Chuck("CHUCK","Hombre","Amarillo","Mediano","Normal");
        
  
           
           for(int i=0; i<arregloPajaros.length; i++){
  
              
              System.out.println("Nombre: "+arregloPajaros[i].getNombre());
              System.out.println("Genero: "+arregloPajaros[i].getGenero());
              System.out.println("Color: "+arregloPajaros[i].getColor());
              System.out.println("Tamano: "+arregloPajaros[i].getTamano());
              System.out.println("Alcance: "+arregloPajaros[i].getAlcance());
              
      

              if(i == 0){

                  System.out.println("Red "+arregloPajaros[i].getVuelo());
                  System.out.println("Red "+arregloPajaros[i].getCome());
                  System.out.println("El primer poder de Red es: "+arregloPajaros[i].getPoder1R());
                  System.out.println("El segundo poder de Red es: "+arregloPajaros[i].getPoder2R());
                  System.out.println();
              }

              
              
              if(i == 1){

                  System.out.println("Bomb "+arregloPajaros[i].getVuelo());
                  System.out.println("Bomb "+arregloPajaros[i].getCome());
                  System.out.println("El primer poder de Bomb es: "+arregloPajaros[i].getPoder1B());
                  System.out.println("El segundo poder de Bomb es: "+arregloPajaros[i].getPoder2B());
                  System.out.println();
              }

              if(i == 2){

                  System.out.println("Chuck "+arregloPajaros[i].getVuelo());
                  System.out.println("Chuck "+arregloPajaros[i].getCome());
                  System.out.println("El primer poder de Chuck es: "+arregloPajaros[i].getPoder1C());
                  System.out.println("El segundo poder de Chuck es: "+arregloPajaros[i].getPoder2C());
                  System.out.println();
              }

           }
  
      }
}

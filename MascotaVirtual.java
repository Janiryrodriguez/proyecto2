    class MascotaVirtual{
        public String color;
        protected String nombre;
        public String  misiones;
        private Integer energia;
        public Integer felicidad;
        public String dormir;
        public String hacerSonido;
        public String mostrarEstado;
        public String dibujar;
        
        public MascotaVirtual(String nombreElegido){

         nombre=nombreElegido;
         energia=50;
         felicidad=100;
        
         System.out.print ("Bienvenido al mundo ");
         System.out.println (nombreElegido);

        }

        public void hacerSonido(){

        }

        public void salta() {
            System.out.print(nombre);
             System.out.println (" esta saltando");
             energia=energia-5;   
              
             System.out.print ("el nivel de energia bajo a horas");
             System.out.println (energia);

        }
       

        public void comer() {
            System.out.println ("la mascota esta comiendo");
            energia=energia+5;

            System.out.print("el nivel de energia subio");
            System.out.println (energia);

                
        }

        public void saludar (MascotaVirtual quienSaludar){
            System.out.println("Hola saludos");
            System.out.println(quienSaludar.nombre);

            System.out.println("Que hay de nuevo");
        }

        public void setEnergia(Integer energiaElegida){
            if(energiaElegida>100);
              System.out.println("ERROR:la energia debe estar 1-100");

              
 //           else
                energia=energiaElegida;

        }
        
        public void getEnergia(){
            System.out.println("El nivel de energia de ");
            System.out.println(nombre);
            System.out.println("es de");
            System.out.println(energia);

        }
          
        public void dormir(){
            if (!necesitaDescanso()){
                System.out.println (nombre +"no tiene sueño");
                return;
            }
                recuperarEnergia(50);
                ajustarFelicidad(5);
                System.out.println(nombre + "durmio y se renovo");

        }

        private boolean necesitaDescanso(){
            return energia<30;

        }

        private void recuperarEnergia(int puntos){
            setEnergia(energia+puntos);
            
        }

        private void ajustarFelicidad(int puntos){
            felicidad=felicidad + puntos;
            if (felicidad>100)  felicidad=100;
            if (felicidad<0)   felicidad=0;

        }
 
        public void mostrarEstado(){
            System.out.println(nombre);
            System.out.println("Energia:[" + barra(energia)+"]");
            System.out.println("Felicidad:[" + barra(felicidad)+"]");
        }
        
        private String barra(int valor){
            String color;
            if (valor>=60)
                 color=Coloress.VERDE;
          else if(valor>=30)
                 color=Coloress.AMARILLO;
          else
                color=Coloress.ROJO;
        int llenos=valor/10;
        return color+"\u2588".repeat(llenos)+"   "+
             Coloress.RESET + valor;
        }
        
        public void dibujar(){
           System.out.println("¿?");
           System.out.println("¿?"); (<-mascota desconocida);
        }

    }
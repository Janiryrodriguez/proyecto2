class CreadorObjeto {
     public static void main(String[] args){
        MascotaVirtual [] refugio={
         new Perro ("Rocky"),
         new Gato ("Michi"),
         new Perro ("Kira"),
         new  Gato ("Tuluz"),
         new Pollito("Lalo")
        };

        for(MascotaVirtual m:refugio){
         m.hacerSonido();
         m.mostrarEstado();

        }
    }   

}

public class Controle {
    Integer volumeMaximo=100, volumeMinimo=0;
    
    ControleRemoto c = new ControleRemoto();

void aumentarVolume(){
    Integer volume = c.getVolume();
    if(volume < volumeMaximo){
       volume++;
       c.setVolume(volume);
    }else{
        System.out.println("Volume já está no máximo");
    } 
}
    
    void diminuirVolume(){
        Integer volume = c.getVolume();
    if(volume < volumeMinimo){
       volume--;
       c.setVolume(volume);
    }else{
        System.out.println("Volume já está no minimo");
    } 
} 
    }

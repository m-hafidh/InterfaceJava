
//Interface
interface Animal{
    // la methode interface sans  le corp ou parametr
    public void animalSound();
    public void slepp();
}

//on implemente lecochon dans l'interface Animal

class Cochon implements Animal{
    public void animalSound(){

        // le corp ou parametre de de animalsound est fourni ici 
        System.out.println("le cochon dit : wee wee");
    }
    public void slepp(){
    // le corp de sleep est inserer ici 
    System.out.println("zzzz");
    }
}

//classe main 
class Main {
    public static void main(String[] args) {
        Cochon monCochon = new Cochon(); // crrer un nobjet 
        monCochon.animalSound();
        monCochon.slepp();
    }
}

// plusieurs interfaces 
 
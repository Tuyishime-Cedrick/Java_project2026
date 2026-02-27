public class Planete {
       // variables d'instance( attributs)
        private String nom;
        private double rayon; // en kilometre
        
       //Constructeur
        public Planete(String n, double r){
                nom = n;
                rayon = r;
        }
        
        //Méthodes
        public String toString(){
                String s="Planete "+nom;
                s+=" de rayon "+ rayon;
                return s;
        }
        public double getRayon(){
                return rayon;
        }
}

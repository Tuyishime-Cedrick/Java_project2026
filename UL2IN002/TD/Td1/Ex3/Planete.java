public class Planete {
       // variables d'instance( attributs)
        private String nom;
        private double rayon; // en kilometre
        
       //Constructeurs
        public Planete(String n, double r){
                nom = n;
                rayon = r;
        }
        
        public Planete(String n){
                nom = n;
                rayon = 1000;
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

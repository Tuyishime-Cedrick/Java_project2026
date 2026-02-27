public class SystemeSolaire {
        public static void main(String[] args){
                //création des objets(ou instance)
                Planete p1= new Planete("Mercure", 2439.7);
                Planete p2= new Planete("Terre", 6378.1);
                //affiche la valeur de retour de la méthod toString() et getRayon()
                System.out.println(p1.toString());
                System.out.println("rayon de la terre "+p2.getRayon());
                
                
        }
}  

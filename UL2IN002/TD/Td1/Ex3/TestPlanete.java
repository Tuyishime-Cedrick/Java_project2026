public class TestPlanete {
        public static void main(String[] args){
                Planete p1= new Planete("Mercure");
                Planete p2= new Planete("Terre", 6378.1);
                //affiche la valeur de retour de la méthod toString() et getRayon()
                System.out.println(p1.toString());
                System.out.println(p2.toString());
                System.out.println("rayon de la terre "+p2.getRayon());
                
                
        }
        
}

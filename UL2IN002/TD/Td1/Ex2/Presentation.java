public class Presentation {
        public static void main(String[] args){
                Personne p1 = new Personne("Paul", 25);
                Personne p2 = new Personne("Pierre", 37);
                
                System.out.println(p2.toString());
                p1.sePresenter();
                System.out.println(p1.getAge());
                int i=0;
                for(i=0; i<20; i++){
                   p1.vieillir();
                   
                } 
                p1.vieillir();
                 while(i<10){
                   p2.vieillir();
                   i++;
                }
                
                
        }
}

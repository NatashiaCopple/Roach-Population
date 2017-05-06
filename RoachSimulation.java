
/*
 * Natashia Copple Lab #1 Part 2 - Roach Population 
 */
public class RoachSimulation
{
    public static void main(String[] args){
        RoachPop pop = new RoachPop(10);
        System.out.println("Initial roach population is " + pop.getRoaches()); //print intial roach population 
        //breed, spay at 10 percent and print out 3 times
        pop.breed();
        pop.spray(10);
        System.out.println("After 1st round the roach population is " + pop.getRoaches());
        pop.breed();
        pop.spray(10);
        System.out.println("After 2nd round the roach population is " + pop.getRoaches());
        pop.breed();
        pop.spray(10);
        System.out.println("After 3rd round the roach population is " + pop.getRoaches());
        //3rd print out number isn't as clean looking as I would like, but book didn't secify it had to be 
    }
}

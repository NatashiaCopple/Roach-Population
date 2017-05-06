
/**
 * Natashia Copple Lab #1 Part 2 - Roach Population 
 */
public class RoachPop
{
    double population = 0;  //variable to track roach population 

    public RoachPop(float intSize)
    {
        population = intSize;  //set intial size to population variable
    }
    public void breed (){
        population *= population;  //double size of population 
    }
    public void spray(double percent){
        double sizePercent = population/percent;  //determine size of percent that needs subrtracted from roach population 
        population = population - sizePercent;  //subtratct percentage size from roach population 
    }
    public double getRoaches(){
        return population;  //return roach population size
    }
}

package fasad_design_pattern;

interface Animal { 
    void feed(); 
}

class Lion implements Animal { 
    @Override 
    public void feed() { 
        System.out.println("The lion is being fed!"); 
    } 
} 
 
class Wolf implements Animal { 
    @Override 
    public void feed() { 
        System.out.println("The wolf is being fed!"); 
    } 
} 
 
class Bear implements Animal { 
    @Override 
    public void feed() { 
        System.out.println("The bear if being fed!"); 
    } 
}

class ZooKeeper { 
    private Animal lion; 
    private Animal wolf; 
    private Animal bear; 
 
    public ZooKeeper() { 
        lion = new Lion(); 
        wolf = new Wolf(); 
        bear = new Bear(); 
    } 
 
    public void feedLion() { 
        lion.feed(); 
    } 
 
    public void feedWolf() { 
        wolf.feed(); 
    } 
    
    public void feedBear() { 
        bear.feed(); 
    } 
} 

public class FasadPattern {
    public static void main(String[] args) { 
        ZooKeeper zookeeper = new ZooKeeper(); 
        
        zookeeper.feedLion(); 
        zookeeper.feedWolf(); 
        zookeeper.feedBear(); 
    } 
}

package stack.and.queue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalShlterTest {
    @Test public void animalShlterTestEnqueue(){
        Cats cat = new Cats("Mew",2.4,"anything","anything");
        Dogs dog = new Dogs("anything",2.5,"anything","anything");
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(cat);
        animalShelter.enqueue(dog);

        assertEquals("Animal Shelter => { cats = front -> { {name='Mew', age=2.4, species='anything', color='anything'} } -> Null , dogs = front -> { {name='anything', age=2.5, species='anything', color='anything'} } -> Null }",animalShelter.toString());
    }
    @Test public void animalShlterTestDequeue(){
        Cats cat = new Cats("Mew",2.4,"anything","anything");
        Dogs dog = new Dogs("anything",2.5,"anything","anything");
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(cat);
        animalShelter.enqueue(dog);

        assertEquals("Animal Shelter => { cats = front -> { {name='Mew', age=2.4, species='anything', color='anything'} } -> Null , dogs = front -> { {name='anything', age=2.5, species='anything', color='anything'} } -> Null }",animalShelter.toString());

        //dequeue
        animalShelter.dequeue("cat");
        assertEquals("Animal Shelter => { cats = front -> Null , dogs = front -> { {name='anything', age=2.5, species='anything', color='anything'} } -> Null }",animalShelter.toString());
    }


}

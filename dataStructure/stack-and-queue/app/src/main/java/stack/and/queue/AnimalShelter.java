package stack.and.queue;

public class AnimalShelter {
    Queue cats =new Queue();
    Queue dogs =new Queue();

    public AnimalShelter() {

    }

    public void enqueue(Animals animal){
        try {
            if(animal instanceof Cats)
                cats.enqueue(animal);
            else if(animal instanceof Dogs)
                dogs.enqueue(animal);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public Object dequeue(String pref){
        try {
            if (pref.toLowerCase() == "cat"){
                if (!cats.isEmpty())
                return  cats.deQueue();
            }else if (pref.toLowerCase() == "dog"){
                if (!dogs.isEmpty())
                return dogs.deQueue();
            }
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return null;
    }
    public Queue getCats() {
        return cats;
    }

    public void setCats(Queue cats) {
        this.cats = cats;
    }

    public Queue getDogs() {
        return dogs;
    }

    public void setDogs(Queue dogs) {
        this.dogs = dogs;
    }
    @Override
    public String toString() {
        return "Animal Shelter => { " +
                "cats = " + cats + " " +
                ", dogs = " + dogs+ " " +
                '}';
    }
}

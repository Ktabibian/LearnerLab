package lengthylearner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    private List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        Person person = null;
        for(Person lad : personList){
            if(lad.getId() == id){
                person = lad;
            }
        }
        return person;
    }

    public boolean contains(Person person){
        for(Person lad : personList){
            if(personList.contains(lad)){
                return true;
            }
        }
        return false;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        for(Person lad : personList){
            if(lad.getId() == id){
                personList.remove(lad);
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Object[] toArray(){
        return personList.toArray(new Person[personList.size()]);
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }

}

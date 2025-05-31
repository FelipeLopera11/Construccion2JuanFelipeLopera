
package veterinaria.adapters.Persons;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import veterinaria.adapters.Persons.entity.PersonEntity;
import veterinaria.domain.models.Person;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import veterinaria.Ports.PersonPort;
import veterinaria.adapters.Persons.repository.PersonRepository;

@Setter
@Getter
@NoArgsConstructor
@Service
public class PersonAdapter implements PersonPort {
    
    @Autowired
    private PersonRepository personRepository;
    @Override
    public boolean existPerson(long id){
        return personRepository.existsById(id);
    }
    
    @Override
    public void savePerson(Person person){
        PersonEntity personEntity = personAdapter(person);
        personRepository.save(personEntity);
        person.setId(personEntity.getId());
    }

    @Override
    public Person findById(long id){
        PersonEntity personEntity = personRepository.findById(id);
        return personAdapter(personEntity);
    }
    
    private Person personAdapter(PersonEntity personEntity){
        Person person = new Person();
        person.setId(personEntity.getId());
        person.setName(personEntity.getName());
        person.setAge(personEntity.getAge());
        person.setRole(personEntity.getRole());
        return person;
    }
    
    private PersonEntity personAdapter(Person person){
        PersonEntity personEntity = new PersonEntity();
        personEntity.setId(person.getId());
	personEntity.setName(person.getName());
	personEntity.setAge(person.getAge());
	personEntity.setRole(person.getRole());
	return personEntity;
    }


}


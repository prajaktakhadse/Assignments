package com.sbJPA_CRUD.repository;

//2nd step-----------------
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sbJPA_CRUD.model.Book;

@Repository                       //connection krun deto data kadne n push krne.
public interface Bookrepo extends JpaRepository< Book , Integer>{
                    //kutla table trace krycha hae to   //pk cha datatype
}

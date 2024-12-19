package com.xworkz.commonModule.repository;

import com.xworkz.commonModule.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{
    @Autowired
    private EntityManagerFactory emf;

    @Override
    public boolean save(UserEntity userEntity) {
        System.out.println("data in repoImpl=="+userEntity);
        EntityManager entityManager=emf.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

       try{
           entityTransaction.begin();
           entityManager.persist(userEntity);
           entityTransaction.commit();
       } catch (Exception e) {
           if(entityTransaction.isActive()){
               entityTransaction.rollback();
           }
       }
       finally{
           entityManager.close();

       }
        return true;
    }
    @Override
    public List<UserEntity> getAll(String email, String password) {

        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        List<UserEntity> list= em.createNamedQuery("getAll").setParameter("setEmail",email).setParameter("setPassword",password).getResultList();
        try{
            et.begin();

            et.commit();
        }
        catch(Exception e)
        {
            if(et.isActive())
            {
                et.rollback();
            }

        }
        finally {
            em.close();
            //` emf.close();
        }

        if(!list.isEmpty())
        {
            return list;
        }

        return null;
    }
}

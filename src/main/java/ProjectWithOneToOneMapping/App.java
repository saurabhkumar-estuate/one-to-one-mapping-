package ProjectWithOneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.Answer;
import com.mapping.Question;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration config = new Configuration();
        config.configure("saurabh.xml");
        SessionFactory fact=config.buildSessionFactory();
         
        
        
//        Question q1 = new Question();
//        q1.setQuestion("java question");
//        q1.setQuestionId(234);
//        q1.setAnswer(null);
        
        Answer a1 = new Answer();
        a1.setAnswer("programming language");
        a1.setAnswer_id(343);
        
        Question q1 = new Question();
        q1.setQuestion("java question");
        q1.setQuestionId(234);
        q1.setAnswer(a1);
        
        Session s1 =  fact.openSession();
        Transaction tx=s1.beginTransaction();
        
        
        s1.save(q1);
        s1.save(a1);
         
        
   
        tx.commit();
        s1.close();
        fact.close();
      
    }
}

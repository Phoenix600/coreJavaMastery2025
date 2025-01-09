package section16_abstract_class_in_oop;

abstract class JavaPersistenceAPI
{
    // constructor
    public JavaPersistenceAPI()
    {
        System.out.println("JavaPersistenceAPI object is created");
    }

    // concrete method
    public void getInfo()
    {
        System.out.println("JavaPersistenceAPI Version 1.0.0");
    }

    // abstract methods
    abstract void findAll();
    abstract void findById();
    abstract void count();
    abstract void save();
    abstract void saveAll();
    abstract void delete();
    abstract void deleteAll();
}

class MySQLPersistenceImplementation extends JavaPersistenceAPI
{

    public MySQLPersistenceImplementation()
    {
        super(); // this should be first line always for inheritance
        System.out.println("MySQLPersistenceImplementation object is created");
    }

    @Override
    void findAll() {
        System.out.println("FindAll called For MySQLPersistenceImplementation");
    }

    @Override
    void findById() {
        System.out.println("FindById called For MySQLPersistenceImplementation");
    }

    @Override
    void count() {
        System.out.println("Count called For MySQLPersistenceImplementation");
    }

    @Override
    void save() {
        System.out.println("Save called For MySQLPersistenceImplementation");
    }

    @Override
    void saveAll() {
        System.out.println("SaveAll called For MySQLPersistenceImplementation");
    }

    @Override
    void delete() {
        System.out.println("Delete called For MySQLPersistenceImplementation");
    }

    @Override
    void deleteAll() {
        System.out.println("DeleteAll called For MySQLPersistenceImplementation");
    }
}

class PostGreSQLPersistence extends JavaPersistenceAPI
{
    public PostGreSQLPersistence()
    {
        super(); // this should be first line always for inheritance
        System.out.println("PostGreSQLPersistence object is created");
    }

    @Override
    void findAll() {
        System.out.println("FindAll called For PostGreSQLPersistence");
    }

    @Override
    void findById() {
        System.out.println("FindById called For PostGreSQLPersistence");
    }

    @Override
    void count() {
        System.out.println("Count called For PostGreSQLPersistence");
    }

    @Override
    void save() {
        System.out.println("Save called For PostGreSQLPersistence");
    }

    @Override
    void saveAll() {
        System.out.println("SaveAll called For PostGreSQLPersistence");
    }

    @Override
    void delete() {
        System.out.println("Delete called For PostGreSQLPersistence");
    }

    @Override
    void deleteAll() {
        System.out.println("DeleteAll called For PostGreSQLPersistence");
    }
}

public class Example4 {
    public static void main(String[] args) {

    }
}

package Task3.DataAccess;

import Task3.Entities.Educator;

public class HibernateEducatorDao implements IEducatorDao{
    @Override
    public void add(Educator educator) {
        System.out.println("Hibernate added: "+educator.getEducatorName());
    }

    @Override
    public void del(Educator educator) {
        System.out.println("Hibernate deleted: "+educator.getEducatorName());
    }

    @Override
    public void update(Educator educator) {
        System.out.println("Hibernate updated: "+educator.getEducatorName());
    }
}

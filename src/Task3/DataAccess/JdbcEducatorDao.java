package Task3.DataAccess;

import Task3.Entities.Educator;

public class JdbcEducatorDao implements IEducatorDao{
    @Override
    public void add(Educator educator) {
        System.out.println("Jdbc added: "+educator.getEducatorName());
    }

    @Override
    public void del(Educator educator) {
        System.out.println("Jdbc deleted: "+educator.getEducatorName());
    }

    @Override
    public void update(Educator educator) {
        System.out.println("Jdbc updated: "+educator.getEducatorName());
    }
}

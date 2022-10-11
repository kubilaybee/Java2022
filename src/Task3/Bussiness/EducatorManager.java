package Task3.Bussiness;

import Task3.Core.Logging.ILogger;
import Task3.DataAccess.IEducatorDao;
import Task3.Entities.Educator;

public class EducatorManager {
    private IEducatorDao educatorDao;
    private ILogger[] educatorLoggers;

    public EducatorManager(IEducatorDao educatorDao, ILogger[] loggers) {
        this.educatorDao = educatorDao;
        this.educatorLoggers = loggers;
    }

    public void add(Educator educator){
        this.educatorDao.add(educator);
        System.out.println(educator.getEducatorName()+ " "+ educator.getEducatorSurname()+" added!");
        for (ILogger logger : educatorLoggers){
            logger.log(educator.getEducatorName()+ " "+educator.getEducatorSurname());
        }
    }
    public void delete(Educator educator){
        this.educatorDao.del(educator);
        System.out.println(educator.getEducatorName()+" "+educator.getEducatorSurname()+" deleted!");
    }
    public void update(Educator educator){
        this.educatorDao.update(educator);
        System.out.println(educator.getEducatorName()+" "+educator.getEducatorSurname()+" updated!");
    }
}

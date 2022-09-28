package InheritanceDemo;

public class Main {
    public static void main(String[] args){
        FarmingCreditManager farmingCreditManager = new FarmingCreditManager();
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        SoldierCreditManager soldierCreditManager = new SoldierCreditManager();
        CreditUI creditUI = new CreditUI();
        creditUI.creditCalculator(farmingCreditManager);
        creditUI.creditCalculator(teacherCreditManager);
        creditUI.creditCalculator(soldierCreditManager);
    }
}

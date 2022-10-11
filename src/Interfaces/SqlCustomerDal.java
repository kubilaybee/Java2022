package Interfaces;

public class SqlCustomerDal implements ICustomerDal{
    @Override
    public void Add() {
        System.out.printf("Sql added");
    }
}

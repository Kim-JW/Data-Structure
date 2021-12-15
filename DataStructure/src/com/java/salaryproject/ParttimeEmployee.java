package com.java.salaryproject;

import java.sql.Date;

public class ParttimeEmployee extends Employee{
    
    private String exitdate;
    
    public ParttimeEmployee(){

    }
    
    public ParttimeEmployee(String employee_name, int employee_id, String employee_department, int employee_pw,
			String employee_startdate, double employee_pay, Position employee_position, int employee_contract,
			String exitdate) {
		super(employee_name, employee_id, employee_department, employee_pw, employee_startdate, employee_pay,
				employee_position, employee_contract);
		this.exitdate = exitdate;
	}


	public String getExitdate() {
        return exitdate;
    }
    public void setExitdate(String exitdate) {
        this.exitdate = exitdate;
    }

	@Override
	public String toString() {
		return "ParttimeEmployee [exitdate=" + exitdate + ", getExitdate()=" + getExitdate() + ", getMoneyPay()="
				+ getMoneyPay() + ", getEmployee_contract()=" + getEmployee_contract() + ", getEmployee_position()="
				+ getEmployee_position() + ", getEmployee_pay()=" + getEmployee_pay() + ", getEmployee_name()="
				+ getEmployee_name() + ", getEmployee_id()=" + getEmployee_id() + ", getEmployee_department()="
				+ getEmployee_department() + ", getEmployee_pw()=" + getEmployee_pw() + ", getEmployee_startdate()="
				+ getEmployee_startdate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
    

    
}
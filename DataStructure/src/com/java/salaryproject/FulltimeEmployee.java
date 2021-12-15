package com.java.salaryproject;

public class FulltimeEmployee extends Employee{

    private int bonus;

    
    public FulltimeEmployee(String employee_name,
    		int employee_id,
    		String employee_department,
    		int employee_pw,
			String employee_startdate,
			double employee_pay,
			Position employee_position,
			int employee_contract,
			int bonus) {
		super(employee_name, employee_id, employee_department, employee_pw, employee_startdate, employee_pay,
				employee_position, employee_contract);
		this.bonus = bonus;
	}

//	public FulltimeEmployee(int bonus){
//        this.bonus = bonus;
//    }

    @Override
    public double getMoneyPay(){
        return (double)super.getEmployee_pay()/12 + (double)bonus/12;
    }

	@Override
	public String toString() {
		return "FulltimeEmployee [bonus=" + bonus + ", getMoneyPay()=" + getMoneyPay() + ", getEmployee_contract()="
				+ getEmployee_contract() + ", getEmployee_position()=" + getEmployee_position() + ", getEmployee_pay()="
				+ getEmployee_pay() + ", getEmployee_name()=" + getEmployee_name() + ", getEmployee_id()="
				+ getEmployee_id() + ", getEmployee_department()=" + getEmployee_department() + ", getEmployee_pw()="
				+ getEmployee_pw() + ", getEmployee_startdate()=" + getEmployee_startdate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
    
    
}

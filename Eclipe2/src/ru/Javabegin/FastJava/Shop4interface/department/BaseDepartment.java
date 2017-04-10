package ru.Javabegin.FastJava.Shop4interface.department;

import java.util.ArrayList;

import ru.Javabegin.FastJava.Shop4interface.interfaces.BaseEmployee;
import ru.Javabegin.FastJava.Shop4interface.interfaces.BaseGoods;
import ru.Javabegin.FastJava.Shop4interface.interfaces.DepartmentInterface;

public class BaseDepartment implements DepartmentInterface {
	private String name;
	private ArrayList<BaseEmployee> employeeList;
	private ArrayList<BaseGoods> goodsList;

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public ArrayList<BaseEmployee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<BaseEmployee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public ArrayList<BaseGoods> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(ArrayList<BaseGoods> goodsList) {
		this.employeeList = goodsList;
	}

}

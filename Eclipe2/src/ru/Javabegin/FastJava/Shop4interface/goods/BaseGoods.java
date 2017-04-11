package ru.Javabegin.FastJava.Shop4interface.goods;

import ru.Javabegin.FastJava.Shop4interface.department.BaseDepartment;
import ru.Javabegin.FastJava.Shop4interface.interfaces.DepartmentInterface;
import ru.Javabegin.FastJava.Shop4interface.interfaces.GoodsInterface;

public class BaseGoods implements GoodsInterface {
	private double price;
	private boolean hasGuarantee;
	private String name;
	private BaseDepartment department;
	private String company;

	@Override
	public double getprice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean hasGuarantee() {
		return hasGuarantee;
	}

	public void setHasGuarantee(boolean hasGuarantee) {
		this.hasGuarantee = hasGuarantee;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public DepartmentInterface getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return null;
	}

}

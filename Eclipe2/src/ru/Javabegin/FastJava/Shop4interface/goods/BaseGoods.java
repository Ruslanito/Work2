package ru.Javabegin.FastJava.Shop4interface.goods;

import ru.Javabegin.FastJava.Shop4interface.interfaces.DepartmentInterface;
import ru.Javabegin.FastJava.Shop4interface.interfaces.GoodsInterface;

public class BaseGoods  implements GoodsInterface{

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasGuarantee() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
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

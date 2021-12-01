package com.spring.problem04;

public class Energy {
	double mm=0;
	double mv=0;
	double mh=0;
	

	public double getMm() {
		return mm;
	}
	public void setMm(double mm) {
		this.mm = mm;
	}
	public double getMv() {
		return mv;
	}
	public void setMv(double mv) {
		this.mv = mv;
	}
	public double getMh() {
		return mh;
	}
	public void setMh(double mh) {
		this.mh = mh;
	}
	public double Kinetic_E()
	{
		return 0.5*mm*mv*mv;
	}
	public double Potential_E()
	{
		return mm*9.8*mh;
	}
}
